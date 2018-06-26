package com.example.springclouddemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springcloudtest")
public class TestController {

    @RequestMapping("/test")
    public void testSpringCloud(){

    }
}
