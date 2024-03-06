package ru.snovit.simpleweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("")
    public String sayHello() {
        return "Hello World!";
    }
}
