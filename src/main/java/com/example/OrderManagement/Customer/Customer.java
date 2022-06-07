package com.example.OrderManagement.Customer;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate bornAt;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, LocalDate bornAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAt = bornAt;
    }

    public Customer(String firstName, String lastName, LocalDate bornAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAt = bornAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBornAt() {
        return bornAt;
    }

    public void setBornAt(LocalDate bornAt) {
        this.bornAt = bornAt;
    }
}
