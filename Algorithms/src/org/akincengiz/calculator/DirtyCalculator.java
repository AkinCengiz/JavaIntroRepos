package org.akincengiz.calculator;

public class DirtyCalculator {
	
	/*
	 * void whoAreYou() { System.out.println("Pi is " + Math.PI); }
	 */
	//
	void getPI() {
		System.out.println("Pi is : "+Math.PI);
	}

//	int f(int a, int b) {
//		return a + b;
//	}
	
	int add(int a, int b)
	{
		return a + b;
	}

	int subtraction(int first, int second) {
		return first - second;
	}

//	int mltply(int first, int second) {
//		return first * second;
//	}
	
	int multiplay(int first, int second)
	{
		return first * second;
	}

	int multiplyByAdding(int first, int second) {
		int multiplication = 0;
		for (int i = 1; i <= second; i++)
			multiplication += first;
		System.out.println("Multiplication: " + multiplication);
		return multiplication;
	}

//	double dvd(int first, int second) {
//		return (double) first / second;
//	}
	double divide(int first, int second)
	{
		if(second == 0)
		{
			return 0.0;
		}
		return (double) first / second;
	}
	
	//Gereksiz tanımlanmış bir metot. Bu sınıfa ait işlem yapmıyor.
	double getDollarEuroParity(){
		return 1.1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirtyCalculator dirtyCalc = new DirtyCalculator();
		dirtyCalc.getPI();
		
		int x = 20;
		int y = 5;
		
		System.out.print(x + " + " + y + " = " + dirtyCalc.add(x, y)+"\n");
		System.out.print(x + " - " + y + " = " + dirtyCalc.subtraction(x, y)+"\n");
		System.out.print(x + " x " + y + " = " + dirtyCalc.multiplay(x, y)+"\n");
		System.out.print(x + " / " + y + " = " + dirtyCalc.divide(x, y)+"\n");
		System.out.print(x + " * " + y + " = " + dirtyCalc.multiplyByAdding(x, y)+"\n");

	}

}
