package com.springbootpoc.contactservice.contact_service.service;

import com.springbootpoc.contactservice.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

  private static   List<Contact> contactList =new ArrayList<Contact>();
    static{

    contactList.add(new Contact(1L,"abc@gmail.com","abc",123L));
    contactList.add(new Contact(2L,"pqr@gmail.com","pqr",456L));
    contactList.add(new Contact(3L,"xyz@gmail.com","xyz",789L));

}

    @Override
    public List<Contact> getContactofUser(Long userId) {

        List<Contact> ContactlistforUserId=contactList.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
        return ContactlistforUserId;

    }
}
