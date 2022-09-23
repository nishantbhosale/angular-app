package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Movies;

public interface MovieService {
	public List<Movies> searchByRating(int rating);
	public List<Movies> getAllMovies();
}
