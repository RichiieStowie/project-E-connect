package com.example.group6project.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
public class Person extends BaseModel{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userName;
//    @ManyToMany
//    private List<Comments> listOfComments;
}
