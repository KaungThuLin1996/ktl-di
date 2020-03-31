package com.geek.ktldi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryBeanGreetingService implements GreetingService {
    @Override
    public String say() {
        return "Hello Guys & Girls! Primary Bean";
    }
}
