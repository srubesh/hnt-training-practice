package com.example.practice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String author;
	private String title;
	private String content;
	
	
	
	public Book() {
	}

	public Book(String author, String title, String content) {
		
		this.author = author;
		this.title = title;
		this.content = content;
	}

	public Book(int id, String author, String title, String content) {
		this(author,title,content);
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
