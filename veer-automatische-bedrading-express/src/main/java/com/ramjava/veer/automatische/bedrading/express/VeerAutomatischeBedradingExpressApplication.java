package com.ramjava.veer.automatische.bedrading.express;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class VeerAutomatischeBedradingExpressApplication {
    public static void main(String[] args) {
        //SpringApplication.run(VeerAutomatischeBedradingExpressApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Human human = context.getBean("human", Human.class);
        human.startPumping();
    }
}
