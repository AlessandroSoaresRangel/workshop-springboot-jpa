package com.project.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.spring.entities.Category;
import com.project.spring.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category findById(Long id) {
        Optional<Category> category = repository.findById(id);
        return category.get();
    }

    public List<Category> findAll() {
        List<Category> categories = repository.findAll();
        return categories;
    }
}
