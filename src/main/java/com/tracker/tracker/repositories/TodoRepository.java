
package com.tracker.tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.tracker.model.TodoItem;

public interface TodoRepository extends JpaRepository<TodoItem, Long> {
}