package com.spring_practice.service;

import com.spring_practice.model.Topic;
import com.spring_practice.repository.ITopicRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TopicService {
    private final ITopicRepository topicRepository;
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add); //lambda function
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }
    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
    public List<Topic> getTopicByName(String name) {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findTopicByName(name)
                .forEach(topics::add); //lambda function
        return topics;
    }
}