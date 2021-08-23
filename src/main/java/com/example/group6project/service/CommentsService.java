package com.example.group6project.service;

import com.example.group6project.models.Comments;
import com.example.group6project.models.Person;
import com.example.group6project.models.Topic;

import java.util.List;

public interface CommentsService { ;
    List<Comments> findAllCommentsByTopicAndId(Long id);
    void postComment(Person person, Topic topic);


}
