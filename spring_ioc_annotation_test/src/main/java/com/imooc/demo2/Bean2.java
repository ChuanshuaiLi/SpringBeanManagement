package com.imooc.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean2")
//@Scope("prototype")
@Scope("singleton")
public class Bean2 {

}