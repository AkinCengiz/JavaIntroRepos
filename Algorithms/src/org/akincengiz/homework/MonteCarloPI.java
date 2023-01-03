package org.akincengiz.homework;
import java.util.Scanner;

public class MonteCarloPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nokta sayisini giriniz : ");
		Scanner input = new Scanner(System.in);
		int point = input.nextInt();
		
		int numberInCircle = 0;
		long start = System.currentTimeMillis();

		for(int i = 0; i < point; i++)
		{
			double x = Math.random();
			double y = Math.random();
			double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); 
			if(distance <=1)
			{
				numberInCircle++;
			}
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		double myPI = 4.0 * numberInCircle / point;
		System.out.println("My PI : "+myPI+"\n"+Math.PI+"\nHesaplama süresi : "+time+" milisaniye");
		
	}

}
