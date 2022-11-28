package com.example.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
