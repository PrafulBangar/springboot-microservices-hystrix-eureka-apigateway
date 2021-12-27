package com.springbootpoc.contactservice.contact_service.controller;

import com.springbootpoc.contactservice.contact_service.entity.Contact;
import com.springbootpoc.contactservice.contact_service.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
@Autowired
    ContactServiceImpl contactService;

    @GetMapping("/contact/{userId}")
    List<Contact> getContactdetailsforUser(@PathVariable("userId") Long userId)
    {
       List<Contact> resultContactList=contactService.getContactofUser(userId);
       return resultContactList;
    }


}
