package org.example;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        // creating the object of the class using spring framework
        // we are using the classpathxmlapplicationcontext to create the object of the class and we are passing the configuration file as an argument
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");// spring.xml is the configuration file which is used to create the object of the class
       Alien obj=(Alien) context.getBean(Alien.class);  // getBean returns the object of the class which is created by the spring framework and we are casting it to the type of the class
                                              // it just return obj we shld specify the type of the class which we want to get from the spring container
     obj.code();
    }
}
