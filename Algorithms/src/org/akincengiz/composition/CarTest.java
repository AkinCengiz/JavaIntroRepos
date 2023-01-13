package org.akincengiz.composition;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Ford","Mustang","2022",2);
		car.start();
		System.out.print("\n"+car.getInfo());
		car.go(150);
		System.out.print("\n"+car.getInfo());
		car.accelerate(100);
		System.out.print("\n"+car.getInfo());
		car.accelerate(20);
		System.out.print("\n"+car.getInfo());
		car.accelerate(-70);
		System.out.print("\n"+car.getInfo());
		car.stop();
		car.turnOff();
		System.out.print("\n"+car.getInfo());
	}

}
