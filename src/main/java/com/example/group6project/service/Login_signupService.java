package com.example.group6project.service;

import com.example.group6project.models.Person;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

public interface Login_signupService {
    public String register(Person person);
    public ModelAndView login(@ModelAttribute("Person") Person person, ModelAndView modelAndView);
}
