package com.example.restservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.example.restservice.models.ContactType;
import com.example.restservice.dao.ContactTypeDao;


@RestController
@CrossOrigin(origins = "*")
public class ContactTypeController {
    @Autowired
    ContactTypeDao contactTypeDao;
}