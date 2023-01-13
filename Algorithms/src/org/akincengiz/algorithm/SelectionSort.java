package org.akincengiz.algorithm;
import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args)
	{
		int n,g;
		Scanner inputKeyboard = new Scanner(System.in);
		System.out.print("Dizinin eleman sayisini giriniz : ");
		n = inputKeyboard.nextInt();
		System.out.println();
		int[] myArray = new int[n];
		for(int i =0; i < n; i++)
		{
			System.out.print("MyArray["+i+"] : ");
			myArray[i] = inputKeyboard.nextInt();
		}
		for(int i = 0; i < n-1; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(myArray[j] < myArray[i])
				{
					g = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = g;
				}
			}			
			
		}
		System.out.println("\nSirali Dizi : \n================================");
		for(int i = 0; i < n; i++)
		{
			System.out.println("MyArray["+(i+1)+"] : "+myArray[i]);
		}
	}
	
}
