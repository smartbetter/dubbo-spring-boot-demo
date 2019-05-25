package com.example.server.soa.controller;

import com.example.server.soa.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}