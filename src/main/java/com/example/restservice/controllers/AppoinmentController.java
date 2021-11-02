package com.example.restservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restservice.models.Appoinment;
import com.example.restservice.dao.AppoinmentDao;

import java.util.List;

@RestController
@CrossOrigin(origins = "**")
public class AppoinmentController {
    @Autowired
    AppoinmentDao appoinmentDao;

    @RequestMapping(value = "api/appointment/{id}",method = RequestMethod.GET)
    public Appoinment getAppoinment(@PathVariable int id){
        return appoinmentDao.getAppoinment(id);
    }

    @RequestMapping(value = "api/appointments",method = RequestMethod.GET)
    public List<Appoinment> getAppoinments(){
        return appoinmentDao.getAppoinments();
    }
    @RequestMapping(value = "api/appointment",method = RequestMethod.POST)
    public void createAppoinment(@RequestBody Appoinment appoinment){
        appoinmentDao.createAppoinment(appoinment);
    }

    @RequestMapping(value = "api/appointment/{id}",method = RequestMethod.DELETE)
    public void deleteAppoinment(@PathVariable int id){
        appoinmentDao.deleteAppoinment(id);
    }

    @RequestMapping(value = "api/appointment",method = RequestMethod.PUT)
    public void updateAppoinment(@RequestBody Appoinment appoinment){
        appoinmentDao.updateAppoinment(appoinment);
    }
}
