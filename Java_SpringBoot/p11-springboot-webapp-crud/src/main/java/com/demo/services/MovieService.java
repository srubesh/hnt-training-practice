package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repo;

	public List<Movie> getMovies(){
		return repo.findAll();
	}
	

	public Movie getMovieById(int id) throws Exception {
		Optional<Movie> optional = repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
			
		} else {
			throw new Exception("Can not find movie with id: "+id);
		}
	}
	

	public Movie saveMovie(Movie movie){
		return repo.save(movie);
	}


	public Movie deleteMovieById(int id) throws Exception {
		Movie movie = getMovieById(id);
		if(movie!=null) {			
//			repo.deleteById(id);
			repo.delete(movie);
			return movie;
		} else {
			throw new Exception("Can not delete movie with id: "+id);
		}
	}
	

	public Movie updateMovie(Movie m, int id) throws Exception{
//		Movie movie = getMovieById(id);
//		if(movie!=null) {
		if(repo.existsById(id)) {
			m.setId(id);
			return repo.save(m);
		} else {
			throw new Exception("Can not update movie with id: "+id);
		}
	}

}
