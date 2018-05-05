
import java.util.*;

public class BankAccount {
	protected static String accountNumber;
	protected double checkingBalance;
	protected double savingsBalance;
	public static int totalAccounts;
	public BankAccount() {
		savingsBalance = 0;
		checkingBalance = 0;
		accountNumber = setAccountNumber();
		totalAccounts++;
	}
	
	public String getAccountNumber() {
		System.out.println("Your account number is: " + accountNumber);
		return accountNumber;
	}

	private static String setAccountNumber() {
		accountNumber = ""; 
		for(int i=0; i<10; i++) {
			int random = (int)(Math.random() * 10);
			accountNumber = accountNumber.concat(String.valueOf(random));
		}
		System.out.println("Your account number is: " + accountNumber);
		return accountNumber;
	}

	public double getCheckingBalance() {
		System.out.println(totalAccounts);
		return checkingBalance;
	}

	public void withdrawFromChecking(double checkingBalance) {
		if(this.checkingBalance<checkingBalance) {
			System.out.println("Insufficient Funds");
		}
		this.checkingBalance = checkingBalance;
		System.out.println("Your checking balance is now: " + checkingBalance);
	}
	public void depositInChecking(double checkingBalance) {
		this.checkingBalance = checkingBalance;
		System.out.println("Your checking balance is now: " + checkingBalance);
	}

	public double getSavingsBalance() {
		System.out.println("Your savings balance: " + savingsBalance);
		return savingsBalance;
	}

	public void withdrawFromSavings(double savingsBalance) {
		if(this.savingsBalance<savingsBalance) {
			System.out.println("Insufficient Funds");
		}
		this.savingsBalance = savingsBalance;
		System.out.println("Your savings balance is now: " + savingsBalance);
	}
	public void depositInSavings(double savingsBalance) {
		this.savingsBalance = savingsBalance;
		System.out.println("Your savings balance is now: " + savingsBalance);
	}


	public static int getTotalAccounts() {
		System.out.println("The total number of accounts is: "+ totalAccounts);
		return totalAccounts;
	}
}
