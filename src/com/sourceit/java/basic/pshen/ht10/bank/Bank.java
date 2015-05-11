package com.sourceit.java.basic.pshen.ht10.bank;

import java.util.ArrayList;

import com.sourceit.java.basic.pshen.ht10.*;
import com.sourceit.java.basic.pshen.ht10.money.*;

public class Bank {

	public String nameOfBank;
	public long stock;

	public Bank(String nameOfBank, long stock) {
		this.nameOfBank = nameOfBank;
		this.stock = stock;
		BankMoney basicStock = new BankMoney(stock);
		this.basicStock = basicStock;
	}

	public BankMoney basicStock = new BankMoney(stock);
	public ArrayList<Account> customers = new ArrayList<Account>();

	long temp = 0;
	long balance = 0;
	public int AccountID;

	public long getBalance() {
		for (Account e : customers) {
			temp = MonetaryMovement.incomingMoney(e.someMoney.value, temp);
		}
		this.balance = MonetaryMovement.incomingMoney(temp, basicStock.value);
		return balance;
	}

	public void createAccount(Person somebody) {
		customers.add(new Account(somebody));
		somebody.AccountID = this.AccountID;
		this.AccountID++;
	}

	public void createCredit(Person somebody, long summ, int dateOfReturn) {
		customers.add(new Credit(somebody, summ, dateOfReturn));
		//System.out.println(customers.get(somebody.CreditID).someMoney.value);
		basicStock.value = MonetaryMovement
				.outflowMoney(summ, basicStock.value);
		somebody.CreditID = this.AccountID;
		this.AccountID++;
		System.out
				.println("Credit limit for "
						+ somebody.surname
						+ " credit account = "
						+ ((Credit) (customers.get(somebody.CreditID))).maxValueOfCredit);

	}

	public void toDeposit(Person customer, long summ) {
		for (Account e : customers) {
			if (checkCustomerData(customer, e)) {
				e.someMoney.value = MonetaryMovement.incomingMoney(summ,
						e.someMoney.value);
			}
		}
	}

	public void transfer(Person beneficier, Person recepient, long summ,
			Bank bank) {
		bank.outOfDeposit(beneficier, summ);
		bank.toDeposit(recepient, summ);
		System.out.println(beneficier.surname + " makes transfer to "
				+ recepient.surname + "`s deposit " + summ);

	}

	public void outOfCredit(Person customer, long summ) {
		for (Account e : customers) {
			if (e.getClass() == Credit.class && checkCustomerData(customer, e)) {
				e.someMoney.value = MonetaryMovement.outflowMoney(summ,
						e.someMoney.value);
			}
		}
	}

	public void outOfDeposit(Person customer, long summ) {
		for (Account e : customers) {
			if (checkCustomerData(customer, e)) {
				e.someMoney.value = MonetaryMovement.outflowMoney(summ,
						e.someMoney.value);
			}
		}
	}

	public boolean checkCustomerData(Person customer, Account e) {
		if (e.ID == customer.ID && e.surname == customer.surname
				&& e.name == customer.name) {
			return true;
		}else{
		return false;}
	}

}
