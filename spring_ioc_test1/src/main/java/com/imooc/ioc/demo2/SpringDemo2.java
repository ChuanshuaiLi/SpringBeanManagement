package com.imooc.ioc.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * Bean实例化的三种方式
 */
public class SpringDemo2 {

    @Test
    //第一种：无参构造
    public void demo1(){
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类实例
        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
    }
    @Test
    //第二种：静态工厂
    public void demo2(){
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类实例
        Bean2 bean2 = (Bean2)applicationContext.getBean("bean2");
    }

    @Test
    //第二种：实例工厂
    public void demo3(){
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类实例
        Bean3 bean3 = (Bean3)applicationContext.getBean("bean3");
    }
}
