package com.example.Assignmentwebservice.Service;

import com.example.Assignmentwebservice.Repository.CategoryRepository;
import com.example.Assignmentwebservice.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryServiceImpl implements CategoryService{
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }



    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findBuId(int id) {
        Optional<Category> category = categoryRepository.findById(id);
        Category category1 =null;
        if(category.isPresent()){
            category1=category.get();
        }else {
            throw new RuntimeException("Did not find Category id - " + id);
        }
        return category1;
    }

    @Override
    public Category save(Category category) {

        return categoryRepository.save(category);
    }

    @Override
    public void DeleteCategory(int id) {
        categoryRepository.deleteById(id);
    }
}