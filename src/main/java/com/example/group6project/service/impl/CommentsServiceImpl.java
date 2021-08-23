package com.example.group6project.service.impl;

import com.example.group6project.models.Comments;
import com.example.group6project.models.Person;
import com.example.group6project.models.Topic;
import com.example.group6project.repository.CommentsRepository;
import com.example.group6project.service.CommentsService;
import com.example.group6project.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    private CommentsRepository commentsRepository;
    @Autowired
    private TopicService topicService;



    @Override
    public List<Comments> findAllCommentsByTopicAndId(Long id) {
    Topic topic1 = topicService.findById(id);
     return commentsRepository.findCommentsByTopic(topic1);

    }

    @Override
    public void postComment(Person person, Topic topic) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
            Comments comments = new Comments();
            comments.setLocalTime(localTime);
            comments.setLocalDate(localDate);
            comments.setPerson(person);
            comments.setTopic(topic);
            commentsRepository.save(comments);

    }



}
