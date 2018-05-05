package com.kramirez.JavaSBB.models;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
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
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private Calendar startTime;
	
	private ArrayList<DayOfWeek> weekSchedule;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course_id")
	private Semester semesterOffered;
	
	
	private String courseName;
	private String instructor;
	
	
	@Size(max=15)
	private int capacity;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="user_courses",
			joinColumns = @JoinColumn(name="course_id"),
			inverseJoinColumns = @JoinColumn(name = "user_id"))
		private List<User> enrolledStudents;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;

	public Course(Calendar startTime, ArrayList<DayOfWeek> weekSchedule, Semester semesterOffered,
			String courseName, String instructor) {
		super();
		this.startTime = startTime;
		this.weekSchedule = weekSchedule;
		this.semesterOffered = semesterOffered;
		this.courseName = courseName;
		this.instructor = instructor;
	}

	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
        this.capacity = 0;
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
		public ArrayList<DayOfWeek> getWeekSchedule() {
			return weekSchedule;
		}
		public void setWeekSchedule(ArrayList<DayOfWeek> weekSchedule) {
			this.weekSchedule = weekSchedule;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getInstructor() {
			return instructor;
		}
		public void setInstructor(String instructor) {
			this.instructor = instructor;
		}
		public Semester getSemesterOffered() {
			return semesterOffered;
		}
		public void setSemesterOffered(Semester semesterOffered) {
			this.semesterOffered = semesterOffered;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
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
