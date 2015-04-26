package com.sourceit.java.basic.pshen.lesson7;

import com.sourceit.exercise.IntArrays;

//import java.util.*;

public class Exer {

	/**
	 * 
	 */
	public static void main(String[] args) {
		Exer b = new Exer();
		IntArrays  newArr = b.new MyArr();
		newArr.add(8);
		System.out.println(newArr.size());
		System.out.println(newArr.get(0));
		newArr.add(150);
		System.out.println(newArr.size());
		System.out.println(newArr.get(0));
		System.out.println(newArr.get(1));
		newArr.add(12);
		System.out.println(newArr.size());
		System.out.println(newArr.get(0));
		System.out.println(newArr.get(1));
		System.out.println(newArr.get(2));

	}
	public class MyArr implements IntArrays{
		
		int arrLength;
		int[] arr = new int[arrLength];
		

		@Override
		public void add(int arg) {
			int[] arr2 = new int[arrLength+1];
			arr2[arrLength] = arg;
			for(int i = 0; i <arrLength; i++){
				arr2[i] = this.arr[i];
			}
			this.arr = arr2;
			this.arrLength = arr2.length;
		}

		@Override
		public int get(int arg) {
			int g = this.arr[arg];
			return g;
		}

		@Override
		public int size() {
			return this.arrLength;
		}
		
	}
}
