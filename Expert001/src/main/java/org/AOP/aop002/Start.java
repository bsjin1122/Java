package org.AOP.aop002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop002/aop002.xml");

        Person romeo = context.getBean("boy", Person.class);

        romeo.runSomething();
    }
}
