package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Backend;
import com.example.demo.model.Frontend;
import com.example.demo.model.NewDeveloper;
import com.example.demo.service.NewDeveloperService;

@RestController

public class NewDeveloperController {
	@Autowired
	private NewDeveloperService ds;
	@PostMapping("add/frontend")
	public void add(@RequestBody Frontend f) {
		ds.add(f);
	}
	@PostMapping("add/backend")
	public void add(@RequestBody Backend b) {
		ds.add(b);
	}
	@PostMapping("display")
	public List<NewDeveloper>display(){
		return ds.display();
	}
	
	

}
