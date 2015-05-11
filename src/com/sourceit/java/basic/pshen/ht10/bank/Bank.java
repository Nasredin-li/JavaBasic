package com.sourceit.java.basic.pshen.ht10.bank;

import java.util.ArrayList;

import com.sourceit.java.basic.pshen.ht10.*;
import com.sourceit.java.basic.pshen.ht10.money.*;

public class Bank {

	public String nameOfBank;
	public Money basicStock;

	public Bank(String nameOfBank, long stock) {
		this.nameOfBank = nameOfBank;
		Money basicStock = new Money(stock);
		this.basicStock = basicStock;
	}
	
	public ArrayList<Account> customers = new ArrayList<Account>();

	public long getBalance() {
		long temp = 0;
		for (Account e : customers) {
			temp = MonetaryMovement.incomingMoney(e.someMoney.value, temp);
		}
		return MonetaryMovement.incomingMoney(temp, basicStock.value);
	}

	public int AccountID;

	public void createAccount(Person somebody) {
		customers.add(new Account(somebody));
		somebody.AccountID = this.AccountID;
		this.AccountID++;
	}

	public void createCredit(Person somebody, long summ, int dateOfReturn) {
		customers.add(new Credit(somebody, summ, dateOfReturn));
		MonetaryMovement.outflowMoney(summ, basicStock);
		somebody.CreditID = this.AccountID;
		this.AccountID++;
		System.out
				.println("Credit limit for "
						+ somebody.surname
						+ " credit account = "
						+ ((Credit) (customers.get(somebody.CreditID))).maxValueOfCredit);
	}

	public void toDeposit(Person customer, long summ) {
		if (checkCustomerData(customer, customers.get(customer.AccountID))) {
			MonetaryMovement.incomingMoney(summ,
					customers.get(customer.AccountID).someMoney);
		}
	}

	public void transfer(Person beneficier, Person recepient, long summ) {
		if (summ <= customers.get(beneficier.AccountID).someMoney.value) {
			outOfDeposit(beneficier, summ);
			toDeposit(recepient, summ);
			System.out.println(beneficier.surname + " makes transfer to "
					+ recepient.surname + "`s deposit " + summ);
		} else {
			System.out.print("Transfer " + summ + " from " + beneficier.surname
					+ " account to " + recepient.surname
					+ " account is impossible.");
			System.out.println("Insufficient funds, operation is canceled");
		}
	}

	public void outOfCredit(Person customer, long summ) {
		if (customers.get(customer.CreditID).getClass() == Credit.class
				&& checkCustomerData(customer, customers.get(customer.CreditID))) {
			MonetaryMovement.outflowMoney(summ,
					customers.get(customer.CreditID).someMoney);
		}
	}

	public void outOfDeposit(Person customer, long summ) {
		if (checkCustomerData(customer, customers.get(customer.AccountID))) {
			MonetaryMovement.outflowMoney(summ,
					customers.get(customer.AccountID).someMoney);
		}
	}

	public boolean checkCustomerData(Person customer, Account e) {
		if (e.ID == customer.ID && e.surname == customer.surname
				&& e.name == customer.name) {
			return true;
		} else {
			return false;
		}
	}

	public void printDataAccounts() {
		for (Account e : customers) {
			System.out.print(e.name + " ");
			System.out.print(e.surname + ", ID ");
			System.out.print(e.ID + " ");
			if (e.getClass() == Credit.class) {
				System.out.println("has in credit account = " + e.someMoney.value);
			} else {
				System.out.println("has in deposit account = " + e.someMoney.value);
			}
		}
	}
	public void printBankData(){
		System.out.print("Bank "+nameOfBank);
		System.out.println(" basicstoke = "+basicStock.value);
		System.out.println("Total moneys in bank = "+ getBalance());
	}

}
