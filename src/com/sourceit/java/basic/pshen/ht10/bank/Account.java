package com.sourceit.java.basic.pshen.ht10.bank;

import com.sourceit.java.basic.pshen.ht10.MonetaryMovement;
import com.sourceit.java.basic.pshen.ht10.Person;
import com.sourceit.java.basic.pshen.ht10.money.*;

public class Account implements MonetaryMovement{
	public String name;
	public String surname;
	public String ID;
	
	public Account(Person somebody) {
		this.name = somebody.name;
		this.surname = somebody.surname;
		this.ID = somebody.ID;
	}
	
	public BankMoney someMoney = new BankMoney(0);
	
	public long incomingMoney(long income) {
		someMoney.value = someMoney.value + income;
		System.out.print(someMoney.value);
		return someMoney.value;
	}


	public long outflowMoney(long outflow) {
		someMoney.value = someMoney.value- outflow;
		System.out.print(someMoney.value);
		return someMoney.value;
	}

}
