package com.project.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
