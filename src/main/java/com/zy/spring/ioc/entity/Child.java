package com.zy.spring.ioc.entity;

public class Child {
    private String name;
    private Apple apple;

    public Child() {
        System.out.println("正在创建Child对象："+this);
    }

    public Child(String name, Apple apple) {
        System.out.println("构造方法参数apple"+apple);
        this.name = name;
        this.apple = apple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        System.out.println("注入的Apple对象"+apple);
        this.apple = apple;
    }

    public void eat() {
        System.out.println(getName()+"吃到了"+apple.getTitle());
    }
}
