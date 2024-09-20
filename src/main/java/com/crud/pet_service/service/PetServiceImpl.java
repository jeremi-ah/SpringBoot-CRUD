package com.crud.pet_service.service;

import com.crud.pet_service.model.Pet;
import com.crud.pet_service.repository.PetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
@AllArgsConstructor
public class PetServiceImpl implements PetService {
    private PetRepository petRepository;

    @Override
    public Pet addPet(Pet pet) {
        return petRepository.save(pet) ;
    }

    @Override
    public List<Pet> getPets() {
        return petRepository.findAll().stream().toList();
    }

    @Override
    public Pet updatePet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void deletePet(Long id) {
        petRepository.deleteById(id);

    }

    @Override
    public Pet getPet(Long id) {
        return petRepository.findById(id).orElseThrow(
                () ->new NoSuchElementException(
                        "No PET PRESENT WITH ID "+id));
    }
}
