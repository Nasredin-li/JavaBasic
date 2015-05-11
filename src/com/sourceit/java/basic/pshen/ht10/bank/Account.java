package com.sourceit.java.basic.pshen.ht10.bank;


import com.sourceit.java.basic.pshen.ht10.Person;
import com.sourceit.java.basic.pshen.ht10.money.*;

public class Account{
	public String name;
	public String surname;
	public String ID;
	
	public Account(Person somebody) {
		this.name = somebody.name;
		this.surname = somebody.surname;
		this.ID = somebody.ID;
	}
	
	public BankMoney someMoney = new BankMoney(0);
	
	

}
