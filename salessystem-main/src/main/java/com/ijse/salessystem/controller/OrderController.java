package com.ijse.salessystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.salessystem.dto.OrderDTO;
import com.ijse.salessystem.entity.Order;
import com.ijse.salessystem.service.OrderService;

@RestController
@CrossOrigin(origins = "*")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.status(200).body(orderService.getAllOrders());
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDTO) {
        Order newOrder = orderService.createOrder(orderDTO);

        return ResponseEntity.status(200).body(newOrder);
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        Order order = orderService.getOrderById(id);

        if(order != null) {
            return ResponseEntity.status(200).body(order);
        } else {
            return ResponseEntity.status(404).body(null);
        }
    }
}