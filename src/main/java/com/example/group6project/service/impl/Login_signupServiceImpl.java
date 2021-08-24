package com.example.group6project.service.impl;

import com.example.group6project.models.Person;
import com.example.group6project.repository.PersonRepository;
import com.example.group6project.service.Login_signupService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Login_signupServiceImpl implements Login_signupService {
    @Autowired
    private final PersonRepository personRepository;

    @Override
    public String register(Person person) {
        personRepository.save(person);
        return "user has been added to the database";
    }

    @Override
    public ModelAndView login(Person person, ModelAndView modelAndView) {
        Optional<Person> userExist = personRepository.findByUsername(person.getUsername());
        System.out.println("USER#### " + userExist);
        if (userExist.isPresent() && person.getPassword().equals(userExist.get().getPassword())) {
            if (userExist.get().getUserType().equals("admin")){
                modelAndView.setViewName("AdminHomePage");
            }
            else{
                modelAndView.setViewName("UserHomePage");
            }
        }
        else    {
            modelAndView.setViewName("registrationPage");
            modelAndView.addObject("error", "Please signup to proceed");
        }
        return modelAndView;
    }
}
