package com.imooc.ioc.demo3;

public class UserDaoImpl implements UserDao {
    public void findAll() {
        System.out.println("查询用户");
    }

    public void save() {
        System.out.println("保存用户");
    }

    public void update() {
        System.out.println("更新用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }
}
