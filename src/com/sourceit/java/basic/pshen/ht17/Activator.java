package com.sourceit.java.basic.pshen.ht17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.sourceit.java.basic.pshen.ht6.Play;
import com.sourceit.java.basic.pshen.ht7.Exer;
import com.sourceit.java.basic.pshen.ht8.Launcher2;
import com.sourceit.java.basic.pshen.ht10.Scenario;
import com.sourceit.java.basic.pshen.ht13.Company;
import com.sourceit.java.basic.pshen.ht14.MyExeption;
import com.sourceit.java.basic.pshen.ht15.StreamLines;


public class Activator {

	public static void main(String[] args) throws IOException {

		System.out
				.println("Enter a digit as string number for run the java aplication");
		System.out.println("1 -- <Icecream><HT6>");
		System.out.println("2 -- <Array><HT7>");
		System.out.println("3 -- <Employers><HT8>");
		System.out.println("4 -- <Bank><HT10>");
		System.out.println("5 -- <Company><HT13>");
		System.out.println("6 -- <Exeption><HT14>");
		System.out.println("7 -- <Stream>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter String");
		//String s = br.readLine();
        
        //System.out.println("Received a string: " + s);
        
        System.out.println("Enter Integer:");
        try{
            int i = Integer.parseInt(br.readLine());
            run(i, args);
            //System.out.println("Received an integer: " + i);
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        
		/*
		 * com.sourceit.java.basic.pshen.ht6.Play.main(args);
		 * com.sourceit.java.basic.pshen.ht7.Exer.main(args);
		 * com.sourceit.java.basic.pshen.ht8.Launcher2.main(args);
		 * com.sourceit.java.basic.pshen.ht10.Scenario.main(args);
		 * com.sourceit.java.basic.pshen.ht13.Company.main(args);
		 * com.sourceit.java.basic.pshen.ht14.MyExeption.main(args); try {
		 * com.sourceit.java.basic.pshen.ht15.StreamLines.main(args); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 */

	}

	static void run(int i, String[] args) {
		switch(i) {
	    case 1: 
	    	com.sourceit.java.basic.pshen.ht6.Play.main(args);;
			break;
		case 2: 
			com.sourceit.java.basic.pshen.ht7.Exer.main(args);
			break;
		case 3: 
			com.sourceit.java.basic.pshen.ht8.Launcher2.main(args);
			break;
		case 4: 
			com.sourceit.java.basic.pshen.ht10.Scenario.main(args);
			break;
		case 5: 
			com.sourceit.java.basic.pshen.ht13.Company.main(args);
			break;
		case 6: 
			com.sourceit.java.basic.pshen.ht14.MyExeption.main(args);
			break;
		case 7: 
			try {
				com.sourceit.java.basic.pshen.ht15.StreamLines.main(args);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default: 
		    
		    break;
	}
	}

}
