package com.lynas.etweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
	@RequestMapping("/")
	 public String home(HttpServletRequest request){
		return "index";
	}

	@RequestMapping("/login")
	public String login(){
		return "login";
	}



}
