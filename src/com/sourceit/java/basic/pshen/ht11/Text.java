package com.sourceit.java.basic.pshen.ht11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Text extends TextStatistics {

	public Text(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCharFrequency(char c) {
		
		return getCharCount(c) * 100 / getText().length();

	}

	@Override
	public int getCharCount(char c) {
		int count = 0;
		for (char e : getText().toCharArray()) {
			if (e == c) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Map<String, Integer> getChars() {
		Map<String, Integer> unique = new TreeMap<String, Integer>();
		for (char e : getText().toCharArray()) {
			unique.put(String.valueOf(e), getCharCount(e));
		}
		return unique;
	}
	
	@Override
	public List<String> words() {
		List<String> list = new ArrayList<String>();
		StringBuilder txt2 = new StringBuilder();
		
		for (char e : getText().toCharArray()) {
			
			if(Character.isWhitespace(e)){
				list.add(txt2.toString());
				txt2.delete(0, txt2.length());
			}
			if (Character.isLetter(e)) { 								
				txt2.append(e);
			}
		}
		return list;
	}

	/*@Override
	public List<String> words() {
		List<String> list = new ArrayList<String>();
		StringBuilder txt2 = new StringBuilder();
		for (char e : getText().toCharArray()) {
			if (Character.isLetter(e) || Character.isWhitespace(e)) { // take
																		// letter
																		// &
																		// space
				txt2.append(e); // full the stringbuilder
			}
		}
		for (String e : txt2.toString().split(" ")) {// split the stringbuilder
														// to words
			list.add(e);// full the List
		}
		return list;
	}*/

	/**
	 * public Map<Integer, String> getChars2() - not include all text chars,
	 * only for methods getMostPopularCharCount() & getLeastPopularCharCount(),
	 * 
	 * @return
	 */

	public Map<Integer, String> getChars2() {
		Map<Integer, String> uniqueRevert = new TreeMap<Integer, String>();
		for (char e : getText().toCharArray()) {
			uniqueRevert.put(getCharCount(e), String.valueOf(e));
		}
		return uniqueRevert;
	}

	@Override
	public int getMostPopularCharCount() {
		return (int) ((TreeMap<Integer, String>) getChars2()).lastEntry()
				.getKey();
	}

	@Override
	public int getLeastPopularCharCount() {
		return (int) ((TreeMap<Integer, String>) getChars2()).firstEntry()
				.getKey();
	}

	@Override
	public char getCharByCount(int count) {
		char i;
		HashSet<Character> arr = new HashSet<Character>();
		for (char e : getText().toCharArray()) {
			if (getCharCount(e) == count) {
				i = e;
				arr.add(e);
			}
			
		}
		System.out.println("CharByCount in massive: "+arr);
		return arr.toString().charAt(1);
	}

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("Enter a text as comand line argument.");
			return;
		}
		StringBuilder txt = new StringBuilder();
		for (String e : args) {
			txt.append(e);
			txt.append(' ');
		}
		Text a = new Text(txt.toString());

		System.out.println("Text: "+a.getText());						//			getText()
		System.out.println("'" + 'î' + "'" + " frequency using is "		//			getCharFrequency()
				+ a.getCharFrequency('î') + "%");
		System.out.println("Number of char 'à' in a text "				//			getCharCount()
				+ a.getCharCount('à'));
		System.out.println("getChars: "+a.getChars());					//			getChars()
		System.out.println("Words massive: "+a.words());
		System.out.println("MostPopularCharCount: "+a.getMostPopularCharCount());// getMostPopularCharCount()
		System.out.println("LeastPopularCharCount: "+a.getLeastPopularCharCount());//getLeastPopularCharCount()
		System.out.println("CharByCount = "+a.getCharCount('à')+" : "+a.getCharByCount(a.getCharCount('à')));//getCharByCount
		
	}

}
