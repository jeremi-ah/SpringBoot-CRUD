package com.crud.pet_service.dto;

import lombok.Data;

@Data
public class PetDto {
    private String name;
    private String color;
    private int age;
    private String species;
}
