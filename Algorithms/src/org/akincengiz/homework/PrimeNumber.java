package org.akincengiz.homework;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber primeNumber = new PrimeNumber();
		System.out.print("Tamsayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(primeNumber.isPrime(number))
		{
			System.out.print(number + " asal sayidir...\n");
		}else {
			System.out.print(number + " asal sayi degildir...\n");
		}
		System.out.print("Kaca kadar olan asal sayilar listelensin : ");
		int number2 = input.nextInt();
		primeNumber.primeList(number2);
		
	}
	
	boolean isPrime(int number)
	{
		boolean prime = true;
		for(int i = 2; i <= (int)(Math.sqrt(number)+1); i++)
		{
			if(number % i == 0)
			{
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	void primeList(int number)
	{
		boolean prime;
		int counter = 0;
		for(int i = 2; i <= number; i++)
		{
			prime = true;
			for(int j = 2; j < (int)(Math.sqrt(i)+1); j++)
			{
				if(i % j == 0)
				{
					prime = false;
					break;
				}
			}
			
			if(prime == true)
			{
				counter++;
				System.out.println(counter + ". sirada "+ i + " asal sayidir...");
			}
		}
		System.out.println(number + " sayisina esit ya da kucuk "+counter+" asal sayi vardir...");
	}

}
