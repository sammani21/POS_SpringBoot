package com.ijse.salessystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.salessystem.dto.OrderDTO;
import com.ijse.salessystem.entity.Order;

@Service
public interface OrderService {
    List<Order> getAllOrders();
    Order createOrder(OrderDTO orderDTO);
    Order getOrderById(Long id);
}