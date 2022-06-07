package com.example.OrderManagement.Product;

import com.example.OrderManagement.Order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }
    @GetMapping("/getAllProducts")
    public List<Product> getProducts()
    {
        return productService.getProducts();
    }
    @GetMapping("/getProductsById")
    public Product getProductsById(@PathVariable int id)
    {
        return productService.getProductByID(id);
    }
    @PostMapping("/addProducts")
    public void addProducts(@RequestBody Product product)
    {
        productService.addProduct(product);
    }


}
