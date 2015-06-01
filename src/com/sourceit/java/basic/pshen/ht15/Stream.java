package com.sourceit.java.basic.pshen.ht15;

import java.io.*;

import com.sourceit.java.basic.pshen.ht11.Text;

public class Stream {

	public static void main(String[] args) throws IOException {

		
		FileReader inputStream = null;
        FileWriter outputStream = null;
		try {
			inputStream = new FileReader(
					args[0]);
			outputStream = new FileWriter(
					args[1]);
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
			

		} catch (ArrayIndexOutOfBoundsException p){
			System.out.println("Enter a path: ");
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

		
	}

}
