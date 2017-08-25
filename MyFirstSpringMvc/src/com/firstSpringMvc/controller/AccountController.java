package com.firstSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstSpringMvc.model.User;

@Controller
@RequestMapping("/Account")
public class AccountController {
	@RequestMapping("/create")
	public String Create() {
		return "create";
	}
	
	@RequestMapping("/save")
	public String Create(@ModelAttribute("form") User user,Model model) {
		model.addAttribute("user", user);
		return "details";
	}
}
