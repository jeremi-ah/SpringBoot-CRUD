package com.crud.pet_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    private int age;
    private String species;
}
