package com.laowang.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Main {
    public static void main(String []args ){
        //创建hellowworld一个对象
//        HelloWorld helloWorld = new HelloWorld();
//        //为name属性赋值
//        helloWorld.setName("wangshu");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
        //调用hello方法
        helloWorld.hello();
        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
    }
}
