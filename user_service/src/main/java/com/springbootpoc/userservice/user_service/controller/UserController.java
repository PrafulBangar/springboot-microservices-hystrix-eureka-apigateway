package com.springbootpoc.userservice.user_service.controller;

import com.springbootpoc.userservice.user_service.entity.Contact;
import com.springbootpoc.userservice.user_service.entity.User;
import com.springbootpoc.userservice.user_service.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user/{userId}")
        public User getUsersList(@PathVariable("userId") Long userId){
        User user= userService.getUsersList(userId);
        List<Contact> contactinfo=restTemplate.getForObject("http://Contact-Service/contact/"+user.getUserId(),List.class);
        user.setContacts(contactinfo);
        return user;
    }
}
