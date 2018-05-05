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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	@Size(min=3, message="Name must be more than 3 characters long")
	private String firstName;
	private String lastName;
	private String email;
	@Size(min=6, message="Password must be more than 6 characters long")
	private String password;

	
	@OneToMany(mappedBy="createdBy", fetch = FetchType.LAZY)
	private List<Idea> idea;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name="likes_users",
		joinColumns = @JoinColumn(name="user_id"),
		inverseJoinColumns = @JoinColumn(name = "like_id"))
	private List<Idea> ideas;
	

	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	public User() { }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public List<Idea> getIdeas() {
		return ideas;
	}
	public void setIdeas(List<Idea> ideas) {
		this.ideas = ideas;
	}
	public List<Idea> getIdea() {
		return idea;
	}
	public void setIdea(List<Idea> idea) {
		this.idea = idea;
	}


}
