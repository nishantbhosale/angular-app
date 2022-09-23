package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movies")
public class Movies {
	@Id
	int movie_id;
	@Column
	String movie_namel;
	@Column
	int release_year;
	@Column
	String language;
	@Column
	int rating;
	@Column
	int duration_in_minutes;
	@Column
	String movie_type;
	@Column
	String movie_categoty;
	@Column
	String director_name;
	@Column
	String lead_actor_name1;
	@Column
	String lead_actor_name2;
	@Column
	int rental_cost;
	public Movies() {
		
	}
	public Movies(int movie_id, String movie_namel, int release_year, String language, int rating,
			int duration_in_minutes, String movie_type, String movie_categoty, String director_name,
			String lead_actor_name1, String lead_actor_name2, int rental_cost) {
		super();
		this.movie_id = movie_id;
		this.movie_namel = movie_namel;
		this.release_year = release_year;
		this.language = language;
		this.rating = rating;
		this.duration_in_minutes = duration_in_minutes;
		this.movie_type = movie_type;
		this.movie_categoty = movie_categoty;
		this.director_name = director_name;
		this.lead_actor_name1 = lead_actor_name1;
		this.lead_actor_name2 = lead_actor_name2;
		this.rental_cost = rental_cost;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_namel() {
		return movie_namel;
	}
	public void setMovie_namel(String movie_namel) {
		this.movie_namel = movie_namel;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getDuration_in_minutes() {
		return duration_in_minutes;
	}
	public void setDuration_in_minutes(int duration_in_minutes) {
		this.duration_in_minutes = duration_in_minutes;
	}
	public String getMovie_type() {
		return movie_type;
	}
	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}
	public String getMovie_categoty() {
		return movie_categoty;
	}
	public void setMovie_categoty(String movie_categoty) {
		this.movie_categoty = movie_categoty;
	}
	public String getDirector_name() {
		return director_name;
	}
	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}
	public String getLead_actor_name1() {
		return lead_actor_name1;
	}
	public void setLead_actor_name1(String lead_actor_name1) {
		this.lead_actor_name1 = lead_actor_name1;
	}
	public String getLead_actor_name2() {
		return lead_actor_name2;
	}
	public void setLead_actor_name2(String lead_actor_name2) {
		this.lead_actor_name2 = lead_actor_name2;
	}
	public int getRental_cost() {
		return rental_cost;
	}
	public void setRental_cost(int rental_cost) {
		this.rental_cost = rental_cost;
	}
	
}
