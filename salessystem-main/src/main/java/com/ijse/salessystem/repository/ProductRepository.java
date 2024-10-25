package com.ijse.salessystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ijse.salessystem.entity.Category;
import com.ijse.salessystem.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //CustomQuery
    @Query("SELECT p FROM Product p WHERE p.category=:category")
    List<Product> findByCategory(@Param("category") Category category);
}