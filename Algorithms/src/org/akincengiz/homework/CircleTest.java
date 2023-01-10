package org.akincengiz.homework;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Circle circle2 = new Circle(20);
		
				
		circle.getInfo();
		circle2.getInfo();
		circle.radius = 20;
		circle.getInfo();

	}

}
