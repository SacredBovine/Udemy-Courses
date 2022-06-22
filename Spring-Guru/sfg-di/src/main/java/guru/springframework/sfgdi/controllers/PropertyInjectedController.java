package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetService")
    @Autowired
    public GreetService greetService;

    public String getGreeting(){
        return greetService.sayGreeting();
    }
}
