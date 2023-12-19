package com.project.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.spring.entities.Order;
import com.project.spring.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        List<Order> orders = repository.findAll();
        return orders;
    }

    public Order findById(Long id) {
        Optional<Order> order = repository.findById(id);
        return order.get();
    }

}
