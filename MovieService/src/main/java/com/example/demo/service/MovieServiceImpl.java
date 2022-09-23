package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Movies;
import com.example.demo.repo.MovieRepository;
@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieRepository repo;

	@Override
	public List<Movies> searchByRating(int rating) {
		// TODO Auto-generated method stub
		return repo.searchByRating(rating);
	}

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
