package com.sourceit.java.basic.pshen.ht12;

import java.util.*;
import java.util.Map.Entry;

public class Company {

	public static void main(String[] args) {
		Company _WTI = new Company();
		ArrayList<String> names = new ArrayList<String>();
		_WTI.inputEmployerNames(names, 20);
		print(names);
		System.out.print("Receive free toys ");
		print(names, (int) (Math.random() * names.size()));
		System.out.println();

		ArrayList<String> namesForToy = new ArrayList<String>(
				new HashSet<String>(names));
		System.out.print("Unique names ");
		print(namesForToy);
		System.out.print("Chose & remove ");
		getNameForToy(namesForToy);

		Map<String, Integer> nameByPopularity = new HashMap<String, Integer>();
		_WTI.inputNameByPopularity(nameByPopularity, names);
		System.out.print("Name & Popularity ");
		System.out.println(nameByPopularity);
		System.out.println();

		Queue employees = new ArrayDeque(names);
		System.out.print("Queue for tickets ");
		print(employees);
		System.out.print("Add: Glafira");
		employees.add("Glafira");
		System.out.print("Remove: first first name");
		employees.remove(employees.element());
		print(employees);
		

	}

	private void inputNameByPopularity(Map<String, Integer> nameByPopularity,
			ArrayList<String> names) {
		ArrayList<Integer> counts = new ArrayList<Integer>();
		HashMap<Integer, String> uniqueCount = new HashMap<Integer, String>();
		Map<String, Integer> name_Count = new HashMap<String, Integer>();
		Map<Integer, String> allName_Count = new LinkedHashMap<Integer, String>();
		for (String c : names) {
			int count = 0;
			for (String e : names) {
				if (e.equals(c)) {
					count++;

				}
			}
			nameByPopularity.put(c, count);

		}

	}

	private static void getNameForToy(ArrayList<String> namesForToy) {
		System.out
				.println(namesForToy.remove((int) (Math.random() * namesForToy
						.size())));

	}

	/**
	 * An employer name, chosen at random
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
		for (int i = 0; i < numberOfNames; i++) {
			names.add(nameGenerator());
		}

	}

	private static String nameGenerator() {
		String[] namesString = { "Vova", "Boris", "Misha", "Vladimir", "Lida",
				"Leonid", "Boris", "Iosif", "Andrey", "Glafira", "Marfa",
				"Petia", "Sasha", "Katia", "Vova", "Boris", "Misha",
				"Vladimir", "Lida", "Leonid", "Boris", "Iosif", "Andrey",
				"Glafira", "Marfa", "Petia", "Sasha", "Katia" };
		return namesString[(int) (Math.random() * namesString.length)];
	}

}
