package com.example.SecureBankSystem.controller;

import com.example.SecureBankSystem.CreatFramewellRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("/api/v1")
public class CodedController {
    @GetMapping("/sayhi")
    public String sayHit() {
        return "Welcome to Coded";
    }

    @GetMapping("/greet")
    public String great(@RequestParam String name) {
        return "Hello," + name + " ! ";
    }

    @PostMapping("/farewell")
    public String farewell(@RequestBody CreatFramewellRequest creatFramewellRequest) {
        return "Goodbye, " + creatFramewellRequest.getName();
    }

}
