package com.moviesflex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.moviesflex.entity.Movies;
import com.moviesflex.repository.MoviesRepository;


@Service
public class MoviesServiceImplementation implements MoviesService {

	@Autowired
	MoviesRepository mrepo;
	
	
	public MoviesServiceImplementation(MoviesRepository mrepo) {
		super();
		this.mrepo = mrepo;
	}


	@Override
	public String addMovies(Movies movies) {
		mrepo.save(movies);
		return "add movies";
	}


	@Override
	public List<Movies> viewMovies() {
		List<Movies> movies=mrepo.findAll();
		return movies;
	}


	@Override
	public Movies idzmovies(int m_id) {
		Movies mv=mrepo.findById(m_id).get();
		return mv;
	}


	@Override
	public String deleteMovies(int m_id) {
		mrepo.deleteById(m_id);
		return "delete";
	}


	

}
