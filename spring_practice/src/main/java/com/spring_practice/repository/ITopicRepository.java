package com.spring_practice.repository;

import com.spring_practice.model.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Here I can make the crud operations
 */

public interface ITopicRepository extends CrudRepository<Topic, String> {
    public List<Topic> findTopicByName(String topicName);
}