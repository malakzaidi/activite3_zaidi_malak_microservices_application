package com.enset.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder
@Getter
@Setter
public class Customer {
    @Id @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

}
