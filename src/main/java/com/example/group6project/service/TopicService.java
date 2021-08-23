package com.example.group6project.service;

import com.example.group6project.enums.TopicCategory;
import com.example.group6project.models.Topic;

import java.util.List;

public interface TopicService {
    Topic findById(Long id);
    List<Topic> findTopicsByCategory(TopicCategory topicCategory);

}
