package com.bean;

import java.util.Set;

public class Director {

	private int id;
	private String name;
	private Set<Movie> movies;
	
	public Director()
	{
	     id=0;
	     name="";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	
	
}
