package com.example.Assignmentwebservice.Controller;

import com.example.Assignmentwebservice.Service.OrderService;
import com.example.Assignmentwebservice.entity.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @PostMapping("/")
    public Order addOrder(@RequestBody Order order) {
       // order.setOrderId(0);
        return orderService.save(order);
    }

    @PutMapping("/")
    public Order updateOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id) {
        orderService.deleteOrder(id);
        return "Order with id " + id + " deleted";
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {
        Order order = orderService.findById(id);
        if (order == null) {
            throw new RuntimeException("Did not find order id - " + id);
        }
        return order;
    }
}
