package com.example.group6project.models;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
public class Comments extends BaseModel{
    private String commentBody;

    @DateTimeFormat(pattern = "yy:mm:dd")
    private LocalDate localDate;
    @DateTimeFormat(pattern = "hh:mm:ss")
    private LocalTime localTime;
    @ManyToOne
    private Person person;
    @ManyToOne
    private Topic topic;

}
