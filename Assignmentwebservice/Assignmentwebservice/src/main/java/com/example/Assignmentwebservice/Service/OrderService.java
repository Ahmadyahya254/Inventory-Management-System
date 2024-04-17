package com.example.Assignmentwebservice.Service;

import com.example.Assignmentwebservice.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findById(int id);
    Order save(Order order);
    void deleteOrder(int id);
}
