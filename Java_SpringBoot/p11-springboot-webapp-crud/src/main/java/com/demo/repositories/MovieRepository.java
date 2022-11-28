package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Movie;

public interface MovieRepository  extends JpaRepository<Movie, Integer>{
	
}

//
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.demo.entities.Movie;
//
//@Repository
//public class MovieRepository {
//
//	public List<Movie> getMovies(){
//		return List.of(
//				new Movie("Batman is black", "Mike", 3.9),
//				new Movie("Spiderman is red", "Tom", 4.1)
//			);
//	}
//	
//
//	public Movie getMovieById(int id){
//		return new Movie(id, "Batman is black", "Mike", 3.9);
//	}
//	
//
//	public Movie saveMovie(Movie movie){
//		movie.setId(299);
//		return movie;
//	}
//
//
//	public Movie deleteMovieById(int id){
//		return new Movie(id, "Batman is black", "Mike", 3.9);
//	}
//	
//
//	public Movie updateMovie(Movie m, int id){
//		return new Movie(id, "Batman is black", "Mike", 3.9);
//	}
//
//	
//}
