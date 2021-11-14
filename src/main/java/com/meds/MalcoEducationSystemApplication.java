package com.meds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
////dao层对应的package路径
//@EnableJpaRepositories(basePackages = {"com.meds.infrastructure.repository"})
//扫描Entity
@EntityScan("com.meds.infrastructure.entity")
//扫描Controller，扫描Service
//@ComponentScan(value = {"com.meds.presentation", "com.meds.application", "com.meds.domain", "com.meds.infrastructure.repository"})
@SpringBootApplication
public class MalcoEducationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MalcoEducationSystemApplication.class, args);
    }

}
