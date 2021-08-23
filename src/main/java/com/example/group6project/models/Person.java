package com.example.group6project.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseModel{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userName;
    @OneToMany
    List<Comments> Comments;
    @OneToMany
    List<Topic> topic;
}
