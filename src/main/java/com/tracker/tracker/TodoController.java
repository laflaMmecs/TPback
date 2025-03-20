// src/main/java/com/example/demo/TodoController.java
package com.tracker.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tracker.tracker.model.TodoItem;
import com.tracker.tracker.repositories.TodoRepository;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping
    public List<TodoItem> getAllTodos() {
        return todoRepository.findAll();
    }

    @PostMapping
    public TodoItem createTodo(@RequestBody TodoItem todoItem) {
        return todoRepository.save(todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public TodoItem updateTodo(@PathVariable Long id, @RequestBody TodoItem todoItem) {
        todoItem.setId(id);
        return todoRepository.save(todoItem);
    }
   


}