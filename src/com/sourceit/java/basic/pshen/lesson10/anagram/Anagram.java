package com.sourceit.java.basic.pshen.lesson10.anagram;

import com.sourceit.java.basic.pshen.ht8.employer.Employer;

public class Anagram {

	public static void main(String[] args) {
		String anagramBase = args[0];
		System.out.println(anagramBase);
		StringBuilder strb = new StringBuilder();
		for (int i = 1; i < args.length; i++) {
			System.out.println(args[i]);
			String an = args[i];
			strb.append(args[i]);
		}

		char[] ch = anagramBase.toCharArray();
		sortABC(ch);
		System.out.println(ch);
		char[] ch2 = strb.toString().toCharArray();
		sortABC(ch2);
		System.out.println(ch2);

		for (int p = 0; ch.length == ch2.length && p < ch.length
				&& (ch[p] == ch2[p]); p++) {
			if (p == (ch.length - 1)) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}

	public static void sortABC(char[] top) {
		for (int d = 0; d < top.length; d++) {
			for (int c = 0; c < top.length; c++) {
				if (top[d] < top[c]) {
					char w = top[d];
					top[d] = top[c];
					top[c] = w;

				}
			}
		}
	}
}
