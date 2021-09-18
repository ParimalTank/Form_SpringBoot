package com.example.Form_Springboot.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Form {

    private @Id
    @GeneratedValue
    Long id;
    public String firstname;
    public String lastname;
    public long mobilenum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(long mobilenum) {
        this.mobilenum = mobilenum;
    }
}
