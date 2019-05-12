package com.imooc.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.sql.SQLOutput;

public class Man implements BeanNameAware, ApplicationContextAware ,InitializingBean{
    private String name;

    public Man() {
        System.out.println("第一步：执行spring的初始化");
    }

    public void setName(String name) {
        System.out.println("第二步：设置属性");
        this.name = name;
    }

    //重写BeanNameAware的方法
    public void setBeanName(String s) {
        System.out.println("第三步：设置Bean名称");
    }

    //重写ApplicationContextAware的方法
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：了解工厂的信息");
    }
    //重写InitializingBean的方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后");
    }

    public void setup(){
       // System.out.println("man初始化...");
        System.out.println("第七步：初始化自身");
    }

    public void run(){
        System.out.println("第九步；执行业务方法自身方法run");
    }

    public void destory() throws Exception{
        System.out.println("第十步：执行spring的销毁方法");
    }

    public void teardown(){
       // System.out.println("man被销毁...");
        System.out.println("第十一步：执行自己配置的销毁方法");
    }
}
