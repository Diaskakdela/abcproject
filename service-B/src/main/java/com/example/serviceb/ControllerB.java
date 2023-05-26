package com.example.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/service-b")
public class ControllerB {

    private final EntityBRepository entityBRepository;

    public ControllerB(EntityBRepository entityBRepository) {
        this.entityBRepository = entityBRepository;
    }

    @GetMapping("/{id}")
    public EntityB getEntityAById(@PathVariable Long id){
        return entityBRepository.findById(id).get();
    }
}
