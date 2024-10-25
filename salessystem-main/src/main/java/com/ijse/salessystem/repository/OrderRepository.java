package com.ijse.salessystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.salessystem.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
