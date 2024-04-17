//package com.example.Assignmentwebservice.entity;
//
//import jakarta.persistence.*;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//
//@Entity
//@Table(name = "`ORDER`")
//public class Order {
////hi
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//
//
//    @Column(name = "OrderID")
//    private int orderId;
//
//
//    @Column(name = "TotalPrice")
//    private BigDecimal totalPrice;
//
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "Date")
//
//    private Date date;
//
//    public int getCuid() {
//        return Cuid;
//    }
//
//    public void setCuid(int cuid) {
//        Cuid = cuid;
//    }
//
//    @Column(name = "CustomerID")
//   private  int Cuid;
//
//    public Order() {
//
//    }
//    public Order(int orderId, BigDecimal totalPrice, Date date) {
//        this.orderId = orderId;
//        this.totalPrice = totalPrice;
//        this.date = date;
//    }
//
//    public int getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(int orderId) {
//        this.orderId = orderId;
//    }
//
//    public BigDecimal getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(BigDecimal totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    @Override
//    public String toString() {
//        return "Order{" +
//                "orderId=" + orderId +
//                ", totalPrice=" + totalPrice +
//                ", date=" + date +
//                '}';
//    }
//
//}
//

package com.example.Assignmentwebservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "`ORDER`")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customer customer;

    @Column(name = "TotalPrice")
    private BigDecimal totalPrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Date")
    private Date date;



}

