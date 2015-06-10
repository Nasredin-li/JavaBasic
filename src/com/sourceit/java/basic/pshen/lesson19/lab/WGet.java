package com.sourceit.java.basic.pshen.lesson19.lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class WGet {

	public static void main(String[] args) {
		String[] instruction = { "-JAVA CONSOLE BROWSER-",
				"Usage: some web address", "      or -i",
				"Example: http://google.com" };
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
			inputProcessing(userAction, url, is, br, line, args[0]);
		}
	}
	private static void inputProcessing(String[] userAction, URL url,
			InputStream is, BufferedReader br, String line, String in) {
		downloadPage(url, is, br, line, in);
		System.out.println("You can choose by number: ");
		printInstruction(userAction, 1);
		Integer choiceUser = Integer.parseInt(getIn());
		switch (choiceUser) {
        case 1:  savePageToFile();
                 break;
        case 2:  getTitle();
                 break;
        case 3:  findWord();
                 break;
        case 4:  getURLs();
        default: 
                 break;
    }
		
	}
	private static void getURLs() {
		// TODO Auto-generated method stub
		
	}
	private static void findWord() {
		// TODO Auto-generated method stub
		
	}
	private static void getTitle() {
		// TODO Auto-generated method stub
		
	}
	private static void savePageToFile() {
		// TODO Auto-generated method stub
		
	}
	private static String getIn(){
		String in = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			in=br.readLine();
			
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

	private static void downloadPage(URL url, InputStream is,
			BufferedReader br, String line, String userUrl) {
		ArrayList<String> pageStock = new ArrayList<String>();
		try {
			url = new URL(userUrl);
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

			while ((line = br.readLine()) != null) {
				pageStock.add(line);
			}
			System.out.println("Your input: "+userUrl);
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
	}
}
