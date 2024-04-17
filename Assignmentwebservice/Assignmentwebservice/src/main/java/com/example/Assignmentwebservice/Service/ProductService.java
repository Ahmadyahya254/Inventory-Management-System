package com.example.Assignmentwebservice.Service;

import com.example.Assignmentwebservice.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);
    void deleteProduct(int id);
}
