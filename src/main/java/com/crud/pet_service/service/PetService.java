package com.crud.pet_service.service;

import com.crud.pet_service.dto.PetDto;
import com.crud.pet_service.model.Pet;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


public interface PetService {
    Pet addPet(Pet pet);
    List<Pet> getPets();
    Pet updatePet(Pet pet);
    void deletePet(Long id);
    Pet getPet(Long id) throws NoSuchElementException;
}
