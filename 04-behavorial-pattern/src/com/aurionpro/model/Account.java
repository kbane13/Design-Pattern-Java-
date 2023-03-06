package com.aurionpro.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Account {
	
	private int accountnumber;
	private String name;
	private double balance;
	private Set<INotifier> notifiers;
	
	
	public Account(int accountnumber, String name, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		notifiers=new HashSet<INotifier>();
		
		//this.notifiers = notifiers;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Set<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(Set<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	public void deposit(double amount) {
		if(balance >amount) {
			balance += amount;
			for(INotifier x:notifiers) {
				x.notifyUser(this,amount,"deposit");
			}
		}
	}
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(balance-amount>0) {
			balance=balance-amount;
			for(INotifier x:notifiers) {
				x.notifyUser(this,amount,"withdraw");
			}
		}
		else {
			throw new InsufficientBalanceException("Insufficient Funds");
		}
		
	}
	public void registerNotifier(INotifier notifier ) {
	getNotifiers().add(notifier);	

	}
	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers +  "]";
	}
	

	

}
