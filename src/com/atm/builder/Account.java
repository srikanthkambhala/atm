package com.atm.builder;

public class Account {
	public String accountHolder;
	public String dob;
	public int pin;
	public long accNo;
	public double money;
	/**
	 * @param accountHolder
	 * @param dob
	 * @param pin
	 * @param accNo
	 */
	public Account(String accountHolder, String dob, int pin, long accNo,double money) {
		super();
		this.accountHolder = accountHolder;
		this.dob = dob;
		this.pin = pin;
		this.accNo = accNo;
		this.money=money;
	}
	public void details() {
		System.out.println("Account Holder Name:"+accountHolder);
		System.out.println("Account Holder DOB:"+dob);
		
		
		
	}
	

}
