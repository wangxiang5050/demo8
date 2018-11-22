package com.example.demo8.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/hello")
    public String HelloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/myBranch")
    public String myBranch() {
        return "This is my branch";
    }

}
