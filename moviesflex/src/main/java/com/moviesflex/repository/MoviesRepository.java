package com.moviesflex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviesflex.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Integer> {

}
