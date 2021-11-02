package com.example.restservice.dao;

import com.example.restservice.models.Appoinment;

import java.util.List;

public interface AppoinmentDao {
    List<Appoinment> getAppoinments();
    Appoinment getAppoinment(int id);
    void updateAppoinment(Appoinment appoinment);
    void deleteAppoinment(int id);
    void createAppoinment(Appoinment appoinment);
}
