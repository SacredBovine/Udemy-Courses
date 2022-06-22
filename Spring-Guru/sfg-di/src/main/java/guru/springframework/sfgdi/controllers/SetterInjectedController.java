package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetService greetService;

    @Qualifier("setterInjectedGreetService")
    @Autowired
    public void setGreetService(GreetService greetService) {
        this.greetService = greetService;
    }

    public String getGreeting(){
        return greetService.sayGreeting();
    }
}
