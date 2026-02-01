package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.NewDeveloper;
@Repository

public interface NewDeveloperRepository  extends JpaRepository<NewDeveloper, Integer>{

	
	

}
