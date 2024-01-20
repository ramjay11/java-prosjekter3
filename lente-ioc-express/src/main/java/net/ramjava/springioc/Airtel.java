package net.ramjava.springioc;

public class Airtel implements Sim {
	
	/*
	 * public Airtel() { System.out.println("Airtel constructor called"); }
	 */

	@Override
	public void calling() {
		System.out.println("Calling using Airtel Mobile");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Airtel Mobile");
		
	}

}
