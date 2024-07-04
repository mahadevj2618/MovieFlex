package com.moviesflex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moviesflex.entity.Movies;
import com.moviesflex.entity.User;
import com.moviesflex.service.MoviesService;
import com.moviesflex.service.UserServices;

import jakarta.servlet.http.HttpSession;


@Controller
public class UserController {
	@Autowired
	UserServices us;
	
	@Autowired
	MoviesService ms;

	public UserController(UserServices us) {
		super();
		this.us = us;
	}
	
	@PostMapping("create")
	public String userCreate(@ModelAttribute User user) {
		boolean same=us.exitEmail(user.getEmail());
		if(same)
		{
			return "faildres";
		}
		else
		{
			us.userCreate(user);
			
			return "sucres";
		}
		
	}
	
	
	@PostMapping("login")
	public String loginUser(@RequestParam String email, @RequestParam String password, HttpSession session)
	{
		boolean status=us.userCheck(email, password);
		
		if(status==true)
		{
			session.setAttribute("email", email);
			if(email.equals("mjadmin@gmail.com"))
			{
				return "adminhome";
			}
			else
			{
				return"home";
			}
		}
		else
		{
			return "faildlog";
		}
	}
	
	
	
	
	@GetMapping("viewuser")
	public String viewUser(Model model) {
	    List<User> users = us.viewUser(); 
	    model.addAttribute("users", users);
	    return "viewuser"; 
	}

	
	
	
	
	
	@GetMapping("/exploremovies")
	public String exploreMovie(Model model, HttpSession session) {
	    String email = (String) session.getAttribute("email");
	    
	    User usr = us.getUser(email);
	    Boolean status=usr.isPremium();
	    
	    if (status==true) {
	        List<Movies> movies = ms.viewMovies();
	        model.addAttribute("movies", movies);
	        return "viewmoviesuser";
	    } else {
	        return "payment";
	    }
	}

	
	@GetMapping("logout")
	public String logOut(HttpSession session)
	{
		session.invalidate();
		return "login";
	}

}
