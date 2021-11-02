package com.example.restservice.models;
import javax.persistence.*;

@Table(name = "type_contacts")
@Entity
public class ContactType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id", nullable = false)
    private Integer id;

    @Column(name = "type_name", length = 50)
    private String contact_type;

    public String getContactType(){return contact_type;}
    public void setContactType(String contact_type){this.contact_type = contact_type;}

    public Integer getIdType(){return id;}
    public void setIdType(Integer id){this.id = id;}


}
