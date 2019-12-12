package com.todojava.entities;

public class Todo {
	private Long id;
	private String title;
	private String detail;

	public Todo(Long id, String title, String detail) {
		this.id = id;
		this.title = detail;
		this.detail = detail;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return this.title;
	}

	public void setName(String detail) {
		this.detail = detail;
	}

}
