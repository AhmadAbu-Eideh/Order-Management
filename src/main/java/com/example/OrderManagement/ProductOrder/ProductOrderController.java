package com.example.OrderManagement.ProductOrder;

import com.example.OrderManagement.Order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductOrderController {
    private ProductOrderService productOrderService;
    @Autowired
    public ProductOrderController(ProductOrderService productOrderService)
    {
        this.productOrderService=productOrderService;
    }
    @GetMapping("/getAllProductOrders")
    public List<ProductOrder> getProductOrders() {
        return productOrderService.getProductOrders();
    }
    @PostMapping("/addProductOrders")
    public void addProductOrders(@RequestBody ProductOrder productOrder)
    {
        productOrderService.addProductOrder(productOrder);
    }
}
