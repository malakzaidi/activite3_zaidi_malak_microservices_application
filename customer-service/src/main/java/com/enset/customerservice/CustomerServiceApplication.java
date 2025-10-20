package com.enset.customerservice;

import com.enset.customerservice.entities.Customer;
import com.enset.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner init(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("c1").email("c1@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("c2").email("c2@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("c3").email("c3@gmail.com")
                    .build());
            customerRepository.findAll().forEach(c ->
            {
                System.out.println("=================");
                System.out.println(c.getId());
                System.out.println(c.getName());
                System.out.println(c.getEmail());
                System.out.println("=================");

            });





        };
    }

}
