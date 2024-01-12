package com.ramjava.demoaspect.georienteerd.programmering.buffer.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    // Number of parameters should match by adding "." checkout(..)
    @Before("execution(* com.ramjava.demoaspect.georienteerd.programmering.buffer.service.ShoppingCart.checkout(..))")
    public void beforeLogger() {
        // What we have to run is called pointcuts and where you want to call
        System.out.println("Before Loggers");
    }

    //@After("execution(* *.*.checkout())")
    @After("execution(* com.ramjava.demoaspect.georienteerd.programmering.buffer.service.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After Loggers");
    }


}
