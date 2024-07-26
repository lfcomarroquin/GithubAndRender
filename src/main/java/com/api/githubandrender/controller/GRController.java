package com.api.githubandrender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GRController {

    @GetMapping("/hello/{name}")
    public String getName(@PathVariable String name) {
        return "Hola " + name + "!!";
    }

}