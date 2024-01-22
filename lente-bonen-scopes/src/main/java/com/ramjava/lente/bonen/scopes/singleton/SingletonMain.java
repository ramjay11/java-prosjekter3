package com.ramjava.lente.bonen.scopes.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SingletonDemonstratie obj1 = context.getBean("singletonDemonstratie", SingletonDemonstratie.class);
        SingletonDemonstratie obj2 = context.getBean("singletonDemonstratie", SingletonDemonstratie.class);
        // Both obj1 and obj2 are the same from the container
        System.out.println(obj1 + " " + obj2);
        if (obj1 == obj2) {
            System.out.println("Same object returned");
        }

    }

}
