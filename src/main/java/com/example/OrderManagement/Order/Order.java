package com.example.OrderManagement.Order;
import com.example.OrderManagement.Customer.Customer;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;
    private Date orderedAt;

    public Order() {
    }

    public Order(int id, Customer customer, Date orderedAt) {
        this.id = id;
        this.customer = customer;
        this.orderedAt = orderedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomerId() {
        return customer;
    }

    public void setCustomerId(Customer customerId) {
        this.customer = customerId;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }
}
