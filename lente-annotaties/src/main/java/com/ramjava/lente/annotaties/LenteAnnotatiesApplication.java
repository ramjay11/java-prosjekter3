package com.ramjava.lente.annotaties;

import com.ramjava.lente.annotaties.component.PizzaOnderdeel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@ComponentScan(basePackages = "com.ramjava,lente,annotaties")
public class LenteAnnotatiesApplication {

	public static void main(String[] args) {
		// ApplicationContext is an IOC container
		var context = SpringApplication.run(LenteAnnotatiesApplication.class, args);
		//PizzaOnderdeel pizzaOnderdeel = context.getBean(PizzaOnderdeel.class);
		//PizzaOnderdeel pizzaOnderdeel = (PizzaOnderdeel) context.getBean("onderdeel");
		PizzaOnderdeel pizzaOnderdeel = (PizzaOnderdeel) context.getBean("pizzaOnderdeel");
		System.out.println(pizzaOnderdeel.getPizza());

	}

}
