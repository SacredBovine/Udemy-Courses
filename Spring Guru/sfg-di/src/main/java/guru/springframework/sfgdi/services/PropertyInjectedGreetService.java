package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetService implements GreetService{
    @Override
    public String sayGreeting() {
        return "Property Hello";
    }
}
