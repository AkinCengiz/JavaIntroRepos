package quiz;

import java.util.Scanner;

public class Palindrom {

	public static boolean isPalindroom(String word)
	{
		String newWord = "";
		for(int i = word.length()-1; i >= 0; i--)
		{
			newWord += word.charAt(i);
		}
		if(word.equals(newWord))
		{
			return true;
		}else {
			return false;
		}		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Palindrom durumu kontrol edilecek kelime : ");
		String word = scanner.next();
		if(isPalindroom(word))
		{
			System.out.println(word + " palindrom bir kelimedir...");
		}else {
			System.out.println(word + " palindrom bir kelime degildir...");
		}

	}

}
