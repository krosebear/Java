package com.kramirez.Lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kramirez.Lookify.models.Song;
import com.kramirez.Lookify.services.SongService;

@Controller
public class HomeController {
	private final SongService songserv;
	
	public HomeController(SongService songserv) {
		this.songserv = songserv;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/dashboard")
	public String dash(@ModelAttribute("song") Song song, Model model) {
		model.addAttribute("songs", songserv.allSongs());
		return "dashboard";
	}
	@RequestMapping("/search/topTen")
	public String top(@ModelAttribute("song") Song song, Model model) {
		model.addAttribute("songs", songserv.topTenSongs());
		return "topTen";
	}
	@RequestMapping("/songs/new")
	public String newsong(@Valid @ModelAttribute("song") Song song, Model model) {
		model.addAttribute("songs", songserv.allSongs());
		return "newsongpage";
	}
	 @PostMapping("/song/newOne")
	    public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
	        if (result.hasErrors()) {
	            return "newsongpage";
	        }else{
	        	songserv.addSong(song);
	            return "redirect:/dashboard";
	        }
	    }
	 @RequestMapping("/songs/{id}")
	 public String showSong(@PathVariable("id") Long id, Model model) {
		 model.addAttribute("song", songserv.findSongById(id));
		 return "showsong";
	 }
	 @RequestMapping("/delete/{id}")
	 public String deleteSong(@PathVariable("id") Long id) {
		 songserv.destroySong(id);
		 return "redirect:/dashboard";
	 }
	 @PostMapping("/search")
	 public String search(@RequestParam("artist") String artist) {
		 return "redirect:/search/".concat(artist);
		 
	 }
	 @RequestMapping("/search/{artist}")
	 public String search(@PathVariable("artist") String artist, Model model) {
		 model.addAttribute("artist", songserv.searchAll(artist));
		 List<Song> search = songserv.searchAll(artist);
		 if(search.isEmpty()) {
			 return "redirect:/dashboard";
		 }else {
			 model.addAttribute("search", songserv.searchAll(artist));
			 return "search";
		 }
	 }
}
