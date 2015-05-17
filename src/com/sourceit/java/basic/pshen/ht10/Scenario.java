package com.sourceit.java.basic.pshen.ht10;


import com.sourceit.java.basic.pshen.ht10.bank.Bank;
import com.sourceit.java.basic.pshen.ht10.bank.Credit;


public class Scenario {
	static Scenario sc = new Scenario();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank bank = new Bank("Aval", 50000);
		Person customer1 = new Person("Vasia", "Petrov", "MN12345", 1000);
		Person customer2 = new Person("Slava", "Smith", "MA654345", 500);
		
		sc.printDataOfPerson(customer1);
		sc.printDataOfPerson(customer2);
		bank.printBankData();
		
		bank.createAccount(customer1);
		bank.createAccount(customer2);
		
		sc.moneyToDeposit(customer1, 800, bank);
		bank.printDataAccounts();
		
		bank.transfer(customer1, customer2, 500);
		bank.printDataAccounts();
		
		bank.createCredit(customer1, 5000, 20160505);
		sc.takeCreditMoney(customer1, 3000, bank);
		sc.takeMoney(customer2, 300, bank);
		System.out.println();
		bank.printDataAccounts();
		
		sc.printDataOfPerson(customer1);
		sc.printDataOfPerson(customer2);
		bank.printBankData();
		
	}

	public void takeCreditMoney(Person customer, long creditSumm, Bank bank) {
		if (creditSumm <= ((Credit) (bank.customers.get(customer.CreditID))).maxValueOfCredit) {
			bank.outOfCredit(customer, creditSumm);
			MonetaryMovement.incomingMoney(creditSumm, customer.someCash);
			System.out.println(customer.surname +" takes "+creditSumm
					+" of credit");
			System.out.println(customer.surname + " has in credit account "
					+ ((Credit) (bank.customers.get(customer.CreditID))).someMoney.value);
		} else {
			System.out.println("Insufficient funds, operation is canceled");
		}

	}

	public void moneyToDeposit(Person customer, long summ, Bank bank) {
		if (summ <= customer.someCash.value) {
			MonetaryMovement.outflowMoney(summ, customer.someCash);
			bank.toDeposit(customer, summ);
			System.out.println(customer.surname + " add to deposit " + summ);
		} else {
			System.out.println("Insufficient funds, operation is canceled");
		}
	}

	public void takeMoney(Person customer, long summ, Bank bank) {
		if (summ <= bank.customers.get(customer.AccountID).someMoney.value) {
			bank.outOfDeposit(customer, summ);
			MonetaryMovement.incomingMoney(summ, customer.someCash);
			System.out.println(customer.surname + " takes from deposit " + summ);
		}else {
			System.out.print("Transfer " + summ +" from "+customer.surname+" account is impossible.");
			System.out.println("Insufficient funds, operation is canceled");
		}
	}
	public void printDataOfPerson(Person somebody){
		System.out.print(somebody.name);
		System.out.print(somebody.surname);
		System.out.print(" cash money = ");
		System.out.println(somebody.someCash.value);
	}

}
