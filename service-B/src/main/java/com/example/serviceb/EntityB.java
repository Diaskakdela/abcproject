package com.example.serviceb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EntityB {
    @Id
    private Long id;
    private String name;
}
