package com.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
