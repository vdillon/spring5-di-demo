package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


/**
 * Created by jt on 5/24/17.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    //@Qualifier("greetingServiceImpl")
    // Can use qualifier or give property same name as desired bean and Spring uses reflection to find it
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
