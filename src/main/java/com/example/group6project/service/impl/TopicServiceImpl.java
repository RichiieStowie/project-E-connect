package com.example.group6project.service.impl;

import com.example.group6project.enums.TopicCategory;
import com.example.group6project.models.Topic;
import com.example.group6project.repository.TopicRepository;
import com.example.group6project.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Override
    public Topic findById(Long id) {
        return topicRepository.findById(id).get();
    }

    @Override
    public List<Topic> findTopicsByCategory(TopicCategory topicCategory) {
        return topicRepository.findTopicsByTopicCategory(topicCategory);
    }

}
