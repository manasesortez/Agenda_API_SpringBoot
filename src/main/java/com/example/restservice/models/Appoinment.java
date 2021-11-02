package com.example.restservice.models;

import java.util.Date;
import javax.persistence.*;

@Table(name = "appointment")
@Entity
public class Appoinment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id", nullable = false)
    private Integer id;

    @Column(name = "appointment_date", length = 50)
    private String appointmentDate;

    @Column(name = "appointment_description", length = 100)
    private String appointmentDescription;

    @ManyToOne(optional = false)
    @JoinColumn(name = "contact_id" , nullable = false)
    private Contact contactId;

    public Contact getContactId(){return contactId;}
    public void setContactId(Contact contactId){this.contactId= contactId;}

    public String getAppointmentDescription(){return appointmentDescription;}
    public void setAppointmentDescription(String appointmentDescription){this.appointmentDescription = appointmentDescription;}

    public String getAppointmentDate(){return appointmentDate;}
    public void setAppointmentDate(String appointmentDate){this.appointmentDate = appointmentDate;}

    public Integer getId(){return id;}
    public void setId(Integer id){this.id= id;}
}
