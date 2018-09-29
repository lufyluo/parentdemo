package com.lufy.springcloud.product.controllers;

import com.lufy.springcloud.UserPo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("test")
    public UserPo testRibbon() {
        UserPo userPo = null;
        for (int i = 0; i < 10; i++) {
            userPo = restTemplate.getForObject("http://USER/user/" + i, UserPo.class);
            System.out.println("userPo: " + userPo.getName());
        }
        return userPo;
    }
}
