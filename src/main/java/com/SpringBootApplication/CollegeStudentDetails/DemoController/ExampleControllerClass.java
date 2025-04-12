package com.SpringBootApplication.CollegeStudentDetails.DemoController;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleControllerClass {

    @Value("$.welcome.message")
    private String welcomeMessage;

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String callingMethod() {
        return welcomeMessage;
    }

}
