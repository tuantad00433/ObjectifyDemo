package com.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Unindex;

@Entity
public class Student {
    @Id
    private String id;
    @Index
    private String fullName;
    @Unindex
    private String address;
    @Index
    private String email;
    @Index
    private int status; //0: Dead; 1: Alive.
    @Index
    private String rollNumber;

    public Student() {
        id = "";
        fullName = "";
        address = "";
        email = "";
        status = 0;
        rollNumber = "";
    }

    public Student(String id, String fullName, String address, String email, int status, String rollNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.status = status;
        this.rollNumber = rollNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
