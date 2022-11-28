package com.example.practice.controller;

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

import com.example.practice.entities.Book;
import com.example.practice.service.BookService;

@RestController
@RequestMapping("api/books")
@CrossOrigin
public class BookController {

	@Autowired
	private BookService service;

	@GetMapping()	
	public List<Book> getMovies(){
		return service.getBooks();
		//return null;
	}
	
	@GetMapping("/{id}")
	public Book getMovieById(@PathVariable int id) throws Exception{
		return service.getBookById(id);
//		return null;
	}
	
	@PostMapping()
	public Book saveMovie(@RequestBody Book book){
		return service.saveBook(book);
//		return null;
	}

	@DeleteMapping("/{id}")
	public Book deleteMovieById(@PathVariable int id) throws Exception{
		return service.deleteBookById(id);
//		return null;
	}
	
	@PutMapping("/{id}")
	public Book updateBook(@RequestBody Book b, @PathVariable int id) throws Exception{
		return service.updateBook(b, id);
//		return null;
	}
}
