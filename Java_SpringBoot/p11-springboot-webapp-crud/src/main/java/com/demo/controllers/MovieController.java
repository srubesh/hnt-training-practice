package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.services.MovieService;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin
public class MovieController {
	
	@Autowired
	private MovieService service;

	@GetMapping()	
	public List<Movie> getMovies(){
		return service.getMovies();
	}
	
	@GetMapping("/{id}")
	public Movie getMovieById(@PathVariable int id) throws Exception{
		return service.getMovieById(id);
	}
	
	@PostMapping()
	public Movie saveMovie(@RequestBody Movie movie){
		return service.saveMovie(movie);
	}

	@DeleteMapping("/{id}")
	public Movie deleteMovieById(@PathVariable int id) throws Exception{
		return service.deleteMovieById(id);
	}
	
	@PutMapping("/{id}")
	public Movie updateMovie(@RequestBody Movie m, @PathVariable int id) throws Exception{
		return service.updateMovie(m, id);
	}
		
}
