package com.example.servicea.repo;

import com.example.servicea.model.EntityA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityARepository extends JpaRepository<EntityA, Long> {
}
