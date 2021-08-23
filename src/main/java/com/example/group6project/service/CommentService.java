package com.example.group6project.service;

import com.example.group6project.models.Comments;
import com.example.group6project.models.Person;
import com.example.group6project.models.Topic;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CommentService {
    void createNewComment(Topic topic, Person person,String commentBody);
    List<Comments> displayAllCommentsOnATopic(Long id);
}
