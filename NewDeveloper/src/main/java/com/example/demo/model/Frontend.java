package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("fonted")


public class Frontend extends NewDeveloper{
	@JsonFormat
	private List<String>frameworks;

	public Frontend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frontend(List<String> frameworks) {
		super();
		this.frameworks = frameworks;
	}

	public List<String> getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(List<String> frameworks) {
		this.frameworks = frameworks;
	}

	 
	

}
