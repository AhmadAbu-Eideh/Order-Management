package com.example.OrderManagement.Stock;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StockConfig {

    @Bean
    CommandLineRunner commandLineRunner(StockRepository repository)
    {
        return args ->
        {

        };
    }
}
