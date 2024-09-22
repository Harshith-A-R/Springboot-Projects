package com.springbootwebApp.myFirstWebApp.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

import java.time.LocalDate;

@Service
public class TodoService {

	
	 public static List<Todo> todos =new ArrayList<Todo>();
	 private static int todoCount =0;
	 static {
		 todos.add(new Todo(++todoCount,"Harshith","LearnAWS",
				 LocalDate.now().plusYears(1),false));
		 todos.add(new Todo(++todoCount,"Harshith","LearnDevops",
				 LocalDate.now().plusYears(2),false));
		 todos.add(new Todo(++todoCount,"Harshith","LearnFullStackDevelopment",
				 LocalDate.now().plusYears(3),false));
	 }
	 
	 public List<Todo> findUserName(String username){
		 //if user user matches it would return all tods
		 //the below functional interface and return statement would be used for other users
		 /*Predicate<? super Todo> predicate = todo->todo.getUsername().equalsIgnoreCase(username);

		return todos.stream().filter(predicate).toList();*/
		 
		 
		 return todos;
		 
		 
		 
		 /*We are setting the matching condition in here on what to do.
		 We are saying if the user name matches, then it's matching.
		 And over here we are converting it into a stream.
		 So if there are ten to dos, each of them are processed individually and checked.
		 This condition is checked.
		 If the user name matches, then it would be returned back.
		 If the user name does not match, then it will not be returned back at the end.
		 Whatever are filtered, we are converting it to a list and returning it back.*/
		 
	 }
	 public void addTodo(String username,String description, LocalDate targetdate,boolean done ) {
		 Todo todo =new Todo(++todoCount, username, description, targetdate, done);
		 todos.add(todo);
	 }
	 public void deleteById(int id ) {
		 
		 Predicate<? super Todo> predicate = todo->todo.getId()==id;
		todos.removeIf(predicate);
		}
	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo->todo.getId()==id;
			Todo todo =todos.stream().filter(predicate).findFirst().get();
			return todo;
	}
	
	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
	 }
	 
	 
	  	
