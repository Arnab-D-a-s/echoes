package com.example.springdockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdapterFacade{
    @RequestMapping("/demoTest")
    public String something(){
        System.out.println("Getting hits");
        return "Hey You!";
    }
}