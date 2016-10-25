package com.niit.kafon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/validate")
	public String validate(@RequestParam("userid") String id,@RequestParam("pass") String pass1,Model model)
	{
		if(id.equals("gowthaman")&& pass1.equals("google"))
		{
			model.addAttribute("success", "successfully logged in");
			return "index";
		}
		else
		{
			model.addAttribute("failed", "Failed to log in");
			return "login";
		}
	}

	@RequestMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("log","true");
		return "index";
	}
	@RequestMapping("/register")
	public String register(Model model)
	{
		model.addAttribute("reg","true");
		return "index";
	}
}
