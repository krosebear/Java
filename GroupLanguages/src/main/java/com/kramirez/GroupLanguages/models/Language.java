package com.kramirez.GroupLanguages.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Language {
	@Id
    @GeneratedValue
    private Long id;
	@Column
	@Size(min = 2, max = 20)
    private String name;
	@Column
    @Size(min = 2, max = 200)
    private String creator;
	@Column
    @NotNull(message="this can't be blank")
    private String version;

	public Language(String name, String creator, String version) {
		super();
		this.name = name;
		this.creator = creator;
		this.version = version;
	}

	public Language(){
		
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}