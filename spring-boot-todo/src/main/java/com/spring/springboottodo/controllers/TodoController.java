package com.spring.springboottodo.controllers;

import com.spring.springboottodo.models.Todo;
import com.spring.springboottodo.request.TodoRequest;
import com.spring.springboottodo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/all/{userId}")
    public List<Todo> getTodo(@PathVariable int userId) {
        return todoService.findAll(userId);
    }

    @PostMapping
    public List<Todo> addTodo(@RequestBody TodoRequest todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping
    public List<Todo> update(@RequestBody TodoRequest todo) {
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/delete/{id}")
    public List<Todo> delete(@PathVariable int id) {
        return todoService.deleteTodoById(id);
    }
}
