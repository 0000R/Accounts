package com.example.demo;

public class Account {
	private double balance;

	public Account(double initalBalance) {
		this.balance = initalBalance;
	}

	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}

	public double getBalance() {
		return this.balance;
	}
}