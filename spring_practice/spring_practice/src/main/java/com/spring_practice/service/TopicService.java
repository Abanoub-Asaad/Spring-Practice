package com.spring_practice.service;

import com.spring_practice.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "spring", "spring is a Java framework"),
            new Topic("2", "laravel", "laravel is a PHP framework"),
            new Topic("3", "Django", "Django is a Python framework"),
            new Topic("8", "Node JS", "Node JS ia a Javascript framework")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}