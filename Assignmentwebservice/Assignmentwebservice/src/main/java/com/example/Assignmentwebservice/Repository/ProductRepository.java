
package com.example.Assignmentwebservice.Repository;

 import com.example.Assignmentwebservice.entity.Product;
 import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Integer> {

}

