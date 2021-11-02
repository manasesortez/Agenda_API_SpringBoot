package com.example.restservice.dao;

import com.example.restservice.models.Appointment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class AppointmentDaoImp implements AppointmentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Appointment> getAppoinments() {
        String query = String.format("FROM Appointment");
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Appointment getAppoinment(int id) {
        String query = String.format("FROM Appointment A WHERE A.id = %d", id);
        return (Appointment) entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public void updateAppoinment(Appointment appointment) {
        entityManager.merge(appointment);
    }

    @Override
    public void deleteAppoinment(int id) {
        Appointment appointment = entityManager.find(Appointment.class, id);
        entityManager.remove(appointment);
    }

    @Override
    public void createAppoinment(Appointment appointment) {
        entityManager.merge(appointment);
    }
}
