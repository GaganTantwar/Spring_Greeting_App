package com.springgreetingapp.controller;

import org.springframework.stereotype.Service;

@Service
public class GreetingServices {
    public Greeting getGreeting(){
        return new Greeting("Hello Welcome To BridgeLabz Training");
    }
}
