package com.springbootwebApp.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

//@Controller
@SessionAttributes("name")
public class TodoController {

	private TodoService todoSerive;

	public TodoController(TodoService todoSerive) {
		super();
		this.todoSerive = todoSerive;
	}

//1 we wanted to create list of todos work and it should show on jsp 
	// craeted one todo class in the mentioned all the attributes should be visible
	// on the page
	// created service class for static d=hard coded data inserted and make it
	// s=@Servce class
	// created on controller mapping

	@RequestMapping("todo-list")
	public String listAllTodos(ModelMap model) {

		// List<Todo> todos = todoSerive.findUserName("Harshith");Harsdcoded
		//String username = (String) model.get("name");
		String username = getLoggedInUserName(model);

		List<Todo> todos = todoSerive.findUserName(username);

		model.addAttribute("todos", todos);

		return "todolist";
	}

	

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewTodosPage(ModelMap model) {
		String username = getLoggedInUserName(model);
		Todo todo = new Todo(0, username, "LearnMangoDB", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "addtodo";
	}

	/*
	 * @RequestMapping(value = "add-todo", method = RequestMethod.POST) public
	 * String addNewTodosPage(@RequestParam String description, ModelMap model) {
	 * String username =(String)model.get("name");
	 * todoSerive.addTodo(username,description,LocalDate.now().plusYears(3),false);
	 * return "redirect:todo-list"; }
	 */

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewTodosPage(ModelMap model, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "addtodo";
		}

		String username = getLoggedInUserName(model);
		todoSerive.addTodo(username, todo.getDescription(), todo.getTargetdate(), false);
		return "redirect:todo-list";
	}

	// instead of telling ModelMap to binding the value,sping MVC is to bind
	// directly to Todo bean
	@RequestMapping("delete-todo")
	public String deleteTodosPage(@RequestParam int id) {
		todoSerive.deleteById(id);

		return "redirect:todo-list";
	}

	
	
	
	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String updateTodosPage(@RequestParam int id, ModelMap model) {

		Todo todo = todoSerive.findById(id);
		model.addAttribute("todo", todo);
		return "addtodo";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updateTodosPage(ModelMap model, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "addtodo";
		}

		String username = getLoggedInUserName(model);
		todoSerive.updateTodo(todo);
		return "redirect:todo-list";
	}
	
	private String getLoggedInUserName(ModelMap model) {
		Authentication authenticate = SecurityContextHolder.getContext().getAuthentication();
		return authenticate.getName();	}
	
}
