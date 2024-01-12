package com.ramjava.demoaspect.georienteerd.programmering.buffer;

import com.ramjava.demoaspect.georienteerd.programmering.buffer.config.BeanConfig;
import com.ramjava.demoaspect.georienteerd.programmering.buffer.service.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DemoaspectGeorienteerdProgrammeringBufferApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoaspectGeorienteerdProgrammeringBufferApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		ShoppingCart cart = context.getBean(ShoppingCart.class);
		cart.checkout("CANCELLED"); // If cancelled, aspect won't be called
	}

}
