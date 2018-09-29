package com.lufy.springcloud.user1.controllers;

import com.lufy.springcloud.UserPo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private int serverPort = 0;
    @RequestMapping("/user/{id}")
    public UserPo getUser(@PathVariable("id") long id) {
        UserPo userPo = new UserPo();
        userPo.setName("name is : "+id);
        System.out.println("server: " + serverPort + " get param : " +id);
        return userPo;
    }
}
