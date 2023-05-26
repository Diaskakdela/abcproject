package com.example.servicea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EntityA {
    @Id
    private Long id;
    private String name;
}
