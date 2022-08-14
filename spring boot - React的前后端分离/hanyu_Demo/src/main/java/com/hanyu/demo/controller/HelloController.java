package com.hanyu.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

    @GetMapping(value = "/hello")
    public String say(){
        return "SpringBoot - React 前后端分离测试";
    }
}
