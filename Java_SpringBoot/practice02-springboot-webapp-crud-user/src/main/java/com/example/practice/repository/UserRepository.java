package com.example.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
