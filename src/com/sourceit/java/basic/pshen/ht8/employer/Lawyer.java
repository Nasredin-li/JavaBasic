package com.sourceit.java.basic.pshen.ht8.employer;

public class Lawyer extends Employer{
	
	public Lawyer(String name, int empIndex) {
		super(name, empIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMiddleMoney(int arg0) {
		this.middleMoney = (int) (20.8 * 8 *arg0);
		return this.middleMoney;
	}

}
