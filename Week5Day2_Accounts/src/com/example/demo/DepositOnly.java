package com.example.demo;

public class DepositOnly extends Account {

	public DepositOnly(double initalBalance) {
		super(initalBalance);
	}

	public void addMoney(double money) {
		// add money to account
		this.setBalance(this.getBalance() + money);

	}
	
	private double interestRate = 0.05;
}