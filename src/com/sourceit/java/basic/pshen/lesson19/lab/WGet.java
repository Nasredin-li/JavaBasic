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
		String[] instruction = { "--JAVA CONSOLE BROWSER--",
				"Usage: some web address", "Example: http://google.com", "Exit program: enter < 5 >" };
		String[] userAction = { "Save page", "Display a title of a page",
				"Find some word", "list all url’s", "Enter new web adress","Exit program" };
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
/**help method for exit program in 
 * 
 */
	private static void end() {
		System.out.println("Exit");
		return;

	}

	private static void inputProcessing(String[] userAction, URL url,
			InputStream is, BufferedReader br, String line, String in) {
		if(in.equalsIgnoreCase("6")){
			end();
		}else{
		ArrayList<String> pageStock = downloadPage(url, is, br, line, in);
		if (pageStock.size() == 0) {
			System.out.println("Try again or enter < 6 > for exit");
			inputProcessing(userAction, url, is, br, line, getIn());
			return;
		}
		userAction(userAction, url, is, br, line, pageStock);
		}
	}

	private static void userAction(String[] userAction, URL url,
			InputStream is, BufferedReader br, String line,
			ArrayList<String> pageStock) {
		System.out.println("You can choose by number: ");
		printInstruction(userAction, 1);
		Integer choiceUser = null;
		try {
			choiceUser = Integer.parseInt(getIn());
		} catch (NumberFormatException e) {
			System.out.println("Please, check your input. You need enter a number of action. Example < 1 >");
			userAction(userAction, url, is, br, line, pageStock);
		}
		switch (choiceUser) {
		case 1:
			savePageToFile(pageStock);
			userAction(userAction, url, is, br, line, pageStock);
			break;
		case 2:
			System.out.println(getTitle(pageStock));
			userAction(userAction, url, is, br, line, pageStock);
			break;
		case 3:
			System.out.println("Enter a word to find: ");
			System.out.println(findWord(pageStock, null));
			userAction(userAction, url, is, br, line, pageStock);
			break;
		case 4:
			System.out.println(getURLs(pageStock));
			userAction(userAction, url, is, br, line, pageStock);
			break;
		case 5:
			System.out.println("Enter some web address:");
			inputProcessing(userAction, url, is, br, line, getIn());
			return;
		case 6:
			System.out.println("Exit");
			return;
		default:
			System.out.println("Please, check your input. You need enter a number of action. Example < 1 >");
			userAction(userAction, url, is, br, line, pageStock);
		}
	}

	private static ArrayList<String> getURLs(ArrayList<String> pageStock) {
		ArrayList<String> stock = new ArrayList<String>();
		for (String e : findWord(pageStock, "http://")) {
			String[] localVar = e.split("\"");
			for (String l : localVar) {
				if (l.startsWith("http://")) {
					stock.add(l);
				}
			}
		}
		return stock;
	}

	private static ArrayList<String> findWord(ArrayList<String> pageStock,
			String string) {
		String word = string;
		ArrayList<String> stock = new ArrayList<String>();
		if (string == null) {
			word = getIn();
		}
		int i = 0;
		for (String g : pageStock) {
			if (g.contains(word)) {
				stock.add(g);
				i++;
			}
		}
		if (string == null) {
			System.out.print("<" + word);
			System.out.print("> is found in ");
			System.out.print(i);
			System.out.print(" strings.");
		}
		return stock;

	}

	private static String getTitle(ArrayList<String> pageStock) {
		String title = null;
		for (String e : findWord(pageStock, "<title>")) {
			String[] localVar = e.split("<title>");
			for (String l : localVar) {
				if (l.contains("</title>")) {
					title = ((l.split("</title>"))[0]);
				}
			}
		}
		title.replace(" | ", " ");
		title.replace(".", " ");
		return title;
	}

	private static void savePageToFile(ArrayList<String> pageStock) {
		PrintWriter outputStream = null;
		String title = (getTitle(pageStock) + ".html");
		try {
			outputStream = new PrintWriter(new FileWriter(getTitle(pageStock)
					+ ".html"));
			for (String c : pageStock) {
				outputStream.println(c);
			}
			System.out.print("Page <");
			System.out.print(title);
			System.out.println("> is saved as file");
		} catch (IOException e) {
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
