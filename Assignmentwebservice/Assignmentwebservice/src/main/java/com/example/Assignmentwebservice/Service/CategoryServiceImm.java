package com.example.Assignmentwebservice.Service;

import com.example.Assignmentwebservice.Repository.CategoryRepository;
import com.example.Assignmentwebservice.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImm implements CategoryService{
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImm(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }



    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findBuId(int id) {
        return null;
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public void DeleteCategory(int id) {

    }
}
