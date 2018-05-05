package com.kramirez.Lookify.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;


@Entity
public class Song {
	@Id
    @GeneratedValue
    private Long id;
	@Column
	@Size(min = 2, max = 20)
    private String name;
	@Column
    @Size(min = 2, max = 200)
    private String artist;
	@Column
    @Max(10)
    private int rating;
	
	public Song(Long id, String name, String artist, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.rating = rating;
	}
	public Song() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}


}
