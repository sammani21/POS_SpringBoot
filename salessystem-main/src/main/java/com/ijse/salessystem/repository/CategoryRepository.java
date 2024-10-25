package com.ijse.salessystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.salessystem.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}