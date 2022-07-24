package com.bzhang.jksgame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRest {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
