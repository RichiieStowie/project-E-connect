package com.example.group6project.repository;

import com.example.group6project.enums.TopicCategory;
import com.example.group6project.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopicRepository extends JpaRepository <Topic, Long>{
   List<Topic> findTopicsByTopicCategory(TopicCategory topicCategory);


}
