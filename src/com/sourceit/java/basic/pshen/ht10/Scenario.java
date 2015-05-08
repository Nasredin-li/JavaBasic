package com.sourceit.java.basic.pshen.ht10;

import com.sourceit.java.basic.pshen.ht10.bank.Account;
import com.sourceit.java.basic.pshen.ht10.bank.Bank;
import com.sourceit.java.basic.pshen.ht10.bank.Credit;
import com.sourceit.java.basic.pshen.ht10.money.*;

public class Scenario {
	static Scenario sc = new Scenario();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank bank = new Bank("Aval", 50000);
		Person customer1 = new Person("Vasia", "Petrov", "MN12345", 1000);
		Person customer2 = new Person("Slava", "Smith", "MA654345", 830);
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
		sc.moneyToDeposit(customer1, 650, bank);
		System.out.println(bank.customers.get(0).surname
				+ " has in his account "
				+ bank.customers.get(0).someMoney.value);
		System.out.println(bank.customers.get(1).surname
				+ " has in his account "
				+ bank.customers.get(1).someMoney.value);
		bank.transfer(customer1, customer2, 400, bank);
		System.out.println(bank.customers.get(0).surname
				+ " has in his account "
				+ bank.customers.get(0).someMoney.value);
		System.out.println(bank.customers.get(1).surname
				+ " has in his account "
				+ bank.customers.get(1).someMoney.value);
		bank.createCredit(customer1, 5000, 20160505);
		sc.takeCreditMoney(customer1, 3000, bank);
		sc.takeMoney(customer2, 300, bank);
		System.out.println(customer1.name + " " + customer1.surname
				+ " cash money = " + customer1.someCash.value);
		System.out.println(customer2.name + " " + customer2.surname
				+ " cash money = " + customer2.someCash.value);
		System.out.println("Bank " + bank.nameOfBank + "has a basicstock = "
				+ bank.basicStock.value);
		System.out.println("General summ of moneys in bank " + bank.nameOfBank
				+ " " + bank.getBalance());
		// long u = ((Credit)(bank.customers.get(2))).maxValueOfCredit;
	}

	public void takeCreditMoney(Person customer, long creditSumm, Bank bank) {
			if (creditSumm <= ((Credit) (bank.customers.get(2))).maxValueOfCredit) {
				bank.outOfCredit(customer, creditSumm);
				customer.incomingMoney(creditSumm);
			}
			
				System.out.println(((Credit) (bank.customers.get(2))).someMoney.value);
	}

	public void moneyToDeposit(Person customer, long summ, Bank bank) {
		if (summ <= customer.someCash.value) {
			customer.outflowMoney(summ);
			bank.toDeposit(customer, summ);
			System.out.println(customer.surname + " add to deposit " + summ);
		} else {
			System.out.println("Insufficient funds, operation is canceled");
		}
	}

	public void takeMoney(Person customer, long summ, Bank bank) {
		bank.outOfDeposit(customer, summ);
		customer.incomingMoney(summ);
	}

}
