package com.example.OrderManagement.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getOrders()
    {
        return orderRepository.findAll();
    }
    public Order getOrderByID(int id)
    {
        return orderRepository.findById(id).get();
    }
    public void addOrder(Order order)
    {
        orderRepository.save(order);
    }

}
