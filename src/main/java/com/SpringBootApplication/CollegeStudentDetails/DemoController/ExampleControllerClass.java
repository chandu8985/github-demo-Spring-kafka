package com.SpringBootApplication.CollegeStudentDetails.DemoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleControllerClass {
//@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String callingMethod() {
       return "calling method in Controllerlayer for Examples by chand : finally learning with consontration";
    }



}
