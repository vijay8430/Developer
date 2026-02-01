package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("backend")

public class Backend extends NewDeveloper{
	@JsonFormat
	private List<String>frameworks;
	@Nonnull
    private Float bonus;
	public Backend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Backend(List<String> frameworks, Float bonus) {
		super();
		this.frameworks = frameworks;
		this.bonus = bonus;
	}
	public List<String> getFrameworks() {
		return frameworks;
	}
	public void setFrameworks(List<String> frameworks) {
		this.frameworks = frameworks;
	}
	public Float getBonus() {
		return bonus;
	}
	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}
    

}
