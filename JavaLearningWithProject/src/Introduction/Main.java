package Introduction;

import java.util.HashMap;

public class Main {

	public static String findRepetitiveCharacter(String word)
	{
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for(int i = 0; i < word.length(); i++)
		{
			String karakter = word.substring(i,i+1);
			if(!hashMap.containsKey(karakter))
			{
				hashMap.put(karakter, 1);
			}
			else
			{
				return karakter;
			}
		}
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "AÇBCDEÇCAB";
		System.out.println(findRepetitiveCharacter(sentence));

	}

}
