package com.sourceit.java.basic.pshen.ht10;



import com.sourceit.java.basic.pshen.ht10.money.Cash;

public class Person implements MonetaryMovement {
	public String name;
	public String surname;
	public String ID;
	public Cash someCash;
	public Person(String name, String surname, String ID, long summ){
		this.name = name;
		this.surname = surname;
		this.ID = ID;
		this.someCash = new Cash(summ);
	};
	
	
	public long incomingMoney(long income){
		someCash.value = someCash.value + income;
		return someCash.value;
		}
	
	public long outflowMoney(long outflow){
		if(someCash.value>=outflow){
		     someCash.value = someCash.value - outflow;
		     }
		return someCash.value;
		}
	
	

}
