package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movies;
import com.example.demo.service.MovieService;


@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	MovieService service;
	
	@Value("${server.port}")
	public String port;
	
	@GetMapping("/port")
	public String getPort() {
		return("Application is running on :"+port+" port");	
	}
	@GetMapping("/search/{rating}")
	public ResponseEntity<List<Movies>> searchMovieByRating(@PathVariable("rating")int rating){
		return new ResponseEntity<>(service.searchByRating(rating),HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Movies>> displayAll(){
		return new ResponseEntity<>(service.getAllMovies(),HttpStatus.OK);
	}
}
