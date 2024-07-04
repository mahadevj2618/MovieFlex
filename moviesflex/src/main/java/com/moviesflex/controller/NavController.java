package com.moviesflex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	 
	@GetMapping("map-register")
	public String navReg()
	{
		return "register";
	}
	
	@GetMapping("map-login")
	public String navLog()
	{
		return"login";
	}
	
	@GetMapping("map-movies")
	public String navMovies()
	{
		return"addmovies";
	}
}
