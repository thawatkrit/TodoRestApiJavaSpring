package com.todojava.repo;

import com.todojava.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Todo, Long> {
}