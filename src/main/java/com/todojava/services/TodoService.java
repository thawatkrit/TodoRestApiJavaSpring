package com.todojava.services;

import java.util.List;

import com.todojava.entities.Todo;
import com.todojava.repo.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	@Autowired
	private Repo repo;
	
	public List<Todo> getAllTodo(){
			return repo.findAll();
	}
	public void addTodo(Todo todo){
		repo.save(todo);
	}
}
