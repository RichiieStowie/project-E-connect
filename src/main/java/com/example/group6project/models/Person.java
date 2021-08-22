package com.example.group6project.models;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Person extends BaseModel{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userName;
}
