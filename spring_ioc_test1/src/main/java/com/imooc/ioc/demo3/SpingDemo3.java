package com.imooc.ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpingDemo3 {
    @Test
    //测试作用域
    public void demo1(){
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person1 = (Person)applicationContext.getBean("person");
        Person person2 = (Person)applicationContext.getBean("person");
        //二者地址一样，默认是单例模式
        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    public void demo2(){
        ClassPathXmlApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = (Man)applicationContext.getBean("man");
        man.run();
        applicationContext.close();
    }

    @Test
    public void demo3(){
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.findAll();
        userDao.save();
        userDao.update();
        userDao.delete();
    }
}
