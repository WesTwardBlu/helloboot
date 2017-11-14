package com.east.helloboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaowg on 2017/11/13
 */
@RestController
public class HelloController {

    @Value(value = "${girl.name}")
    private String name;

    @Value(value = "${girl.age}")
    private int age;


    @GetMapping(value = {"/hello","/say"})
    public String hello(){
        return "hello,spring boot:" + "name:"+ name + ",age:" + age;
    }
}
