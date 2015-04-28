package com.sourceit.java.basic.pshen.lesson10.math;

public class Adder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 2){
			System.out.println("Error");
			return;
		}else{
		int summ = 0;
		for (int i = 0; i < args.length; i++) {
			summ = summ + Integer.parseInt(args[i]);
			
		}
		System.out.println(summ);}
	}
}
