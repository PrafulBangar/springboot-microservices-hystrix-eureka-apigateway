package com.springbootpoc.apigateway.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {


    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "user service is not available";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback(){
        return "contact service is unavailable";
    }
}
