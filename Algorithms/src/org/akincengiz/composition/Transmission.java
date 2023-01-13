package org.akincengiz.composition;

public class Transmission {
	public Transmission() {
		System.out.println("A Transmission is created");
	}
	
	public void forward(){
		System.out.println("Transmission is is set for forward.");
	}
	
	public void backward(){
		System.out.println("Transmission is is set for backward.");
	}
}
