package com.example.group6project.repository;

import com.example.group6project.models.Comments;
import com.example.group6project.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {

}