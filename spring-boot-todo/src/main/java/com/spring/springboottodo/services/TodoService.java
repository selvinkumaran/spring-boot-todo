package com.spring.springboottodo.services;

import com.spring.springboottodo.models.Todo;
import com.spring.springboottodo.models.User;
import com.spring.springboottodo.repositories.TodoRepository;
import com.spring.springboottodo.repositories.UserRepository;
import com.spring.springboottodo.request.TodoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private UserRepository userRepository;

    public List<Todo> findAll(int userId) {
        return todoRepository.findAll()
                .stream()
                .filter(todo -> todo.getUser().getId() == userId)
                .collect(Collectors.toList());
    }

    public List<Todo> createTodo(TodoRequest todo) {
        Todo originalTodo = new Todo();
        originalTodo.setItem(todo.getItem());
        User user = userRepository.findById(todo.getUser_Id()).get();
        originalTodo.setUser(user);
        todoRepository.save(originalTodo);
        return findAll(todo.getUser_Id());
    }

    public List<Todo> updateTodo(TodoRequest todo) {
        Todo originalTodo = new Todo();
        originalTodo.setId(todo.getId());
        originalTodo.setItem(todo.getItem());
        User user = userRepository.findById(todo.getUser_Id()).get();
        originalTodo.setUser(user);
        todoRepository.save(originalTodo);
        return findAll(todo.getUser_Id());
    }

    public List<Todo>  deleteTodoById(Integer id) {
        int userId = todoRepository.findById(id).get().getUser().getId();
        todoRepository.deleteById(id);
        return findAll(userId);
    }
}
