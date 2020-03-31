package com.geek.ktldi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"default", "ES"})
public class I18NSpanishService implements GreetingService {
    @Override
    public String say() {
        return "Hola Mundo - Spanish";
    }
}
