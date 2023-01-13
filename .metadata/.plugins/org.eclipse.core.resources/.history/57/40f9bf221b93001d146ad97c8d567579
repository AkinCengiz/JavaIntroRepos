package org.akincengiz.bank;



public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(125000.0);
		System.out.print("\nAccount1 hesabinda kalan bakiye : "+account1.getBalance()+" TL");
		Account account2 = new Account();
		System.out.print("\nAccount2 hesabinda kalan bakiye : "+account2.getBalance()+" TL");
		AccountClient.moneyOrder(account1, account2, 127500);
		System.out.print("\nAccount1 hesabinda kalan bakiye : "+account1.getBalance()+" TL");
		AccountClient.moneyOrder(account1, account2, 127500);
		System.out.print("\nAccount1 hesabinda kalan bakiye : "+account1.getBalance()+" TL");
		account1.withdrawMoney(32000);
		System.out.print("\nAccount1 hesabinda kalan bakiye : "+account1.getBalance()+" TL");
	}
}
