package org.akincengiz.homework;
import java.util.Scanner;

public class IntegerDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Bolenleri bulunacak sayiyi giriniz : ");
		int number = input.nextInt();
		IntegerDivisor divide = new IntegerDivisor();
		System.out.print(number + " sayisinin " + divide.divisorCount(number)+" adet tam boleni vardir.\n\n********************\n\n");
		divide.getDivisor(number);

	}
	int divisorCount(int number)
	{
		int result=0;
		for(int i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
			{
				result++;
			}
		}
		return result;
	}
	
	void getDivisor(int number)
	{
		int[] divisors = new int[divisorCount(number)];
		
		int item = 0;
		for(int i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
			{
				divisors[item]=i;
				item++;
				continue;
			}
		}
		for(int i : divisors)
		{
			System.out.print(i + "   ");
		}		
	}

}
