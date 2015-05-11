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
		System.out.println(customer1.name + " " + customer1.surname
				+ " cash money = " + customer1.someCash.value);
		System.out.println(customer2.name + " " + customer2.surname
				+ " cash money = " + customer2.someCash.value);
		System.out.println("Bank " + bank.nameOfBank + " has a basicstock = "
				+ bank.basicStock.value);
		System.out.println("General summ of moneys in bank " + bank.nameOfBank
				+ " " + bank.getBalance());
		bank.createAccount(customer1);
		bank.createAccount(customer2);
		sc.moneyToDeposit(customer1, 800, bank);
		System.out.println(bank.customers.get(customer1.AccountID).surname
				+ " has in his account "
				+ bank.customers.get(customer1.AccountID).someMoney.value);
		System.out.println(bank.customers.get(customer2.AccountID).surname
				+ " has in his account "
				+ bank.customers.get(customer2.AccountID).someMoney.value);
		bank.transfer(customer1, customer2, 400, bank);
		System.out.println(bank.customers.get(customer1.AccountID).surname
				+ " has in his account "
				+ bank.customers.get(customer1.AccountID).someMoney.value);
		System.out.println(bank.customers.get(customer2.AccountID).surname
				+ " has in his account "
				+ bank.customers.get(customer2.AccountID).someMoney.value);
		bank.createCredit(customer1, 5000, 20160505);
		//System.out.println(((Credit) (bank.customers.get(customer1.CreditID))).maxValueOfCredit);
		sc.takeCreditMoney(customer1, 3000, bank);
		sc.takeMoney(customer2, 300, bank);
		System.out.println();
		System.out.println(bank.customers.get(customer1.AccountID).surname
				+ " has in his account "
				+ bank.customers.get(customer1.AccountID).someMoney.value);
		System.out.println(bank.customers.get(customer2.AccountID).surname
				+ " has in his account "
				+ bank.customers.get(customer2.AccountID).someMoney.value);
		System.out.println(customer1.name + " " + customer1.surname
				+ " cash money = " + customer1.someCash.value);
		System.out.println(customer2.name + " " + customer2.surname
				+ " cash money = " + customer2.someCash.value);
		System.out.println("Bank " + bank.nameOfBank + "has a basicstock = "
				+ bank.basicStock.value);
		System.out.println("General summ of moneys in bank " + bank.nameOfBank
				+ " " + bank.getBalance());

	}

	public void takeCreditMoney(Person customer, long creditSumm, Bank bank) {
		if (creditSumm <= ((Credit) (bank.customers.get(customer.CreditID))).maxValueOfCredit) {
			bank.outOfCredit(customer, creditSumm);
			customer.someCash.value = MonetaryMovement.incomingMoney(creditSumm, customer.someCash.value);
			System.out.println(customer.surname + " takes " + creditSumm
					+ " of credit");
			System.out.println(customer.surname + " has in credit account "
					+ ((Credit) (bank.customers.get(customer.CreditID))).someMoney.value);
		} else {
			System.out.println("Insufficient funds, operation is canceled");
		}

	}

	public void moneyToDeposit(Person customer, long summ, Bank bank) {
		if (summ <= customer.someCash.value) {
			customer.someCash.value = MonetaryMovement.outflowMoney(summ, customer.someCash.value);
			bank.toDeposit(customer, summ);
			System.out.println(customer.surname + " add to deposit " + summ);
		} else {
			System.out.println("Insufficient funds, operation is canceled");
		}
	}

	public void takeMoney(Person customer, long summ, Bank bank) {
		if (summ <= bank.customers.get(customer.AccountID).someMoney.value) {
			bank.outOfDeposit(customer, summ);
			customer.someCash.value = MonetaryMovement.outflowMoney(summ, customer.someCash.value);
			System.out.println(customer.surname + " takes from deposit " + summ);
		}else {
			System.out.println("Insufficient funds, operation is canceled");
		}
	}

}
