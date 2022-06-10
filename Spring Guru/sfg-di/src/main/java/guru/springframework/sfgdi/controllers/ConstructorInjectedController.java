package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetService greetService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetService") GreetService greetService) {
        this.greetService = greetService;
    }
    public String getGreeting(){
        return greetService.sayGreeting();
    }

}
