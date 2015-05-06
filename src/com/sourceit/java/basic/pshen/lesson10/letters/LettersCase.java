package com.sourceit.java.basic.pshen.lesson10.letters;

public class LettersCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			String s = args[i];
			int j = i + 1;
			if (j < args.length) {
				String d = args[j];
				if (s.contains(".") == false) {
					System.out.print(args[i] + " ");
				} else {
					System.out.println(args[i]);
					char[] ch = d.toUpperCase().toCharArray();
					System.out.print(ch[0]);
					System.out.print(d.substring(1));
					System.out.print(" ");
					i++;
				} 
			}else {
				System.out.println(args[i] + " ");
				}
		}
	}

}
