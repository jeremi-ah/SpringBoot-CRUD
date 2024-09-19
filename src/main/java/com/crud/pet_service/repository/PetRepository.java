package com.crud.pet_service.repository;

import com.crud.pet_service.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
