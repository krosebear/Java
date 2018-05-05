package com.kramirez.JavaSBB.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="semesters")
public class Semester {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	@OneToMany(mappedBy="semesterOffered", fetch = FetchType.LAZY)
	private List<Course> courseList;
	

	
	public Semester(String name) {
		super();
		this.name = name;
	}

	
	
	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
