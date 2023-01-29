package Introduction;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            
            if(list.containsKey(target - nums[i]))
            {
                int[] result = {i,list.get(target - nums[i])};
                return result;
            }
            else
            {
                list.put(nums[i],i);
            }
        }
        return null;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum twoSum1 = new TwoSum();
		int[] array1 = {1,3,5,7,9};
		for(var i : twoSum1.twoSum(array1, 14))
		{
			System.out.print(i + ", ");
		}
		
	}

}
