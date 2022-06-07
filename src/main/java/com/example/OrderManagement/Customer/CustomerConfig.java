package com.example.OrderManagement.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;


@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository)
    {
        return args ->
        {
            new Customer(
                    1,
                    "Ahmad",
                    "Abu-Eideh",
                    LocalDate.of(2001, Month.JANUARY,26)
            );
            new Customer(

                    "Jack",
                    "Daniels",
                    LocalDate.of(1980, Month.AUGUST,15)
            );

        };
    }
}
