package com.azure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to My Azure";
    }
}
