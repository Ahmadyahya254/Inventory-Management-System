package com.example.Assignmentwebservice.Service;

import com.example.Assignmentwebservice.Repository.OrderRepository;
import com.example.Assignmentwebservice.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(int id) {
        Optional<Order> order = orderRepository.findById(id);
        Order order1 = null;
        if (order.isPresent()) {
            order1 = order.get();
        } else {
            throw new RuntimeException("Did not find order id - " + id);
        }
        return order1;
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }
}
