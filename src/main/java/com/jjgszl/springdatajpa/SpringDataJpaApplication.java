package com.jjgszl.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executors;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {

        System.out.println("last commit");
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

}
