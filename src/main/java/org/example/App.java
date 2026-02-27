package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");

        System.out.println("obj.age: " + obj.age);
        System.out.println("obj.getCom(): " + obj.getCom());

        obj.code();
    }
}
