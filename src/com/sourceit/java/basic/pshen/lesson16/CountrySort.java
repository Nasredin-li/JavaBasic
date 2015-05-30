package com.sourceit.java.basic.pshen.lesson16;

import java.io.*;
import java.util.*;

public class CountrySort {

	public static void main(String[] args) throws IOException {
		CountrySort k = new CountrySort();
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try {
			inputStream = new BufferedReader(
					new FileReader(
							"F:\\JAVA\\eclipse\\JavaBasic\\src\\com\\sourceit\\java\\basic\\pshen\\lesson16\\Country.txt"));
			outputStream = new PrintWriter(
					new FileWriter(
							"F:\\JAVA\\eclipse\\JavaBasic\\src\\com\\sourceit\\java\\basic\\pshen\\lesson16\\CountrySorted.txt"));
			String c;

			TreeSet<String> arr = new TreeSet<String>();
			HashSet<String> brr = new HashSet<String>();
			
			while ((c = inputStream.readLine()) != null) {
				arr.add(c);
				
			}
			
			arr.remove(arr.first());
			for (String e : arr) {
				String p = addLetter(e);
				if(brr.contains(p)!= true){
					brr.add(p);
					System.out.println(p);
					outputStream.println(p);
				}
				outputStream.println(e);
			}
			
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}

		}

	}

	private static String addLetter(String e) throws NullPointerException{
		String t = null;
		e.toCharArray();
		int i = 0;
		for (Character h : e.toCharArray()) {
			if (Character.isLetter(h) && i < 1) {
				t = h.toString();
				i++;

			}

		}
		
		return t;
	}
}
