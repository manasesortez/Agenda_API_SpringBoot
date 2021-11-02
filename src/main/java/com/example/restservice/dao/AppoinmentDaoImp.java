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
        return null;
    }

    @Override
    public Appoinment getAppoinment(int id) {
        return null;
    }

    @Override
    public void updateAppoinment(Appoinment appoinment) {

    }

    @Override
    public void deleteAppoinment(int id) {

    }

    @Override
    public void createAppoinment(Appoinment appoinment) {

    }
}
