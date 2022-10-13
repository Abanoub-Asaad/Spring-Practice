package com.SpringDemo.learnspringframework.sample.enterprise.flow.service;

import com.SpringDemo.learnspringframework.sample.enterprise.flow.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//Buisness Logic
@Component
public class BusinessService {
    @Autowired
    private DataService dataService;
    public long calaculateSum() {
        List<Integer> data = dataService.retrieveData();
        //get the sum of the data
        //I can do it the old way by iterating over the array
        //but here I'm using functional programming
        return data.stream().reduce(Integer::sum).get();
    }
}