package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetService implements GreetService{

    @Override
    public String sayGreeting() {
        return "Primary Hello";
    }
}
