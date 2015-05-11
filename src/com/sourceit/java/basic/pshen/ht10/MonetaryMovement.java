package com.sourceit.java.basic.pshen.ht10;

public class MonetaryMovement {
	public static long incomingMoney(long income, long base) {
		base = base + income;
		return base;
		}
	
	public static long outflowMoney(long outflow, long base) {
		if(base>=outflow){
			base = base - outflow;
		     }
		return base;
		}
	}


