package net.ramjava.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SeleniumexpressSpringiocApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SeleniumexpressSpringiocApplication.class, args);
		
		//Airtel airtel = new Airtel();
		//airtel.calling();
		//airtel.data();
		
		/*Sim sim = new Airtel();
		sim.calling();
		sim.data();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		//Airtel air = (Airtel) context.getBean("airtel");
		//air.calling();
		//air.data();
		Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
		voda.calling();
		voda.data();

	}

}
