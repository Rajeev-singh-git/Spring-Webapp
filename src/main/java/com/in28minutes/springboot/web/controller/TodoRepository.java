package com.in28minutes.springboot.web.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.web.model.Todo;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	public  List<Todo> findByUser(String USER);
	
	
}
