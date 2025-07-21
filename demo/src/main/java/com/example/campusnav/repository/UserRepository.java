package com.example.campusnav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.campusnav.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    boolean existsByEmail(String email);
}