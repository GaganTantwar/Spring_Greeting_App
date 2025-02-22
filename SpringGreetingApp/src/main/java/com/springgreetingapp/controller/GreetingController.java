package com.springgreetingapp.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping
    public Greeting getGreeting(){
        return new Greeting("Hello World");
    }
    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting){
        return greeting;
    }
    @PutMapping
    public Greeting updateGreeting(@RequestBody Greeting greeting){
        return greeting;
    }

}
