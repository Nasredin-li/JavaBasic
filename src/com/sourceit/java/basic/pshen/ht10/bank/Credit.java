package com.sourceit.java.basic.pshen.ht10.bank;

import com.sourceit.java.basic.pshen.ht10.Person;

public class Credit extends Account{
	
	public int dateOfCreditReturn;
	public long maxValueOfCredit;

	public Credit(Person somebody, long maxValueOfCredit, int dateOfCreditReturn) {
		super(somebody);
		this.dateOfCreditReturn = dateOfCreditReturn;
		this.maxValueOfCredit = maxValueOfCredit;
		super.incomingMoney(maxValueOfCredit);
	}


	

}
