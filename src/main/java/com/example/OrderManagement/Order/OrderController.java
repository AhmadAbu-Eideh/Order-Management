package com.example.OrderManagement.Order;

import com.example.OrderManagement.Customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    private OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService)
    {
        this.orderService=orderService;
    }
    @GetMapping("/getAllOrders")
    public List<Order> getOrders()
    {
        return orderService.getOrders();
    }
    @GetMapping("/getOrdersById")
    public Order getOrdersById(@PathVariable int id)
    {
        return orderService.getOrderByID(id);
    }
    @PostMapping("/addOrders")
    public void addOrders(@RequestBody Order order)
    {
        orderService.addOrder(order);
    }
}
