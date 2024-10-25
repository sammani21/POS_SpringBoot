package com.ijse.salessystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.salessystem.dto.ProductDTO;
import com.ijse.salessystem.entity.Product;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product createProduct(ProductDTO productDTO);
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
    List<Product> findByCategory(Long id);
}