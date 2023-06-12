package com.atm.builder;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Name:");
		String bname=sc.next();
		System.out.println("Enter location:");
		String loc = sc.next();
		System.out.println("Enter ifscCode:");
		String ifsc = sc.next();
		Bank b = new Bank(bname, loc, ifsc);
		boolean option = true;
		int temp=1111;
		while (option) {
			System.out.println("Enter 1 create account");
			System.out.println("Enter 2 to display bank details");
			System.out.println("enter 3 deposit money");
			System.out.println("Enter 4 withdraw money");
			System.out.println("Enter 5 delete the account");
			System.out.println("Enter 6 exit&Close");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Account Holder Name:");
				String name = sc.next();
				System.out.println("Enter DoB:");
				String dob = sc.next();
				System.out.println("Enter pin");
				int pin = sc.nextInt();
				
				System.out.println("Enter Account no");
				long ac =sc.nextLong();
				System.out.println("Enter ammount");
				double amount =sc.nextDouble();
				if (pin==temp) {
					b.createAccount(new Account(name, dob, pin, ac, amount), pin);
					
				}
				else
				{
					System.err.println("enter valid pin ");
				}
				
				break;
			case 2:
				b.bankDetails();
				break;
			case 3:
				System.out.println("Enter amount :");
				double money = sc.nextDouble();
				System.out.println("Enter pin");
				pin = sc.nextInt();
				if (pin==temp) {
					b.deposit( money, pin);
					
				} else {
					System.err.println("Enter valid pin");

				}
				break;
			case 4:
				System.out.println("Enter pin");
				pin=sc.nextInt();
				System.out.println("enter money");
				money = sc.nextDouble();
				if (pin==temp) {
					b.withdrwal(pin, money);
					
				} else {
					System.err.println("Invalid pin");
					System.out.println("Enter valid pin");

				}
				break;
			case 5:
				b.deleteAccount();
				break;
			case 6:
				System.out.println("ThankQ for using:"+bname);
				System.out.println("Having GoodDay....!!!");
				option=false;
				break;
				
				

			default:
				System.out.println("Enter valid choice:");
				break;
			}
         }
	}

}
