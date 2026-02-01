package com.example.demo.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype", discriminatorType = DiscriminatorType.STRING)

public class NewDeveloper {
	@Id
	private Integer id;
	private String name;
	private Float exp;
	private String tech;
	private String project;
	public NewDeveloper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewDeveloper(Integer id, String name, Float exp, String tech, String project) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.tech = tech;
		this.project = project;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getExp() {
		return exp;
	}
	public void setExp(Float exp) {
		this.exp = exp;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "NewDeveloper [id=" + id + ", name=" + name + ", exp=" + exp + ", tech=" + tech + ", project=" + project
				+ "]";
	}
	

}
