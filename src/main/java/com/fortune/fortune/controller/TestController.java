package com.fortune.fortune.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class TestController {

    @GetMapping("/")
    public String test() {
        return "hello";
    }
}
