package com.example.restservice.controllers;

import com.example.restservice.models.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restservice.dao.AppointmentDao;

import java.util.List;

@RestController
@CrossOrigin(origins = "**")
public class AppointmentController {
    @Autowired
    AppointmentDao appointmentDao;

    @RequestMapping(value = "api/appointment/{id}",method = RequestMethod.GET)
    public Appointment getAppoinment(@PathVariable int id){
        return appointmentDao.getAppoinment(id);
    }

    @RequestMapping(value = "api/appointments",method = RequestMethod.GET)
    public List<Appointment> getAppoinments(){
        return appointmentDao.getAppoinments();
    }

    @RequestMapping(value = "api/appointment",method = RequestMethod.POST)
    public void createAppoinment(@RequestBody Appointment appointment){
        appointmentDao.createAppoinment(appointment);
    }

    @RequestMapping(value = "api/appointment/{id}",method = RequestMethod.DELETE)
    public void deleteAppoinment(@PathVariable int id){
        appointmentDao.deleteAppoinment(id);
    }

    @RequestMapping(value = "api/appointment",method = RequestMethod.PUT)
    public void updateAppoinment(@RequestBody Appointment appointment){
        appointment.setAppointmentDate(appointment.getAppointmentDate());
        appointment.setAppointmentDescription(appointment.getAppointmentDescription());
        appointment.setId(appointment.getId());
        appointmentDao.updateAppoinment(appointment);
    }
}
