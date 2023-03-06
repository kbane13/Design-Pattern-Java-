package com.aurionpro.model;

public class WhatsappNotifier implements INotifier {
	private static WhatsappNotifier notifier;
	private WhatsappNotifier() {
	}

	public static WhatsappNotifier getInstance() {
		if(notifier==null) {
			notifier=new WhatsappNotifier();
		}
		return notifier;
		
		
	}
	

	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
		System.out.println("amount "+amount);
		System.out.println("Transaction Type:"+transactionType);
		System.out.println(account);
		
	}

	@Override
	public String toString() {
		return "WhatsappNotifier []";
	}

}
