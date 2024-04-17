package com.example.Assignmentwebservice.Controller;

import com.example.Assignmentwebservice.Service.ProductService;
import com.example.Assignmentwebservice.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping("/")
    public Product addProduct(@RequestBody Product product){
        product.setProductId(0);
        return productService.save(product);
    }


    @PutMapping("/")
    public Product updateProduct(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product with id " + id + " deleted";
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        Product product = productService.findById(id);
        if(product == null) {
            throw new RuntimeException("Did not find product id - " + id);
        }
        return product;
    }
}
