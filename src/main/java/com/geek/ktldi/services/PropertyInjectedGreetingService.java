package com.geek.ktldi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String say() {
        return "Hello Guys & Girls! Property";
    }
}
