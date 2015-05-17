package com.sourceit.java.basic.pshen.ht10;

import com.sourceit.java.basic.pshen.ht10.money.Money;

public class MonetaryMovement {
	public static long incomingMoney(long income, long base) {
		base = base + income;
		return base;
		}
	public static long incomingMoney(long income, Money base) {
		base.value = base.value + income;
		return base.value;
		}
	
	public static long outflowMoney(long outflow, long base) {
		if(base>=outflow){
			base = base - outflow;
		     }
		return base;
		}
	public static long outflowMoney(long outflow, Money base) {
		if(base.value>=outflow){
			base.value = base.value - outflow;
		     }
		return base.value;
		}
	
	}


