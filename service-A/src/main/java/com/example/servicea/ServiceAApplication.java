package com.example.servicea;

import com.example.servicea.model.EntityA;
import com.example.servicea.repo.EntityARepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }
//    @Bean
//    public CommandLineRunner commandLineRunner(EntityARepository entityARepository){
//        entityARepository.save(new EntityA(1L,"i am a"));
//        return new CommandLineRunner() {
//        }
//    }
}
