package com.example.servicea.controller;

import com.example.servicea.model.EntityA;
import com.example.servicea.repo.EntityARepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/service-a")
public class ControllerA {

    private final EntityARepository entityARepository;

    public ControllerA(EntityARepository entityARepository) {
        this.entityARepository = entityARepository;
    }

    @GetMapping("/{id}")
    public EntityA getEntityAById(@PathVariable Long id){
        return entityARepository.findById(id).get();
    }
}
