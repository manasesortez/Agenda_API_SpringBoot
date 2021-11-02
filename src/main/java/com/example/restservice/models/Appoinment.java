package com.example.restservice.models;
import javax.persistence.*;
import java.util.Date;

@Table(name = "appointment")
@Entity
public class Appoinment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id", nullable = false)
    private Integer id;

    @Column(name = "appointment_date")
    private Date appointmentDate;

    @Column(name = "appointment_description", length = 100)
    private String appointmentDescription;

    @ManyToOne(optional = false)
    @JoinColumn(name = "contact_id" , nullable = false)
    private Contact contactId;

    public Contact getContactId(){return contactId;}
    public void setContactId(Contact contactId){this.contactId= contactId;}

    public String getAppointmentDescription(){return appointmentDescription;}
    public void setAppointmentDescription(String appointmentDescription){this.appointmentDescription = appointmentDescription;}

    public Date getAppointmentDate(){return appointmentDate;}
    public void setAppointmentDate(Date appointmentDate){this.appointmentDate = appointmentDate;}

    public Integer getId(){return id;}
    public void setId(Integer id){this.id= id;}
}
