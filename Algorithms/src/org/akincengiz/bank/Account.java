package org.akincengiz.bank;

class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance >= 0.0)
		{
			this.balance = balance;
		}else
		{
			System.out.print("Negatif deger girilemez...");
		}
	}
	
	public Account()
	{
		this(0.0);
	}
	public Account(double balance)
	{
		this.balance = balance;
	}
	public void withdrawMoney(double money)
	{
		if(money <= balance)
		{
			balance -= money;
		}
		else
		{
			System.out.print("Yetersiz bakiye...");
		}
	}
	
	public void addMoney(double money)
	{
		balance += money;
	}
	
	
	
}
