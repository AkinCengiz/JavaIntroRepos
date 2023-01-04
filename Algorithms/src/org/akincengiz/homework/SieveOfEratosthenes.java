package org.akincengiz.homework;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SieveOfEratosthenes sieveOfErat = new SieveOfEratosthenes();
		System.out.print("Pozitif tam sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		sieveOfErat.countNumberOfPrimesUpTo(number);
	}
	
	void countNumberOfPrimesUpTo(int n)
	{
		boolean[] list = new boolean[n];
		Arrays.fill(list, true);
		list[0]=false;
		list[1]=false;
		
		for(int i = 2; i < Math.sqrt(n)+1;i++)
		{
			if(list[i]==true)
			{
				for(int j = 2; i*j<n;j++)
				{
					list[i*j]=false;
				}
			}
		}
		int numberOfPrimes = 0;
		for(boolean b : list)
		{
			if(b)
			{
				numberOfPrimes++;
			}
		}
		System.out.print(n + " sayisina kadar " + numberOfPrimes + " tane asal sayi vardir...");
	}
}
