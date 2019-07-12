package com.wyz.web.controller;

import com.wyz.web.pojo.ConfigBean;
import com.wyz.web.pojo.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author T440P
 * @Title: HelloController
 * @ProjectName SpringbootDemo
 * @Description: 控制器
 * @date 2019/7/11
 */
@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    private Hello hello;
    @Autowired
    private ConfigBean config;

    @RequestMapping("/hello")
    public String sayHello(){
        return hello.getMessage();
    }

    @RequestMapping("/app")
    public String getAppInfo(){
        return "name:"+config.getName()+"message:"+config.getMessage();
    }
}
