package com.sourceit.java.basic.pshen.ht8.employer;

public abstract class Employer {
	public String name;
	public int empIndex;
	public int middleMoney;
	
	public Employer(String name, int empIndex) {
		this.name = name;
		this.empIndex = empIndex;
	}

	
	public abstract int getMiddleMoney(int arg0);


}
