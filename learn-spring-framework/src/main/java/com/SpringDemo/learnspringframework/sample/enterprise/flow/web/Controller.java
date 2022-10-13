package com.SpringDemo.learnspringframework.sample.enterprise.flow.web;

import com.SpringDemo.learnspringframework.sample.enterprise.flow.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Send the response to the user in the right format
@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    //"/sum" => 100
    @GetMapping("/sum")
    public long displaySum () {
        return businessService.calaculateSum();
    }
}