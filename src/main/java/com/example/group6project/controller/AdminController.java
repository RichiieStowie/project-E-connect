package com.example.group6project.controller;

import com.example.group6project.dto.CategoryDto;
import com.example.group6project.enums.TopicCategory;
import com.example.group6project.enums.TopicStatus;
import com.example.group6project.models.Comments;
import com.example.group6project.models.Person;
import com.example.group6project.models.Topic;
import com.example.group6project.repository.TopicRepository;
import com.example.group6project.service.CommentService;
import com.example.group6project.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController  {
    @Autowired
     private TopicService topicService;
    @Autowired
    private CommentService commentService;

    @GetMapping(value = "/")  //replace with admin view controller servlet
    public String displayAllAvailableTopics(Model model){
        List<Topic> topicList= topicService.displayAllTopicsAvailable(TopicStatus.NOT_DELETED);
        model.addAttribute("topicList",topicList);
        return "index";
    }

    @GetMapping(value = "/addNewTopic")
        public String getNewTopicPage(Model model){
        model.addAttribute("category",new CategoryDto());
        List<TopicCategory>categories= List.of(TopicCategory.values());
        System.out.println(categories);
        model.addAttribute("categories",categories);
        return "addTopic";
    }

    @GetMapping(value = "/deleteTopic/{id}")
    public String deleteATopic(Model model,@PathVariable(name = "id")Long id){
        topicService.deleteTopic(id);
        return "redirect:/"; //replace with admin service controller
    }



    @PostMapping(value = "addNewTopic")
    public String addNewTopic(Model model, @ModelAttribute("category")CategoryDto categoryDto){
        System.out.println(categoryDto.getTopicCategory());
        topicService.createNewTopic(categoryDto);
        return "redirect:/"; // replace with admin view page
    }

    @GetMapping(value = "/displayCommentsForAdmin/{id}")
    public  String loadCommentsPageForAdmin(Model model,@PathVariable(name = "id")Long id){
      List<Comments>commentsList=commentService.displayAllCommentsOnATopic(id);
      model.addAttribute("comments",commentsList);
      return "adminCommentsView";
    }



}
