package com.sourceit.java.basic.pshen.lesson19.lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WGet {

	public static void main(String[] args) {
		String[] instruction={"-JAVA CONSOLE BROWSER-","Usage: some web address\n","      or -i\n","Example: http://google.com"};
		String[] userAction = { "Save page", "Display a title of a page",
				"Find some word", "list all url’s" };
		URL url;
		InputStream is = null;
		BufferedReader br;
		String line;
		if (args.length == 0) {
			printInstruction(instruction);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			if(in.toString().startsWith("http:/")){
				printInstruction(userAction);
			}
		}

		

	}
	

	private static void printInstruction(String[] string) {
		for(int i = 0; i< string.length; i++){
			System.out.println((i+1)+") "+string[i]);
		

	}}
}
