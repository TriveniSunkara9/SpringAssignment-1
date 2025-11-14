package com.Tricon.SpringAssignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;
//@Controller
@RestController
public class Hello {
    @RequestMapping("/")
//    @ResponseBody
    public String greet()
    {
        System.out.println("Hello Spring!...");
        return "Hello Spring!....";
    }

}
