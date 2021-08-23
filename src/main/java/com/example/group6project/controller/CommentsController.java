package com.example.group6project.controller;

import com.example.group6project.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

//    @GetMapping(value = "/") // change route to user servlet route
//    private String postAComment(Model model){
//          commentsService.postComment();
//    }
}
