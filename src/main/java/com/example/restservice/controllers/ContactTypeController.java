package com.example.restservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restservice.models.ContactType;
import com.example.restservice.dao.ContactTypeDao;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class ContactTypeController {
    @Autowired
    ContactTypeDao contactTypeDao;

    @RequestMapping(value = "api/contactType/{id}",method = RequestMethod.GET)
    public ContactType getContactType(@PathVariable int id){
        return contactTypeDao.getContactType(id);
    }

    @RequestMapping(value = "api/contactTypes",method = RequestMethod.GET)
    public List<ContactType> getContactTypes(){
        return contactTypeDao.getContactTypes();
    }

    @RequestMapping(value = "api/contactType",method = RequestMethod.POST)
    public void createContactType(@RequestBody ContactType contactType){
        contactTypeDao.createContactType(contactType);
    }

    @RequestMapping(value = "api/contactType/{id}",method = RequestMethod.DELETE)
    public void deleteContactType(@PathVariable int id){
        contactTypeDao.deleteContactType(id);
    }

    @RequestMapping(value = "api/contactType",method = RequestMethod.PUT)
    public void updateContactType(@RequestBody ContactType contactType){
    }
}