package com.geek.ktldi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("EN")
public class I18NEnglishService implements GreetingService {
    @Override
    public String say() {
        return "Hello - English";
    }
}
