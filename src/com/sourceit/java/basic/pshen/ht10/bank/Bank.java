package com.sourceit.java.basic.pshen.ht10.bank;

import java.util.ArrayList;
import java.util.List;

import com.sourceit.java.basic.pshen.ht10.*;
import com.sourceit.java.basic.pshen.ht10.money.*;

public class Bank implements MonetaryMovement {

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

	@Override
	public long incomingMoney(long income) {
		return basicStock.value = basicStock.value + income;
	}

	@Override
	public long outflowMoney(long outflow) {
		return basicStock.value = basicStock.value - outflow;
	}

	long temp = 0;
	long balance = 0;

	public long getBalance() {
		for (Account e : customers) {
			temp = temp + e.someMoney.value;
		}
		this.balance = basicStock.value + temp;
		return balance;
	}

	public void createAccount(Person somebody) {
		customers.add(new Account(somebody));
	}

	public void createCredit(Person somebody, long summ, int dateOfReturn) {
		customers.add(new Credit(somebody, summ, dateOfReturn));
		outflowMoney(summ);
	}

	public void convertMoney(Cash cash, BankMoney bmoney) {
	}

	public void toDeposit(Person customer, long summ) {
		for (Account e : customers) {
			if (e.ID == customer.ID && e.surname == customer.surname
					&& e.name == customer.name) {
				e.someMoney.value = e.someMoney.value + summ;
			}
		}
	}

	public void transfer(Person beneficier, Person recepient, long summ,
			Bank bank) {
		bank.outOfDeposit(beneficier, summ);
		bank.toDeposit(recepient, summ);
		System.out.println(beneficier.surname + " transfer to "
				+ recepient.surname + "`s deposit " + summ);

	}

	public void findCreditIndex(Person customer) {
		for (Account e : customers) {
			if((Credit)e != null ){}
		}
	}

	public void outOfCredit(Person customer, long summ) {
		for (Account e : customers) {
			if (e.getClass() == Credit.class && e.ID == customer.ID
					&& e.surname == customer.surname && e.name == customer.name
					&& e.someMoney.value >= summ) {
				e.someMoney.value = e.someMoney.value - summ;

			}
		}
	}

	public void outOfDeposit(Person customer, long summ) {
		for (Account e : customers) {
			if (e.ID == customer.ID && e.surname == customer.surname
					&& e.name == customer.name && e.someMoney.value >= summ) {
				e.someMoney.value = e.someMoney.value - summ;

			}
		}
	}

}
