package com.sourceit.java.basic.pshen.ht6.family;

import java.util.*;

import com.sourceit.java.basic.pshen.ht6.shop.Foodstuff;


public abstract class Human {
	public String name;
	public String surname;
	protected int dateOfBorn;
	protected String sex;
	private int age;
	
	
	
	public abstract String eat(Foodstuff something);
	
	public abstract boolean isHappy();
	
	public abstract void think();
	
	public int getAge(){
		Calendar c = new GregorianCalendar();
        System.out.println(c.get(Calendar.YEAR));
		age	= c.get(Calendar.YEAR)- getdateOfBorn();
		return age;
	}

	public int getdateOfBorn() {
		// TODO Auto-generated method stub
		return dateOfBorn;
	}

	
	


}
