package com.sourceit.java.basic.pshen.ht10;



import com.sourceit.java.basic.pshen.ht10.money.Cash;

public class Person {
	public String name;
	public String surname;
	public String ID;
	public Cash someCash;
	public int AccountID;
	public int CreditID;
	public Person(String name, String surname, String ID, long summ){
		this.name = name;
		this.surname = surname;
		this.ID = ID;
		this.someCash = new Cash(summ);
	}
	
	
	
}
