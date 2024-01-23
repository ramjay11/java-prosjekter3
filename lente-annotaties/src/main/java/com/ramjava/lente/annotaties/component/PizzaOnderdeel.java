package com.ramjava.lente.annotaties.component;

import com.ramjava.lente.annotaties.autowired.GroentePizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//@Component("onderdeel") // With bean name
@Component
public class PizzaOnderdeel {

    // Field Injection
    //@Autowired
    private GroentePizza groentePizza;

//    @Autowired -- Constructor injection
//    public PizzaOnderdeel(GroentePizza groentePizza) {
//        this.groentePizza = groentePizza;
//    }

    public GroentePizza getGroentePizza() {
        return groentePizza;
    }
    @Autowired // Setter injection
    public void setGroentePizza(GroentePizza groentePizza) {
        this.groentePizza = groentePizza;
    }

    public String getPizza() {
        //return "PizzaOnderdeel";
        return groentePizza.getPizza();
    }
}
