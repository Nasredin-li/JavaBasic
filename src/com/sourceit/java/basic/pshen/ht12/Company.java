package com.sourceit.java.basic.pshen.ht12;

import java.util.*;

public class Company {

	public static void main(String[] args) {
		Company _WTI = new Company();
		ArrayList<String> names = new ArrayList<String>();
		_WTI.inputEmployerNames(names, 10);
		print(names, (int)(Math.random() * names.size()));
		System.out.println();
		
		
		ArrayList<String> namesForToy = new ArrayList<String>(new HashSet<String>(names));
		print(namesForToy);
		getNameForToy(namesForToy);
		
		ArrayList<String> mostPopularName = new ArrayList<String>();
		
		
		
		System.out.println();		
		print(names);
		System.out.println();
		print(namesForToy);
		

	}
	
	private static void getNameForToy(ArrayList<String> namesForToy) {
		System.out.println(namesForToy.remove((int)(Math.random() * namesForToy.size())));
		
	}

	/** An employer name, chosen at random
	 * 
	 * @param names
	 * @param i
	 */

	private static void print(ArrayList<String> names, int i) {
		System.out.println(names.get(i));
		
	}

	private static void print(Collection<String> names) {
		System.out.println(names.toString());
		
	}

	private void inputEmployerNames(ArrayList<String> names, int numberOfNames) {
		for(int i = 0; i< numberOfNames;i++){
			names.add(nameGenerator());
		}
		
	}

	private static String nameGenerator() {
		String[] namesString = {"Vova","Boris","Misha","Vladimir","Lida", "Leonid","Boris","Iosif","Andrey","Glafira","Marfa","Petia", "Sasha", "Katia","Vova","Boris","Misha","Vladimir","Lida", "Leonid","Boris","Iosif","Andrey","Glafira","Marfa","Petia", "Sasha", "Katia"};
		return namesString[(int)(Math.random() * namesString.length)];
	}

}
