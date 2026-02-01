package com.example.demo.service;

import java.util.List;

import com.example.demo.model.NewDeveloper;

public interface NewDeveloperService {
	void add(NewDeveloper nd);

	List<NewDeveloper> display();

}
