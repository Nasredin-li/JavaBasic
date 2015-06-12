package com.sourceit.java.basic.pshen.lesson19.lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;

public class WGet {

	public static void main(String[] args) {
		String[] instruction = { "-JAVA CONSOLE BROWSER-",
				"Usage: some web address", "Example: http://google.com" };
		String[] userAction = { "Save page", "Display a title of a page",
				"Find some word", "list all url’s" };
		URL url = null;
		InputStream is = null;
		BufferedReader br = null;
		String line = null;
		if (args.length == 0) {
			printInstruction(instruction, 0);
			System.out.println("Enter some web address:");
			inputProcessing(userAction, url, is, br, line, getIn());
		} else {
			printInstruction(instruction, 0);
			inputProcessing(userAction, url, is, br, line, args[0]);
		}
	}

	private static void inputProcessing(String[] userAction, URL url,
			InputStream is, BufferedReader br, String line, String in) {
		ArrayList<String> pageStock = downloadPage(url, is, br, line, in);
		if (pageStock.size() == 0) {
			System.out.println("Try again");
			inputProcessing(userAction, url, is, br, line, getIn());
			return;
		}
		System.out.println("You can choose by number: ");
		printInstruction(userAction, 1);
		Integer choiceUser = null;
		try {
			choiceUser = Integer.parseInt(getIn());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		switch (choiceUser) {
		case 1:
			savePageToFile(pageStock);
			break;
		case 2:
			System.out.println(getTitle(pageStock));
			break;
		case 3:
			findWord(pageStock, null);
			break;
		case 4:
			getURLs(pageStock);
		default:
			break;
		}

	}

	private static void getURLs(ArrayList<String> pageStock) {
		findWord(pageStock, "https://");

	}

	private static void findWord(ArrayList<String> pageStock, String string) {
		String word=string;
		if (string == null) {
			System.out.println("Enter a word to find: ");
			word = getIn();
		}
		int i = 0;
		for (String g : pageStock) {
			if (g.contains(word)) {
				System.out.println(g);
				i++;
			}

		}
		System.out.print("<" + word);
		System.out.print("> is found in ");
		System.out.print(i);
		System.out.print(" strings.");

	}

	private static String getTitle(ArrayList<String> pageStock) {
		String title = null;
		for (String e : pageStock) {
			if (e.startsWith("<title>") || e.startsWith("<h1>")) {

				title = (e.substring(7).split("</title>"))[0];
			}
		}
		if (title == null) {
			return "Title not found";
		}
		return title;
		// TODO Auto-generated method stub

	}

	private static void savePageToFile(ArrayList<String> pageStock) {
		PrintWriter outputStream = null;
		String title = (getTitle(pageStock) + ".htm");
		try {
			outputStream = new PrintWriter(new FileWriter(getTitle(pageStock)
					+ ".htm"));
			for (String c : pageStock) {
				outputStream.println(c);
			}
			System.out.print("Page <");
			System.out.print(title);
			System.out.println("> is saved as file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}

		}

	}

	private static String getIn() {
		String in = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			in = br.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return in;
	}

	private static void printInstruction(String[] string, int j) {
		for (int i = 0; i < string.length; i++) {
			if (j == 1) {
				System.out.println((i + 1) + ") " + string[i]);
			} else {
				System.out.println(string[i]);
			}
		}
	}

	private static ArrayList<String> downloadPage(URL url, InputStream is,
			BufferedReader br, String line, String userUrl) {
		ArrayList<String> pageStock = new ArrayList<String>();
		try {
			url = new URL(userUrl);
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

			while ((line = br.readLine()) != null) {
				pageStock.add(line);
			}
			System.out.println("Your input: " + userUrl);
		} catch (Exception ex) {
			System.out.println("Smth. wrong " + ex);

		} finally {
			if (is != null) {

				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}
		return pageStock;
	}
}
