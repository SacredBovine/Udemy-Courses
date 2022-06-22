package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new SetterInjectedController();
        controller.setGreetService(new ConstructorInjectedGreetService());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}