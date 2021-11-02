package com.example.restservice.dao;

import com.example.restservice.models.ContactType;
import com.example.restservice.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ContactTypeDaoImp implements ContactTypeDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ContactType> getContactTypes() {
        String query = String.format("FROM ContactType");
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public ContactType getContactType(int id) {
        String query = String.format("FROM ContactType CT WHERE CT.id = %d", id);
        return (ContactType) entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public void updateContactType(ContactType contactType) {
        entityManager.merge(contactType);
    }

    @Override
    public void deleteContactType(int id) {
        ContactType contactType = entityManager.find(ContactType.class,id);
        entityManager.remove(contactType);
    }

    @Override
    public void createContactType(ContactType contactType) {
        entityManager.merge(contactType);
    }
}
