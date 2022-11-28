package com.example.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entities.Book;
import com.example.practice.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repo;

	public List<Book> getBooks(){
		return repo.findAll();
//		return null;
	}
	

	public Book getBookById(int id) throws Exception {
		
		Optional<Book> optional = repo.findById(id); 
		if(optional.isPresent()) {
			return optional.get();
		} 
		else {
			throw new Exception("Can not find book with id: "+id); 
		}
		 
//		return null;
	}
	

	public Book saveBook(Book book){
		return repo.save(book);
//		return null;
	}


	public Book deleteBookById(int id) throws Exception {
		
		Book book = getBookById(id); 
		if(book!=null) { 
			repo.delete(book); 
			return book; 
		} 
		else { 
			throw new Exception("Can not delete user with id: "+id); 
		}
		
//		return null;
	}
	

	public Book updateBook(Book b, int id) throws Exception{
//		Book book = getBookById(id);
//		if(book!=null) {

		if(repo.existsById(id)) {
			b.setId(id); 
			return repo.save(b); 
		} 
		else { 
			throw new Exception("Can not update book with id: "+id); 
		}
 
		
//		return null;
	}

}
