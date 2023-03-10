package org.akincengiz.homework;
import java.util.Scanner;

public class PrimeMultiplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeMultiplier primeMultiplier = new PrimeMultiplier();
		int[] primes = primeMultiplier.primeList(1000);
		System.out.print("Asal bolenleri bulunacak sayiyi giriniz : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i = 0; i < primes.length; i++)
		{
			if(primes[i]<= number / 2)
			{
				int amount = 0;
				int temp = number;
				if(temp%2!=0)
				{
					continue;
				}
				while(temp % primes[i] == 0)
				{
					amount++;
					temp/=primes[i];
				}
				if(amount > 0)
				{
					System.out.print(primes[i] + "^"+amount+" * ");
				}
			}
		}	

	}
	

	
	int[] primeList(int number)
	{
		
		boolean prime;
		int counter = 0;
		int[] primeNumbers = new int[168];
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
				primeNumbers[counter]=i;
				counter++;
			}
			
			
		}
		return primeNumbers;
	}

}
