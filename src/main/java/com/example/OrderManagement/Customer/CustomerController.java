package com.example.OrderManagement.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService=customerService;
    }
    @GetMapping("/getAllCustomers")
    public List<Customer> getCustomers()
    {
            return customerService.getCustomers();
    }
    @GetMapping("/getCustomersById")
    public Customer getCustomersById(@PathVariable int id)
    {
        return customerService.getCustomerByID(id);
    }
    @PostMapping("/addCustomers")
    public void addCustomers(@RequestBody Customer customer)
    {
        customerService.addCustomer(customer);
    }

}
