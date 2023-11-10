# Spring Boot Todo Application

This is a simple Spring Boot application for managing todos and user authentication.

## Table of Contents

- [Controllers](#controllers)
- [Services](#services)
- [Models](#models)
- [Requests](#requests)
- [Repositories](#repositories)

## Controllers

### TodoController

The `TodoController` handles HTTP requests related to todo management.

- **GET /api/todo/all/{userId}**
  - Retrieves all todos for a specific user.
  
- **POST /api/todo**
  - Adds a new todo.
  
- **PUT /api/todo**
  - Updates an existing todo.
  
- **DELETE /api/todo/delete/{id}**
  - Deletes a todo by ID.

### UserController

The `UserController` manages user authentication.

- **POST /api/user/login**
  - Authenticates a user.
  
- **POST /api/user/register**
  - Registers a new user.

## Services

### TodoService

The `TodoService` contains business logic related to todo management.

- **findAll(int userId)**
  - Retrieves all todos for a specific user.
  
- **createTodo(TodoRequest todo)**
  - Creates a new todo.
  
- **updateTodo(TodoRequest todo)**
  - Updates an existing todo.
  
- **deleteTodoById(int id)**
  - Deletes a todo by ID.

### UserService

The `UserService` handles user-related operations.

- **login(User user)**
  - Authenticates a user.
  
- **register(User user)**
  - Registers a new user.

## Models

### Todo

The `Todo` model represents a todo item.

- Attributes:
  - `id`: Unique identifier for the todo.
  - `userId`: ID of the user to whom the todo belongs.
  - `item`: Title of the todo.

### User

The `User` model represents a user.

- Attributes:
  - `id`: Unique identifier for the user.
  - `username`: User's username.
  - `password`: User's password (hashed for security).

## Requests

### TodoRequest

The `TodoRequest` is used for handling incoming todo-related requests.

- Attributes:
  - `id`: Unique identifier for the requestTodo.
  - `userId`: ID of the user.
  - `item`: Title of the todo.

