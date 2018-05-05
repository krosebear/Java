package com.kramirez.Lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kramirez.Lookify.models.Song;
import com.kramirez.Lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepo;
	
	public SongService(SongRepository songRepo) {
		this.songRepo = songRepo;
	}
	public List<Song> allSongs(){
		return songRepo.findAll();
	}
	public List<Song> topTenSongs(){
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	public Song findSongById(Long id) {
		return songRepo.findOne(id);
	}
	public void addSong(Song song) {
		songRepo.save(song);
	}
	public void updateSong(Long id, Song song) {
		songRepo.save(song);
	}
	public void destroySong(Long id) {
		songRepo.delete(id);
	}
	public List<Song> searchAll(String query) {
		return songRepo.findByArtistContaining(query);
	}
}
