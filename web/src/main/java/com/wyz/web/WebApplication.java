package com.wyz.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author T440P
 */
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        System.out.println("master commit");
        System.out.println("dev branthes modify");
        System.out.println("test branthes modify");
        System.out.println("添加分支");
        System.out.println("又加了一行");
    }

}
