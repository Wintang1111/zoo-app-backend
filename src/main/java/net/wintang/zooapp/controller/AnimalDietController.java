package net.wintang.zooapp.controller;

import net.wintang.zooapp.dto.request.AnimalDietRequestDto;
import net.wintang.zooapp.dto.response.ResponseObject;
import net.wintang.zooapp.exception.NotFoundException;
import net.wintang.zooapp.service.IAnimalDietService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/diets")
public class AnimalDietController {

    private final IAnimalDietService animalDietService;

    public AnimalDietController(IAnimalDietService animalDietService) {
        this.animalDietService = animalDietService;
    }

    @GetMapping
    public ResponseEntity<ResponseObject> getDiets() {
        return animalDietService.getAnimalDiets();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseObject> getDietById(@PathVariable int id) throws NotFoundException {
        return animalDietService.getAnimalDietById(id);
    }

    @PostMapping
    public ResponseEntity<ResponseObject> createDiet(@RequestBody AnimalDietRequestDto animalDietRequestDto) {
        return animalDietService.createAnimalDiet(animalDietRequestDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseObject> deleteDietById(@PathVariable int id) throws NotFoundException {
        return animalDietService.deleteAnimalDIet(id);
    }
}