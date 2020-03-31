package com.geek.ktldi.controllers;

import com.geek.ktldi.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichIsTheBest() {
        return this.petService.getPetType();
    }
}
