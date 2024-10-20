package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.User;


public interface UserRepo extends JpaRepository<User, Integer>
{
User findByEmail(String email);
boolean existsByEmail(String email);

}
