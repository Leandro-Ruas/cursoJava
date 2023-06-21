package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AulaOitentaEUmBank;

public class AulaOitentaEUm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AulaOitentaEUmBank bank;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char c = sc.next().charAt(0);
		
		if(c == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
	
			 bank = new AulaOitentaEUmBank(accountNumber, name, initialDeposit);
			
		} else {
			
			 bank = new AulaOitentaEUmBank(accountNumber, name);
			
		}
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(bank);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.depositAccount(deposit);
		
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bank.withdrawAccount(withdraw);
		
		System.out.println("Updated account data:");
		System.out.println(bank);
		
		sc.close();
	}

}
