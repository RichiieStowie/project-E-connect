package com.example.group6project.repository;

import com.example.group6project.enums.TopicCategory;
import com.example.group6project.enums.TopicStatus;
import com.example.group6project.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic,Long> {
    List<Topic> findTopicsByTopicStatus(TopicStatus topicStatus);
    Topic findTopicById(Long id);
    List<Topic>findTopicsByTopicStatusAndTopicCategory(TopicStatus topicStatus, TopicCategory topicCategory);

    @Override
    Optional<Topic> findById(Long id);
}
