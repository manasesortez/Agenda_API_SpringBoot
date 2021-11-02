package com.example.restservice.controllers;

import com.example.restservice.dao.ContactTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.example.restservice.models.Contact;
import com.example.restservice.dao.ContactDao;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {
    @Autowired
    ContactDao contactDao;


}
