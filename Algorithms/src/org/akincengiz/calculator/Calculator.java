package org.akincengiz.calculator;

public class Calculator {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	void whoAreYou(){
		System.out.println("I'm a Calculator, my name is " + name);
	}

	public int add(int first, int second) {
		return first + second;
	}

	public int subtract(int first, int second) {
		return first - second;
	}

	public int multiply(int first, int second) {
		int sonuc =  first * second;
		return sonuc;
	}
	
	public int multiplyByAdding(int first, int second) {
		int multiplication = 0;
		for(int i = 1; i <= second; i++)
			multiplication += first;
		System.out.println("Multiplication: " + multiplication);
		return multiplication;
	}

	public double divide(int first, int second) {
		return (double)first / second;
	}
	
	public int power(int base, int pow)
	{
		int result = 1;
		for(int i = 0; i<=pow;i++)
		{
			if(i == 0)
			{
				result = 1;
				continue;
			}
			result *= base;
		}
		System.out.print(base + " ^ " + pow + " : ");
		return result;
	}
	
	public int factorial(int number)
	{
		System.out.print(number + " x ");
		if(number == 1)
		{
			System.out.print("\b\b\b : ");
			return 1;
		}
		return number * factorial(number - 1);
	}
	public int mod (int number, int divisor)
	{
		while(number >= divisor)
		{
			number -= divisor;
		}
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		calculator.setName("Texas Instruments T-308");
		
		calculator.whoAreYou();
		
		int i = calculator.add(12, 27);
		System.out.println("12 + 27 = " + i);
		
		double d = calculator.divide(82, 9);
		System.out.println("82 / 9 = " + d);
		
		System.out.println("83 - 56 = " + calculator.subtract(83, 56));
		System.out.println("8 * 7 = " + calculator.multiply(8, 7));
		
		// Calling it for its side effect
		calculator.multiplyByAdding(22, 5);
		
		System.out.println(calculator.power(2, 5));
 		
		System.out.println(calculator.mod(18, 5));
		
		System.out.println(calculator.factorial(5));
		
	}

}
