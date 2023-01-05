package org.akincengiz.homework;

public class Circle {
	
	double radius;
	
	double circleCircumference()
	{
		return Math.PI * this.radius * 2;
	}
	double circleArea()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}
	void getInfo()
	{
		System.out.print("\nCemberin cevresi : " + this.circleCircumference() + " birim\nCemberin alani   : " + this.circleArea()+" birim kare\n");
	}

}
