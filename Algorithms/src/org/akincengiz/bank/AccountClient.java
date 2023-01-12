package org.akincengiz.bank;

public class AccountClient {
	
	public static void moneyOrder(Account account1, Account account2, double money)
	{
		if(account1.getBalance() >= money)
		{
			account1.withdrawMoney(money);
			account2.addMoney(money);
		}else
		{
			System.out.print("\nYetersiz bakiye...");
		}
	}

}
