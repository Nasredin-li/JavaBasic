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
	
	//public int i = 0;
	//public Account[] cust = new Account[i + 1];

	

	@Override
	public long incomingMoney(long income) {
		return basicStock.value = basicStock.value + income;
	}

	@Override
	public long outflowMoney(long outflow) {
		return basicStock.value = basicStock.value - outflow;
	}

	public void createAccount(Person somebody) {
		customers.add(new Account(somebody));
		
	}

	public void createCredit(Person somebody, long summ, int dateOfReturn) {
		customers.add(new Credit(somebody, summ, dateOfReturn));
		
	}

	public void convertMoney(Cash cash, BankMoney bmoney) {
	}

	public void toDeposit(Person customer, long summ) {
		for (Account e : customers) {
			if (e.ID == customer.ID) {
				System.out.println(customer.ID);
					e.someMoney.value = e.someMoney.value + summ;
			}
		}
	}

	

	public void outOfDeposit(Person customer, long summ) {
		for (Account e : customers) {
			if (e.ID == null) {
				return;
			} else {
				if (e.ID == customer.ID) {
					System.out.println(customer.ID);
					if (e.someMoney.value >= summ) {
						e.someMoney.value = e.someMoney.value - summ;
					}
				}
			}
		}
	}

}
