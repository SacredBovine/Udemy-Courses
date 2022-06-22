package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetService greetService;

    public MyController(GreetService greetService) {
        this.greetService = greetService;
    }

    public String sayHello(){
       return greetService.sayGreeting();
    }
}
