package org.akincengiz.homework;

public class NewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3,3,87,56,8,87,2,1,87,3,2,7,13};
		int counter = 1;
		boolean isThere;
		for(int i = 1; i < numbers.length; i++)
		{
			isThere = false;
			for (int j = 0; j < i ; j++)
			{
				if(numbers[i]==numbers[j])
				{
					isThere = true;
					break;
				}
				
				
			}
			if(!isThere)
			{
				counter++;
			}
		}
		System.out.print(counter+"\n\n**************************************\n\nKopyalanan dizinin elemanlari : ");
		int[] copyNumbers = new int[counter];
		int k = 1;
		for(int i = 0; i < numbers.length; i++)
		{
			isThere = false;
			if(i==0)
			{
				copyNumbers[0] = numbers[0];
				continue;
			}
			
			for(int j = 0; j < i; j++)
			{
				if(numbers[j]== numbers[i])
				{
					isThere=true;
					break;
				}
			}
			if(!isThere)
			{
				copyNumbers[k]=numbers[i];
				k++;
			}
			
		}
		for(int number : copyNumbers)
		{
			System.out.print(number + "   ");
		}

	}

}
