package com.springgreetingapp.controller;

import com.springgreetingapp.controller.Greeting;
import com.springgreetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class GreetingServices{
    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting getGreeting() {
        return new Greeting("Hello, Welcome to BridgeLabz Training!");
    }

    public Greeting getPersonalizedGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return new Greeting("Hello, " + firstName + " " + lastName + "!");
        } else if (firstName != null) {
            return new Greeting("Hello, " + firstName + "!");
        } else if (lastName != null) {
            return new Greeting("Hello, " + lastName + "!");
        } else {
            return new Greeting("Hello, World!");
        }
    }

    public Greeting saveGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }public Greeting updateGreeting(Long id, Greeting updatedGreeting) {
        return greetingRepository.findById(id).map(greeting -> {
            greeting.setMessage(updatedGreeting.getMessage());
            return greetingRepository.save(greeting);
        }).orElseGet(() -> {
            updatedGreeting.setId(id);
            return greetingRepository.save(updatedGreeting);
        });
    }

}
