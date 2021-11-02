package com.example.restservice.models;
import javax.persistence.*;
import java.util.Date;

@Table(name = "contacts")
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id", nullable = false)
    private Integer id;

    @Column(name = "contact_name", length = 50)
    private String name;

    @Column(name = "contact_lastname", length = 50)
    private String lastname;

    @Column(name = "contact_number", length = 10)
    private String contactNumber;

    @Lob
    @Column(name = "conctact_email")
    private String conctactEmail;

    @Column(name = "contact_adress", length = 100)
    private String contactAddress;

    @ManyToOne(optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    private ContactType typeId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_user", nullable = false)
    private User userId;

    public User getUserId() {
        return userId;
    }
    public void setUserId(User userId) {
        this.userId = userId;
    }

    public ContactType getTypeId(){return typeId;}
    public void setTypeId(ContactType typeId){ this.typeId = typeId;}

    public String getContactAddress(){return contactAddress;}
    public void setContactAddress(String contactAddress){this.contactAddress = contactAddress;}

    public String getConctactEmail(){return conctactEmail;}
    public void setConctactEmail(String conctactEmail){this.conctactEmail =  conctactEmail;}

    public String getContactNumber(){return contactNumber;}
    public void setContactNumber(String contactNumber){this.contactNumber = contactNumber;}

    public String getLastname(){return lastname;}
    public void setLastname(String lastname){this.lastname = lastname;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}
}
