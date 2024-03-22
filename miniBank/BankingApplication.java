package miniBank;

import java.util.Scanner;

import customException.InsufficientBankBalaenceException;
import customException.InvalidAmount;

public class BankingApplication {
	static Scanner s = new Scanner(System.in);
	static double bal = 2000;

	public static void main(String[] args) {
		choose();
	}

	public static void withdrawal() {

		System.out.println("Enter the amount to withdrawal");
		double amt = s.nextDouble();
		if (amt > 0 && amt <= bal) {
			System.out.println(" An amount of Rs." + amt + " has be DEBITED to your account");
			bal = bal - amt;
			System.out.println("Total Avail.Bal Rs." + bal + "\nThank you");
		} else if (amt > bal) {
			try {
				InsufficientBankBalaenceException i = new InsufficientBankBalaenceException();
				throw i;
			} catch (InsufficientBankBalaenceException e) {
				System.out.println("Your bank account does not have enough balance. Check Balance.");
			}
		} else if (amt < 0) {
			try {
				InvalidAmount n = new InvalidAmount();
				throw n;
			} catch (InvalidAmount i) {
				System.out.println("Enter Valid amount Don't give negative value");
			}

		}
		choose();
	}

	public static void balanceEnquairy() {
		System.out.println("Total Avail.Bal Rs." + bal + "\nThank you\n");
		continues();
	}

	public static void deposit() {
		System.out.println("Enter the amount to deposit");
		double amt = s.nextDouble();
		if (amt > 0) {
			bal = bal + amt;
			System.out.println("Total Avail.Bal Rs." + bal + "\nThank you");
		} else {
			try {
				throw new InvalidAmount();
			} catch (InvalidAmount e) {
				System.out.println("Enter Valid amount Don't give negative value");
			}
		}
		choose();
	}

	public static void cancel() {
		System.out.println("\nThank you :)");
		s.close();
	}

	public static void continues() {
		System.out.println("Choose a number \n1.continue \n2.cancel");
		int n = s.nextInt();
		switch (n) {
		case 1:
			choose();
			break;
		case 2:
			cancel();
			break;
		default:
			System.out.println("Invalid\n");
			continues();
		}
	}

	public static void choose() {
		
		System.out.println("Choose a number \n1.Withdrawal \n2.Balance Enquariy \n3.Deposit \n4.Cancel");
		int n = s.nextInt();
		switch (n) {
		case 1:
			withdrawal();
			break;
		case 2:
			balanceEnquairy();
			break;
		case 3:
			deposit();
			break;
		case 4:
			cancel();
			break;
		default:
			System.out.println("Invalid number enter given number");
			choose();
		}
	}
}
