package com.springgreetingapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private GreetingServices greetingServices;
    @GetMapping
    public Greeting getGreeting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName){
        if (firstName != null || lastName != null) {
            return greetingServices.getPersonalizedGreeting(firstName, lastName);
        } else {
            return greetingServices.getGreeting();
        }
    }
    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting) {
        return greetingServices.saveGreeting(greeting);
    }
    @PutMapping
    public Greeting updateGreeting(@RequestBody Greeting greeting){
        return greetingServices.saveGreeting(greeting);
    }

}