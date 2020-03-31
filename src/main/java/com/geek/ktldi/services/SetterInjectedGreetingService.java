package com.geek.ktldi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String say() {
        return "Hello Guys & Girls! Setter";
    }
}
