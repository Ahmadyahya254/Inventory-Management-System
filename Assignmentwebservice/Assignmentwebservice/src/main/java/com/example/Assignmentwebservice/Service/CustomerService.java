package com.example.Assignmentwebservice.Service;

import com.example.Assignmentwebservice.entity.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    Customer save(Customer customer);
    void deleteCustomer(int id);
}
