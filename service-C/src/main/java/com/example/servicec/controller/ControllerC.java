package com.example.servicec.controller;

import com.example.servicec.service.CService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class ControllerC {
    private final CService cService;

    public ControllerC(CService cService) {
        this.cService = cService;
    }

    @GetMapping("/a/{id}")
    public String getA(@PathVariable Long id){
        return cService.getA(id);
    }

    @GetMapping("/b/{id}")
    public String getB(@PathVariable Long id){
        return cService.getB(id);
    }
}
