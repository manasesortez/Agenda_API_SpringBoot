package com.example.restservice.dao;

import com.example.restservice.models.Appointment;

import java.util.List;

public interface AppointmentDao {
    List<Appointment> getAppoinments();
    Appointment getAppoinment(int id);
    void updateAppoinment(Appointment appointment);
    void deleteAppoinment(int id);
    void createAppoinment(Appointment appointment);
}
