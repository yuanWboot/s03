package com.zy.spring.ioc;

import com.zy.spring.ioc.entity.Apple;
import com.zy.spring.ioc.entity.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Apple sweetApple = context.getBean("sweetApple",Apple.class);
       // System.out.println(sweetApple.getTitle());
        Child zhangsan = context.getBean("zhangsan", Child.class);
        Child lisi = context.getBean("lisi", Child.class);
        zhangsan.eat();
        lisi.eat();
    }
}
