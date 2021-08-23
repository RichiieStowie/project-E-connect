package com.example.group6project.service.impl;

import com.example.group6project.models.Comments;
import com.example.group6project.models.Person;
import com.example.group6project.models.Topic;
import com.example.group6project.repository.CommentsRepository;
import com.example.group6project.repository.TopicRepository;
import com.example.group6project.service.CommentService;
import com.example.group6project.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class CommentsServiceImpl implements CommentService {
    @Autowired
    private CommentsRepository commentsRepository;
    @Autowired
    private TopicRepository topicRepository;
    @Override
    public void createNewComment(Topic topic, Person person,String commentBody) {
        LocalDate localDate= LocalDate.now();
        LocalTime localTime=LocalTime.now();
        Comments comments= new Comments();
        comments.setPerson(person);
        comments.setCommentBody(commentBody);
        comments.setLocalTime(localTime);
        comments.setLocalDate(localDate);
        comments.setTopic(topic);
        commentsRepository.save(comments);
    }



    public List<Comments> displayAllCommentsOnATopic(Long id) {
      Topic topic = topicRepository.findTopicById(id);
       return commentsRepository.findCommentsByTopic(topic);
    }
}
