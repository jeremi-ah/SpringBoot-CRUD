package com.crud.pet_service.Controller;

import com.crud.pet_service.dto.PetDto;
import com.crud.pet_service.model.Pet;
import com.crud.pet_service.service.PetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pets")
@AllArgsConstructor
public class PetController {
    private PetService petService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<PetDto> getAllPets() {
    return petService.getPets();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
        public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
        }

    @DeleteMapping("/pet/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Pet updatePet(@RequestBody Pet pet) {
        return petService.updatePet(pet);
    }

    @GetMapping("/pet/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Pet getPet(@PathVariable Long id) throws Exception {
        return petService.getPet(id);
    }

}
