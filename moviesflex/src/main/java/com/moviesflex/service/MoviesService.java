package com.moviesflex.service;

import java.util.List;

import com.moviesflex.entity.Movies;

public interface MoviesService {

	public String addMovies(Movies movies);
	
	public List<Movies> viewMovies();
	
	public Movies idzmovies(int m_id);
	
	public String deleteMovies(int m_id);
}
