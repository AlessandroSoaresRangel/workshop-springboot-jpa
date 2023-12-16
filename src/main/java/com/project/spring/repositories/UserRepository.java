package com.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
