package com.example.restservice.controllers;

import com.example.restservice.dao.ContactTypeDao;
import com.example.restservice.models.ContactType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restservice.models.Contact;
import com.example.restservice.dao.ContactDao;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {
    @Autowired
    ContactDao contactDao;

    @RequestMapping(value = "api/contact/{id}",method = RequestMethod.GET)
    public Contact getContact(@PathVariable int id){
        return contactDao.getContact(id);
    }

    @RequestMapping(value = "api/contacts",method = RequestMethod.GET)
    public List<Contact> getContacts(){
        return contactDao.getContacts();
    }

    @RequestMapping(value = "api/contact",method = RequestMethod.POST)
    public void createContact(@RequestBody Contact contact){
        contactDao.createContact(contact);
    }

    @RequestMapping(value = "api/contact/{id}",method = RequestMethod.DELETE)
    public void deleteContact(@PathVariable int id){
        contactDao.deleteContact(id);
    }

    @RequestMapping(value = "api/contact",method = RequestMethod.PUT)
    public void updateContact(@RequestBody Contact contact){
        contact.setName(contact.getName());
        contact.setLastname(contact.getLastname());
        contact.setContactNumber(contact.getContactNumber());
        contact.setConctactEmail(contact.getConctactEmail());
        contact.setContactAddress(contact.getContactAddress());
        contact.setTypeId(contact.getTypeId());
        contact.setUserId(contact.getUserId());
        contactDao.updateContact(contact);
    }
}
