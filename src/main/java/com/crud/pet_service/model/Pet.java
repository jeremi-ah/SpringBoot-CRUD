package com.crud.pet_service.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Transactional
@Table(name="pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name must not be blank")
    private String name;
    private String color;
    private int age;
    private String species;
}
