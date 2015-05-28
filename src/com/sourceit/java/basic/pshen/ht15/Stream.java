package com.sourceit.java.basic.pshen.ht15;

import java.io.*;

import com.sourceit.java.basic.pshen.ht11.Text;

public class Stream {

	public static void main(String[] args) throws IOException {

		
		FileReader inputStream = null;
        FileWriter outputStream = null;
		try {
			inputStream = new FileReader(
					"F:\\JAVA\\eclipse\\JavaBasic\\src\\com\\sourceit\\java\\basic\\pshen\\ht15\\Tararam.txt");
			outputStream = new FileWriter(
					"F:\\JAVA\\eclipse\\JavaBasic\\src\\com\\sourceit\\java\\basic\\pshen\\ht15\\CopyTararam.txt");
			int c;
			StringBuilder tx = new StringBuilder();
			
			
			while ((c = inputStream.read()) != -1) {
				//outputStream.write(c);
				char b = (char) c;
				tx.append(b);
			}
			
			//tx.append(c);
			Text text = new Text(tx.toString());
			//System.out.println(text.getText());
			outputStream.write(" CharCount of 'a'-- "+((Integer)text.getCharCount('a')).toString()+" \n ");
			//System.out.println(text.getCharCount('a'));
			outputStream.write(" CharFrequency of 'a'-- "+((Integer)text.getCharFrequency('a')).toString());
			outputStream.write(" LeastPopularCharCount-- "+text.getLeastPopularCharCount());
			outputStream.write(" MostPopularCharCount-- "+text.getMostPopularCharCount());
			outputStream.write(" CharByCount-- "+(text.getCharByCount(text.getCharCount('b'))));
			outputStream.write("   "+text.getText());
			
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
