package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetService implements GreetService{

    @Override
    public String sayGreeting() {
        return "Setter Hello";
    }
}
