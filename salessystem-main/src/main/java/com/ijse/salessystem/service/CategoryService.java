package com.ijse.salessystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.salessystem.entity.Category;

@Service
public interface CategoryService {
    Category createCategory(Category category);
    Category getCategoryById(Long id);
    List<Category> getAllCategories();
    Category updateCategory(Long id, Category category);
}