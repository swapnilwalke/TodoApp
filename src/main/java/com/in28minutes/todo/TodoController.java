package com.in28minutes.todo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//Login controller
//handler
@Controller
@SessionAttributes("username")
public class TodoController {

	@Autowired
	TodoService service;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		model.addAttribute("todos", service.retrieveTodos("in28minutes"));
		return "list-todos";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showTodoPage() {
		// model.addAttribute("todos", service.retrieveTodos("in28minutes"));
		return "todo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc) {
		service.addTodo("in28minutes", desc, new Date(), false);
		model.clear();
		// model.addAttribute("todos", service.retrieveTodos("in28minutes"));
		return "redirect:list-todos";
	}

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(ModelMap model, @RequestParam int id) {
		service.deleteTodo(id);
		model.clear();
		return "redirect:list-todos";
	}

}
