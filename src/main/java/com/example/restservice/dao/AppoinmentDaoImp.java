package com.example.restservice.dao;

import com.example.restservice.models.Appoinment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class AppoinmentDaoImp implements AppoinmentDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Appoinment> getAppoinments() {
        String query = String.format("FROM Appoinment");
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Appoinment getAppoinment(int id) {
        String query = String.format("FROM Appoinment A WHERE A.id = %d", id);
        return (Appoinment) entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public void updateAppoinment(Appoinment appoinment) {
        entityManager.merge(appoinment);
    }

    @Override
    public void deleteAppoinment(int id) {
        Appoinment appoinment = entityManager.find(Appoinment.class, id);
        entityManager.remove(appoinment);
    }

    @Override
    public void createAppoinment(Appoinment appoinment) {
        entityManager.merge(appoinment);
    }
}
