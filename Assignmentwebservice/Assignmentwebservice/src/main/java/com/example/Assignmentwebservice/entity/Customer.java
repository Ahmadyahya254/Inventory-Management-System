//package com.example.Assignmentwebservice.entity;
//
//
//import jakarta.persistence.*;
//
//import java.util.HashSet;
//import java.util.Set;
//
//
//@Entity
//@Table(name = "CUSTOMER")
//
//public class Customer {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "CustomerID")
//    private int customerId;
//
//    @Column(name = "Name")
//    private String name;
//
//    @Column(name = "Email")
//    private String email;
//
//    public Customer() {
//    }
//
//    public Customer(int customerId, String name, String email) {
//        this.customerId = customerId;
//        this.name = name;
//        this.email = email;
//    }
//
//
//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
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
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "customerId=" + customerId +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//
//
//}


package com.example.Assignmentwebservice.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "CUSTOMER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerID")
    private int customerId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Order> orders = new HashSet<>();


}
