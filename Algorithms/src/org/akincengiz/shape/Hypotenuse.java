package org.akincengiz.shape;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a,b,hypotenuse;
		System.out.print("a kenar uzunlugu  : ");
		a = input.nextDouble();
		System.out.print("b kenar uzunlugu  : ");
		b = input.nextDouble();
		hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.print("Kenar uzunluklari : \n====================\na kenar uzunlugu   : "+a+" birim\nb kenar uzunlugu   : "+b+" birim\nUcgenin Hipotenusu : "+hypotenuse+" birimdir...");
		
	}

}
