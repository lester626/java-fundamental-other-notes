package com.example.springbootthymeleaf.repository;

import com.example.springbootthymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}