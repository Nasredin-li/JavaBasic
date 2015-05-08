package com.sourceit.java.basic.pshen.ht10.bank;

import java.util.ArrayList;

import com.sourceit.java.basic.pshen.ht10.Person;

public class Proof {
	
	ArrayList<Account> customers = new ArrayList<Account>();

	public static void main(String[] args) {
		Proof proof = new Proof();
		Person customer1 = new Person("Vasia", "Petrov", "MN12345", 254);
		Person customer2 = new Person("Slava", "Smith", "MA654345", 300);
		Person customer3 = new Person("Tasia", "Metrov", "MQ19345", 200);
		Person customer4 = new Person("Tulava", "Tmith", "MH694345", 100);
		proof.createAccount(customer1);
		System.out.println(proof.customers.get(0).getClass());
		proof.createAccount(customer2);
		proof.createAccount(customer2);
		proof.createAccount(customer3);
		proof.createAccount(customer4);
		proof.customers.getClass();
		proof.customers.get(0).someMoney.value = proof.customers.get(0).someMoney.value + 50;
		proof.customers.get(0).someMoney.value = proof.customers.get(0).someMoney.value + 50;
		System.out.println(proof.customers.get(0).someMoney.value);

	}
	public void createAccount(Person somebody) {
		customers.add(new Account(somebody));
	}

}
