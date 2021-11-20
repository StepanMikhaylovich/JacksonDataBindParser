package com.itvdn.json.myJson.entity;

import java.util.List;

public class Person {
    private String firstname;
    private String lastname;
    private profession profession;
    private List<String> personalСontacts;

    public Person(){

    }

    public Person(String firstname, String lastname,
                  com.itvdn.json.myJson.entity.profession profession,
                  List<String> personalСontacts) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.profession = profession;
        this.personalСontacts = personalСontacts;
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

    public com.itvdn.json.myJson.entity.profession getProfession() {
        return profession;
    }

    public void setProfession(com.itvdn.json.myJson.entity.profession profession) {
        this.profession = profession;
    }

    public List<String> getPersonalСontacts() {
        return personalСontacts;
    }

    public void setPersonalСontacts(List<String> personalСontacts) {
        this.personalСontacts = personalСontacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", profession=" + profession +
                ", personalСontacts=" + personalСontacts +
                '}';
    }
}
