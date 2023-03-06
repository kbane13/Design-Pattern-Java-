package com.aurionpro.model;

public class EmailNotifier implements INotifier {
	private static EmailNotifier notifier;
	private EmailNotifier() {
	}

	public static EmailNotifier getInstance() {
		if(notifier==null) {
			notifier=new EmailNotifier();
			
		}
		return notifier;
		
		
	}


	
	@Override
	public String toString() {
		return "EmailNotifier []";
	}

@Override
public void notifyUser(Account account, double amount, String transactionType) {
	
	System.out.println("amount :"+amount);
	System.out.println("Transaction Type:"+transactionType);
	System.out.println(account);
	
	
}


	


}
