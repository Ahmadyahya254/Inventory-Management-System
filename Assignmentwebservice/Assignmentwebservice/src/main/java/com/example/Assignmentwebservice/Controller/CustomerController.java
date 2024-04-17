package com.example.Assignmentwebservice.Controller;

import com.example.Assignmentwebservice.Service.CustomerService;
import com.example.Assignmentwebservice.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer) {
     //   customer.setCustomerId(0);
        return customerService.save(customer);
    }

    @PutMapping("/")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return "Customer with id " + id + " deleted";
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable int id) {
        Customer customer = customerService.findById(id);
        if (customer == null) {
            throw new RuntimeException("Did not find customer id - " + id);
        }
        return customer;
    }
}
