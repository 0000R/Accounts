package com.example.demo;

public class WithdrawOnly extends Account {

	public WithdrawOnly(double initalBalance) {
		super(initalBalance);
	}

	public void withdrawMoney(double money) {
		// remove money from account
		if (this.getBalance() - money > 0) {
			this.setBalance(this.getBalance() - money);
		} else {
			System.out.println("Insufficient Funds");
		}
	}
}