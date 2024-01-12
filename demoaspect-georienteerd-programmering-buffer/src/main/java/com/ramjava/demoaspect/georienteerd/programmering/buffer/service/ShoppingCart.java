package com.ramjava.demoaspect.georienteerd.programmering.buffer.service;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {
        // Logging, Authentication & Authorization, Sanitize Data are cross-cutting concerns (Aspect) that
        // need to be separated from business logic to achieve AOP
        System.out.println("Checkout method from ShoppingCart called!");
    }
}
