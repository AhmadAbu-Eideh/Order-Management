package com.example.OrderManagement.ProductOrder;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductOrderConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductOrderRepository repository)
    {
        return args ->
        {

        };
    }
}
