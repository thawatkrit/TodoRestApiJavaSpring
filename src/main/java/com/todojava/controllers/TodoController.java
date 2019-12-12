package com.todojava.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.todojava.services.TodoService;
import com.todojava.entities.Todo;

@RestController
public class TodoController {
	@Autowired
	private TodoService todoService;

	@RequestMapping(value = "/getAllTodo", method = RequestMethod.GET)
	public List<Todo> getAllTodo() {
		return todoService.getAllTodo();
	}

	@RequestMapping(value = "/addTodo", method = RequestMethod.POST)
	public void addtodo(@RequestBody Todo todo) {
		todoService.addTodo(todo);
	}
}