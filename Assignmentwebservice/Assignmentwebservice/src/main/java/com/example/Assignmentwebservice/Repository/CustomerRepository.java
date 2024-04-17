package com.example.Assignmentwebservice.Repository;

import com.example.Assignmentwebservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
