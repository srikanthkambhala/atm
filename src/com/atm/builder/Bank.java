package com.atm.builder;

public class Bank {
	public String name;
	public String loc;
	public String ifsc;
	public Account a;
	/**
	 * @param name
	 * @param loc
	 * @param ifsc
	 */
	public Bank(String name, String loc, String ifsc) {
		super();
		this.name = name;
		this.loc = loc;
		this.ifsc = ifsc;
	}
	public void bankDetails()
	{
		System.out.println("BankName:"+name);
		System.out.println("Location:"+loc);
		System.out.println("IFSC code:"+ifsc);
		a.details();
		if (a!=null) {
			System.out.println("name:"+a.accountHolder);
			System.out.println("Dob:"+a.dob);
			System.out.println("pin:"+a.pin);
			System.out.println("money:"+a.money);
			
		}
		else
		{
			System.out.println("open your account first");
		}
	}
	
	public void createAccount(Account a,int pin) {
		if (a.pin==pin) {
			
		
		if (this.a==null) {
			this.a=a;
			System.out.println("Account successfully created");
			
		}
		else
		{
			System.out.println("Aleready account is existing");
		}
		}
		else
		{
			System.err.println("invalid pin");
			System.out.println("Try again");
		}
		
		
	}
	public void deposit(double money,int pin) {
		
		if (a.pin==pin) {
			if (money!=0) {
				a.money=a.money+money;
				System.out.println("deposit money is:"+money);
				System.out.println("total ammount is:"+a.money);
				
			} else {
				System.out.println("plese enter valid ammount to add in account");

			}
			
		} else {
			System.err.println("invalid pin");
			System.out.println("Enter valid pin");

		}
		
	}
	public void withdrwal(int pin,double money) {
		if (a.pin==pin ) {
			if (a.money>money) {
				a.money=a.money-money;
				System.out.println("Withdrawal ammount Is:"+money);
				System.out.println("Total ammount:"+a.money);
				
			} else {
				System.err.println("Insufficent Balance");

			}
			
		}
		else
		{
			System.err.println("invalid pin ");
			System.out.println("enter valid pin");
			
		}
		
	}
	public void deleteAccount() {
		this.a=null;
		System.out.println("delete account");
		
	}
     
}
