package com.metropolitan.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="registered_children", uniqueConstraints = @UniqueConstraint(columnNames = "registrationNumber")  )
public class Child {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String placeBirth;
    @Column(nullable = false)
    private int registrationNumber;
    @Column(nullable = false)
    private Date dateBorn;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String motherName;
    @Column(nullable = false)
    private int ageMother;
    @Column(nullable = false)
    private String occupationMother;
    @Column(nullable = false)
    private String maritalStatus;


    public Child(){

    }


    public Child(String firstName,String lastName,String placeBirth, int registrationNumber,Date dateBorn,String gender,
                 String motherName,int ageMother,String occupationMother,String maritalStatus) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.placeBirth = placeBirth;
        this.registrationNumber = registrationNumber;
        this.dateBorn = dateBorn;
        this.gender =gender;
        this.motherName = motherName;
        this.ageMother=ageMother;
        this.occupationMother=occupationMother;
        this.maritalStatus=maritalStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getAgeMother() {
        return ageMother;
    }

    public void setAgeMother(int ageMother) {
        this.ageMother = ageMother;
    }

    public String getOccupationMother() {
        return occupationMother;
    }

    public void setOccupationMother(String occupationMother) {
        this.occupationMother = occupationMother;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}




