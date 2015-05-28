package com.sourceit.java.basic.pshen.ht15;

import java.io.*;
import java.util.ArrayList;

import com.sourceit.java.basic.pshen.ht11.Text;

public class StreamLines {
	public String path = "F:\\JAVA\\eclipse\\JavaBasic\\src\\com\\sourceit\\java\\basic\\pshen\\ht15\\";
	public String pathIn = (path + "Tararam.txt");
	public String pathOut = (path + "CopyTararam.txt");

	public static void main(String[] args) throws IOException {

		StreamLines y = new StreamLines();
		y.copyLine();
	}

	public void copyLine() throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(pathIn));
			outputStream = new PrintWriter(new FileWriter(pathOut));
			String c;
			StringBuilder tx = new StringBuilder();
			ArrayList<String> arr = new ArrayList<String>();

			
			while ((c = inputStream.readLine()) != null) {
				tx.append(c);
				arr.add(c);
			}

			Text text = new Text(tx.toString());
			outputStream.println("Text statistics: ");
			outputStream.println(" CharCount of 'a'------- "
					+ ((Integer) text.getCharCount('a')).toString() + " \n ");
			outputStream.println(" CharFrequency of 'a'--- "
					+ ((Integer) text.getCharFrequency('a')).toString());
			outputStream.println(" Words of text --------- " + text.words());
			outputStream.println(" LeastPopularCharCount-- "
					+ text.getLeastPopularCharCount());
			outputStream.println(" MostPopularCharCount-- "
					+ text.getMostPopularCharCount());
			outputStream.println(" CharByCount----------- "
					+ (text.getCharByCount(text.getCharCount('b'))));

			for (String e : arr) {
				outputStream.println(e);
			}

		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

		System.out.println(new File("CopyTararam.txt").getAbsolutePath()
				+ " created.");

	}
}
