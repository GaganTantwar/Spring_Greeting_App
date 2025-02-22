package com.springgreetingapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private GreetingServices greetingServices;
    @GetMapping
    public Greeting getGreeting(){
        return greetingServices.getGreeting();
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
