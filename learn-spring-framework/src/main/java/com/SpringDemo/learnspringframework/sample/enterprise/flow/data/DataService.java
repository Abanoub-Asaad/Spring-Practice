package com.SpringDemo.learnspringframework.sample.enterprise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//Get data from the database
@Component
public class DataService {
    public List<Integer> retrieveData() {
        return Arrays.asList(112, 340, 12, 41);
    }
}