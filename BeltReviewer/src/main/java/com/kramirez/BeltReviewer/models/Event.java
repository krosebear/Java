package com.kramirez.BeltReviewer.models;

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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="events")
public class Event {
	@Id
	@GeneratedValue
	private Long id;
	@Size(min=3, message="Event Name must be more than 3 characters long.")
	private String eName;
	private Date eDate;
	private String city;
	@Size(max=2, message="2 Character state abbreviation.")
	private String state;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User createdBy;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name="attending_users",
		joinColumns = @JoinColumn(name="event_id"),
		inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> usersAttending;

	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Date geteDate() {
		return eDate;
	}
	public void seteDate(Date eDate) {
		this.eDate = eDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public List<User> getUsersAttending() {
		return usersAttending;
	}
	public void setUsersAttending(List<User> usersAttending) {
		this.usersAttending = usersAttending;
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
