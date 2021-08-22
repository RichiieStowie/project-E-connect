package com.example.group6project.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Entity
@Data
@Table
public class Topic extends BaseModel{

    private String topicTitle;
    private LocalDate dateCreated;
    private LocalTime timeCreated;
    private Boolean topicStatus;



}
