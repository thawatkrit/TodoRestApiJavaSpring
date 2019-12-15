package com.todojava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todojava.entities.Todo;
import com.todojava.services.TodoService;

@RestController
public class TodoController {
	@Autowired
	private TodoService todoService;

	@RequestMapping(value = "/getAllTodo", method = RequestMethod.GET)
	public List<Todo> getAllTodo() {
		return todoService.getAllTodo();
	}

	@RequestMapping(value = "/addTodo", method = RequestMethod.POST)
	public void addTodo(@RequestBody Todo todo) throws Exception {
		todoService.addTodo(todo);
	}
	@RequestMapping(value = "/deleteTodo/{id}", method = RequestMethod.GET)
	public void deleteTodo(@PathVariable String id) {
		todoService.deleteTodo(id);
	}
	@RequestMapping(value = "/updateTodo", method = RequestMethod.POST)
	public void deleteTodo(@RequestBody Todo todo) {
		todoService.updateTodo(todo);
	}
}