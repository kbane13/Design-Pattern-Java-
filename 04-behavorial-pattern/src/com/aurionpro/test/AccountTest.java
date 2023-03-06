package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.INotifier;
import com.aurionpro.model.InsufficientBalanceException;
import com.aurionpro.model.SmsNotifier;
import com.aurionpro.model.WhatsappNotifier;

public class AccountTest {

	public static void main(String[] args) throws InsufficientBalanceException {

		Account acc = new Account(1, "Krutika", 60000);
		acc.registerNotifier(SmsNotifier.getInstance());
		acc.registerNotifier(SmsNotifier.getInstance());
	
		acc.registerNotifier(EmailNotifier.getInstance());
		acc.registerNotifier(EmailNotifier.getInstance());
		acc.registerNotifier(WhatsappNotifier.getInstance());
		acc.registerNotifier(WhatsappNotifier.getInstance());
		
		//acc.withdraw(2000);
		acc.deposit(10000);
		
	}

}
