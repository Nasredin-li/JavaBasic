package com.sourceit.java.basic.pshen.ht8.employer;

public class Developer extends Employer{
	public Developer(String name, int empIndex) {
		super(name, empIndex);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int getMiddleMoney(int arg0) {
		this.middleMoney = arg0;
		return this.middleMoney;
	}

}
