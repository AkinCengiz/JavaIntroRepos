package org.akincengiz.composition;

public class Car {
	private String make;
	private String model;
	private String year;
	private int speed;
	private int distance;
	
	private Wheel[] wheels = new Wheel[4];
	private Engine engine;
	private int doorCount;
	private Door[] doors;
	private Transmission transmission;
	
	public Car(String make, String model, String year, int doorCount)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.doorCount = doorCount;
		this.distance = 0;
		this.speed = 0;
		
		this.engine = new Engine(5000,350);
		this.transmission = new Transmission();
		
		this.wheels[0] = new Wheel("Front-Left");
		this.wheels[1] = new Wheel("Front-Right");
		this.wheels[2] = new Wheel("Rear-Left");
		this.wheels[3] = new Wheel("Rear-Right");
		
		this.doors = new Door[this.doorCount];
		this.doors[0] = new Door("Front-Left",true);
		this.doors[1] = new Door("Front-Right",true);
		if(this.doorCount == 4)
		{
			this.doors[2] = new Door("Rear-Left",true);
			this.doors[3] = new Door("rear-Right",true);
		}
		
		System.out.println("A car of " + make + " " + model + ", " + year + " is created.\n");
	}
	public void start()
	{
		engine.start();
	}
	public void go(int distance)
	{
		for(Door door : doors)
		{
			if(!door.isClosed())
			{
				door.close();
			}
		}
		System.out.println("Car is moving.");
		this.distance += distance;
		System.out.println("Distance: " + this.distance);
	}
	public void accelerate(int speed)
	{
		this.speed += speed;
		System.out.println("Accelerating. New speed: " + this.speed);
	}
	public void stop()
	{
		this.speed = 0;
		System.out.println("\nCar stopped. New speed: " + speed);
	}
	public String getInfo()
	{
		return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at "
				+ speed + " kmph.";
	}
	public void turnOff()
	{
		engine.stop();
	}
}
