package com.mooing.hessian;

/**
 * Created by Administrator on 2017/5/25.
 */
public class DemoService implements DemoApi{

    private String name;

    public void setName(String name) {
        this.name=name;
    }

    public String sayHello() {
        System.out.println("hello,world!");
        return "hello:"+name;
    }

    public User getUser() {
        return new User("ming","m123");
    }

}