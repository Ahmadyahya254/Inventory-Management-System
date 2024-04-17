//package com.example.Assignmentwebservice.entity;
//
//import jakarta.persistence.*;
//
//import java.math.BigDecimal;
//import java.util.HashSet;
//import java.util.Set;
//
//
//@Entity
//@Table(name = "PRODUCT")
//
//public class Product {
//
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ProductID")
//    private int productId;
//    @Column(name = "Name")
//    private String name;
//    @Column(name = "Description")
//    private String description;
//    @Column(name = "Price")
//    private BigDecimal price;
//
//    public int getCatid() {
//        return catid;
//    }
//
//    public void setCatid(int catid) {
//        this.catid = catid;
//    }
//
//    @Column(name = "CategoryID")
//    private int catid;
//
//    public Product() {
//    }
//
//    public Product(int productId, String name, String description, BigDecimal price) {
//        this.productId = productId;
//        this.name = name;
//        this.description = description;
//        this.price = price;
//    }
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "productId=" + productId +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", price=" + price +
//                '}';
//    }
//
//}

package com.example.Assignmentwebservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCT")

public class Product {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private int productId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "Price")
    private BigDecimal price;

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    @Column(name = "CategoryID")
    private int catid;



}

