package com.imooc.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean1")
public class Bean1 {
    public void say() {
        System.out.println("say...");
    }

    @PostConstruct
    public void init() {
        System.out.println("init Bean...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destory Bean...");
    }

}