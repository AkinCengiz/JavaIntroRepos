package Introduction;

import java.util.HashMap;
import java.util.List;

public class Pairs {
	
	public static int sockMerchant(int n, String[] arr)
	{
		int pairs = 0;
		
		if(n == 0)
		{
			return pairs;
		}
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < n; i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], "1");
			}
			else
			{
				map.remove(arr[i]);
				pairs++;
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array1 = {"1","3","5","7","9","1","2","3","4","5","6","7"};
		int itemAmount = array1.length;
		int amount = sockMerchant(itemAmount, array1);
		System.out.println(amount);
		

	}

}
