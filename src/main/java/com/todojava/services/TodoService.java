package com.todojava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todojava.entities.Todo;
import com.todojava.repo.Repo;

@Service
public class TodoService {
	@Autowired
	private Repo repo;

	public List<Todo> getAllTodo() {
		return repo.findAll();
	}

	public void addTodo(Todo todo) throws Exception {
		String id = todo.getId();
		if (id == null) {
			repo.save(todo);
		} else {
			Todo entiity = repo.findById(id).get();
			if (entiity == null) {
				repo.save(todo);
			} else {
				throw new Exception();
			}
		}
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
