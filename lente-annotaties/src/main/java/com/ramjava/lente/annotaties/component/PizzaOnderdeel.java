package com.ramjava.lente.annotaties.component;

import org.springframework.stereotype.Component;

//@Component
@Component("onderdeel") // With bean name
public class PizzaOnderdeel {
    public String getPizza() {
        return "PizzaOnderdeel";
    }
}
