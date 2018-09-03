package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    // Qualifier on setter can be on method or parameter
    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
