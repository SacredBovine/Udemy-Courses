package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetService implements GreetService {
    @Override
    public String sayGreeting() {
        return "Constructor Hello";

    }
}
