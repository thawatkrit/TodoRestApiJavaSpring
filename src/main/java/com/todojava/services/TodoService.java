package com.todojava.services;

import java.util.List;
import java.util.Optional;

import com.todojava.entities.Todo;
import com.todojava.repo.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	@Autowired
	private Repo repo;

	public List<Todo> getAllTodo() {
		return repo.findAll();
	}

	public void addTodo(Todo todo) {
		repo.save(todo);
	}

	public void deleteTodo(String id) {
		repo.deleteById(id);
	}
	public void updateTodo(Todo todo) {
		Todo entity = repo.findById(todo.getId()).get();
		entity.setTitle(todo.getTitle());
		entity.setDetail(todo.getDetail());
		repo.save(entity);
	}
}
