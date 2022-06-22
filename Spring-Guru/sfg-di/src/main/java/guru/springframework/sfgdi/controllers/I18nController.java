package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController { //I18n is shorthand for international

    private final GreetService greetService;

    public I18nController(@Qualifier("i18nService") GreetService greetService) {
        this.greetService = greetService;
    }

    public String  sayGreeting(){
        return greetService.sayGreeting();
    }
}
