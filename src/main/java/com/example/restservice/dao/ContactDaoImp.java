package com.example.restservice.dao;

import com.example.restservice.models.Contact;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ContactDaoImp implements ContactDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Contact> getContacts() {
        return null;
    }

    @Override
    public Contact getContact(int id) {
        return null;
    }

    @Override
    public void updateContact(Contact contact) {

    }

    @Override
    public void deleteContact(int id) {

    }

    @Override
    public void createContact(Contact contact) {

    }
}
