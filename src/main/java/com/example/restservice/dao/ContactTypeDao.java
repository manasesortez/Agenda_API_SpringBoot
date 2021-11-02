package com.example.restservice.dao;

import com.example.restservice.models.ContactType;
import com.example.restservice.models.Product;

import java.util.List;

public interface ContactTypeDao{
    List<ContactType> getContactTypes();
    ContactType getContactType(int id);
    void updateContactType(ContactType contactType);
    void deleteContactType(int id);
    void createContactType(ContactType contactType);
}
