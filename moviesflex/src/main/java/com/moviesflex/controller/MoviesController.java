package com.moviesflex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.moviesflex.entity.Movies;
import com.moviesflex.service.MoviesService;

@Controller
public class MoviesController {
	
	@Autowired
	MoviesService ms;
		
	public MoviesController(MoviesService ms) {
		super();
		this.ms = ms;
	}



	@PostMapping("newadd")
	public String addMovies(@ModelAttribute Movies movies) {
		ms.addMovies(movies);
		return "sucmovies";
	}
	
	@GetMapping("/viewmovies")
	public String viewMovies(Model model) {
		List<Movies> movies=ms.viewMovies();
		model.addAttribute("movies", movies);
		return "displaymovies";
	}
	
	
//	@GetMapping("{m_id}")
//	public Movies idzmovies(@PathVariable int m_id) {
//		Movies mv=ms.idzmovies(m_id);
//		return mv;
//	}
	
	@GetMapping("delete/{m_id}")
	public String delete(@PathVariable int m_id) {
		ms.deleteMovies(m_id);
		return "delete";
	}
}
