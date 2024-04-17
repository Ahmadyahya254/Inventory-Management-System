package com.example.Assignmentwebservice.Service;

import com.example.Assignmentwebservice.entity.Category;

import java.util.List;


public interface CategoryService {
    List<Category> findAll();
    Category findBuId(int id );
    Category save(Category category);

    void DeleteCategory(int id);
}