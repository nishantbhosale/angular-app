package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movies;
@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer>{
	@Query("select u from Movies u where u.rating")
	public List<Movies> searchByRating(int rating);
}
