package com.example.restservice.dao;

import com.example.restservice.models.Contact;
import com.example.restservice.models.ContactType;
import com.example.restservice.models.Role;

import java.util.List;

public interface ContactDao {
    List<Contact> getContacts();
    Contact getContact(int id);
    void updateContact(Contact contact);
    void deleteContact(int id);
    void createContact(Contact contact);
}
