package com.kramirez.JFBlackBelt.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.servlet.http.HttpSession;

@Entity
@Table(name="ideas")
public class Idea {
	@Id
	@GeneratedValue
	private Long id;

	
	private String randomIdea;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User createdBy;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name="likes_users",
		joinColumns = @JoinColumn(name="like_id"),
		inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> userLikes;
	
	private int likes;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
        this.likes= 0;
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    public Idea() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getRandomIdea() {
		return randomIdea;
	}
	public void setRandomIdea(String randomIdea) {
		this.randomIdea = randomIdea;
	}

	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public List<User> getUserLikes() {
		return userLikes;
	}
	public void setUserLikes(List<User> userLikes) {
		this.userLikes = userLikes;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

    
}
