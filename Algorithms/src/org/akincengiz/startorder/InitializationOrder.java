package org.akincengiz.startorder;

public class InitializationOrder {
	
	static int i = 22;
	String name;
	static A a = new A();
	
	public InitializationOrder()
	{
		this("InitializationOrder1");
		System.out.println("In InitializationOrder()");
	}
	
	public InitializationOrder(String name)
	{
		this("InitializationOrder2",5);
		System.out.println("In InitializationOrder(String name)");
	}
	
	public InitializationOrder(String name, int i)
	{
		this.name = name;
		System.out.println("In InitializationOrder(String name, int i)");
	}
	
	C c = new C();
	
	static int[] ints = new int[10];
	
	static {
		System.out.println("Initializing the int array");
		for(int i = 0; i < ints.length;i++)
		{
			ints[i] = i * 10;
		}
	}
	
	boolean[] booleans = new boolean[10];
	{
		System.out.println("Initializing the boolean array");
		boolean b = false;
		for(int i = 0; i < booleans.length; i++)
		{
			booleans[i] = !b;
			b = !b;
		}
	}
	
	public static final D d = new D();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****************************");
		System.out.println("in main");
		System.out.println("*****************************");
		System.out.println(InitializationOrder.i);
		System.out.println("*****************************");
		InitializationOrder oi = new InitializationOrder();
		System.out.println("*****************************");
		new InitializationOrder();
		System.out.println("*****************************");
		new InitializationOrder();
		System.out.println("*****************************");
		new InitializationOrder();
		System.out.println("*****************************");
		B b = new B();
		b.f();	

	}

}
