package com.jjgszl.springdatajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String queryUserByNameUseJPQL(Integer id){
        System.out.println("webhook test");
        return "last commit";
    }
}
