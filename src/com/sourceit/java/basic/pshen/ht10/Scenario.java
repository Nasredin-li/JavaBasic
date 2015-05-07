package com.sourceit.java.basic.pshen.ht10;

import com.sourceit.java.basic.pshen.ht10.bank.Bank;
import com.sourceit.java.basic.pshen.ht10.money.*;

public class Scenario {
	static Scenario sc = new Scenario();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank bank =new Bank("Aval", 50000);
		//bank.basicStock.value = bank.stock;//kostyl
		Person customer1 = new Person("Vasia", "Petrov", "MN12345");
		Person customer2 = new Person("Slava", "Smith", "MA654345");
		System.out.println(customer1.someCash.value);
		System.out.println(customer2.someCash.value);
		System.out.println(bank.basicStock.value);
		bank.createAccount(customer1);
		bank.createAccount(customer2);
		sc.moneyToDeposit(customer1, 650, bank);
		System.out.println(bank.customers.get(0).someMoney.value);
		System.out.println(customer1.someCash.value);
		sc.transfer(customer1,customer2, 300, bank);
		bank.createCredit(customer1, 5000, 20160505);
		sc.takeCredit(customer1, 3000, bank);
		sc.takeMoney(customer2, 400, bank);
		bank.toDeposit(customer2, 200);
		System.out.println(customer1.someCash.value);
		System.out.println(customer2.someCash.value);
		System.out.println(bank.basicStock.value);
	
	}
	public void takeCredit(Person customer, long credit, Bank bank){
		
	}
	public void moneyToDeposit(Person customer, long summ, Bank bank){
		customer.outflowMoney(summ);
		//System.out.println(customer.someCash.value);
		bank.toDeposit(customer, summ);
	}
	public void transfer(Person beneficier, Person recepient, long summ, Bank bank){
		bank.outOfDeposit(beneficier, summ);
		bank.toDeposit(recepient, summ);
		
	}
    public void takeMoney(Person customer, long summ, Bank bank){
		
	}
	

}
