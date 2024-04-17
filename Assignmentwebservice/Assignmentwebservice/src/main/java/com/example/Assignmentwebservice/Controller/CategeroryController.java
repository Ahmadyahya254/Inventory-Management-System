package com.example.Assignmentwebservice.Controller;


import com.example.Assignmentwebservice.Service.CategoryService;
import com.example.Assignmentwebservice.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
//HI test
@RestController
@RequestMapping("/Categorys")
public class CategeroryController {

    private CategoryService categoryService;

    public CategeroryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/")
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @PostMapping("/")
    public Category addCategory(@RequestBody Category category){
       category.setCategoryId(0);

        return  categoryService.save(category);
    }
    @PutMapping("/")
    public Category updataCategory(@RequestBody Category category){
        return  categoryService.save(category);
    }
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable int id) {
        categoryService.DeleteCategory(id);
        return "Category with id "+ id + " deleted";
    }

    @GetMapping("/{id}")
    public Category getCategory(@PathVariable int id) {
       Category category= categoryService.findBuId(id);
       if(category == null )
           throw new RuntimeException("Did not find Category id - " + id);
        return category;
    }

}

