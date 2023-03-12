package entities;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		 
		Account ac = new Account();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String yn = sc.nextLine();
		
		if (yn.equals("y")) {
			System.out.print("Enter a deposit value: ");
			double initialDeposit = sc.nextDouble();
			ac = new Account (number,name,initialDeposit);
		}
		else {
			ac = new Account(number,name);
				
		}
		System.out.print(ac);
		System.out.print("Enter a deposit value: ");
		ac.deposit(sc.nextDouble());
		System.out.print("Updated account data: ");
		System.out.printf("Account %i, Holder: %s, Balance: $ %.2f ",ac.getNumber(),ac.getName(),ac.getBalance());
		
		System.out.print("Enter a withdraw value: ");
		ac.withdraw(sc.nextDouble());
		System.out.print("Updated account data: ");
		System.out.printf("Account %i, Holder: %s, Balance: $ %.2f ",ac.getNumber(),ac.getName(),ac.getBalance());
		
		sc.close();
	}

}
