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
			try {
				downloadPage(url, is, br, line, getUrl());
				printInstruction(userAction, 1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			downloadPage(url, is, br, line, args[0]);
			printInstruction(userAction, 1);
		}
	}
	private static String getUrl() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter some web address:");
		return br.readLine();
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
		} catch (Exception ex) {
			System.out.println("Smth. wrong " + ex);
		} finally {
			if (is != null) {
				System.out.println(pageStock.size());
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
