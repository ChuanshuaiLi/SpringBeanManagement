package com.imooc.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Spring的Bean管理的注解方式：
 * 传统方式需要去XML配置<bean id="" class=""></bean>
 */
@Component("userService")
public class UserService {

    @Value("馒头")
    private String something;

    //@Autowired //会按照名称注入

    /*@Autowired
    @Qualifier("userDao")*/

    //也可以简写为
    @Resource(name = "userDao")
    private UserDao userDao;

    public String sayHello(String name){
        return "hello"+name;
    }
    public void eat(){
        System.out.println("eat:"+something);
    }
    public void save(){
        System.out.println("Service中保存用户...");
        userDao.save();
    }
}
