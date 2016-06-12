package com.laowang.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        Person person = (Person)ctx.getBean("person2");
        System.out.println(person);
    }
}
