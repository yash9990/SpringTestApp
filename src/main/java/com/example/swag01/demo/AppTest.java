package com.example.swag01.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppTest {

    @RequestMapping("/dev")
    public String ping(){
        return "This is dev branch!";
    }
}
