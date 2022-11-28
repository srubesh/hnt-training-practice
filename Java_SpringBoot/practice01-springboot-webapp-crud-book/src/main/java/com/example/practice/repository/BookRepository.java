package com.example.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
