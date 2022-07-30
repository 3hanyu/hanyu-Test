package com.example.druid_springboot_jpa.controller;

import com.example.druid_springboot_jpa.dao.UserRepos;
import com.example.druid_springboot_jpa.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepos userRepos;

    @RequestMapping(value="saveUser")
    public User saveUser(){
        return userRepos.save(new User());
    }

    @RequestMapping(value="/findByUserName")
    public List<User> findByUserName(String userName){
        System.out.println("username" + userName);
        return userRepos.findByUserName(userName);
    }

    @RequestMapping(value="findByUserNameLike")
    public List<User> findByUserNameLkie(String userName){
        return userRepos.findByUserNameLike(userName);
    }

//    @RequestMapping(value="findByPage")
//    public Page<User> findByPage(Integer userType){
//        PageRequest request;
//        request = new PageRequest();
//        Page<User> byUserType;
//        byUserType = userRepos.findByUserType(userType,
//                new PageRequest(1, 5));
//        return byUserType;
//    }



}
