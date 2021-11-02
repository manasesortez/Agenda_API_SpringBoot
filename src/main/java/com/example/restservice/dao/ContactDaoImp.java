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
        String query = String.format("FROM Contact");
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Contact getContact(int id) {
        String query = String.format("FROM Contact CO WHERE CO.id = %d", id);
        return (Contact) entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public void updateContact(Contact contact) {
        entityManager.merge(contact);
    }

    @Override
    public void deleteContact(int id) {
        Contact contact = entityManager.find(Contact.class, id);
        entityManager.remove(contact);
    }

    @Override
    public void createContact(Contact contact) {
        entityManager.merge(contact);
    }
}
