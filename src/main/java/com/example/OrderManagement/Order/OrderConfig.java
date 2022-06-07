package com.example.OrderManagement.Order;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    @Bean
    CommandLineRunner commandLineRunner(OrderRepository repository)
    {
        return args ->
        {

        };
    }
}
