package controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/say", produces = MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    public String sayHello() {
        return "Hello world!";
    }

}
