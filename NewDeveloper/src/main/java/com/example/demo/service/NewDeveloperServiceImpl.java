package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.NewDeveloper;
import com.example.demo.repository.NewDeveloperRepository;

@Service

public class NewDeveloperServiceImpl implements NewDeveloperService {
	@Autowired
	private NewDeveloperRepository dr;

	@Override
	public void add(NewDeveloper developer) {
		// TODO Auto-generated method stub
		dr.save(developer);

	}

	@Override
	public List<NewDeveloper> display() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

}
