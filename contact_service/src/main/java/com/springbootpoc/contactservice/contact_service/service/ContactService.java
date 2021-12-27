package com.springbootpoc.contactservice.contact_service.service;

import com.springbootpoc.contactservice.contact_service.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactofUser(Long userId);

}
