package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetService());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}