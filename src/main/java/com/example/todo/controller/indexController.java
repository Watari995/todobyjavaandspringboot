package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class indexController {

    //http:localhost:8080/ -> "hello, world"
    @GetMapping
    public String index() {
        return "index";
    }
}
