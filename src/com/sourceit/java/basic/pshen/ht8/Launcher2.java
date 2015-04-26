package com.sourceit.java.basic.pshen.ht8;

import com.sourceit.java.basic.pshen.ht8.employer.Developer;
import com.sourceit.java.basic.pshen.ht8.employer.Employer;
import com.sourceit.java.basic.pshen.ht8.employer.Lawyer;

public class Launcher2 {

	/**
	 * Service Pack 2 ))) Without Lawyer Array & Developer Array
	 */
	public static void main(String[] args) {
		Launcher2 launcher = new Launcher2();
		String[] name = {"Vova","Boris","Misha","Vladimir","Lida", "Leonid","Boris","Iosif","Andrey","Glafira","Marfa","Petia", "Sasha", "Katia","Vova","Boris","Misha","Vladimir","Lida", "Leonid","Boris","Iosif","Andrey","Glafira","Marfa","Petia", "Sasha", "Katia"};
		Employer[] bik = new Employer[20];
		int[] forHour = {10, 30, 15, 19, 30, 19, 10, 15, 15,16};
		int[] fixSal = {3000, 5000, 5000, 4235, 4657, 4235, 3689, 4000, 2300, 3200};
		launcher.inputing(bik, name, forHour, fixSal);
		int topLength = bik.length;
		int printStart = 0;
		//launcher.print(top, topLength, printStart);// Array before sorting
		launcher.sortInt(bik, topLength);
		String fields ="all";
		launcher.print(bik, topLength, printStart, fields);
		System.out.println();
		topLength =5;
		fields = "name";
		launcher.print(bik, topLength, printStart, fields);
		System.out.println();
		printStart = bik.length-3;
		fields = "ID";
		launcher.print(bik, bik.length, printStart, fields);
		
	}
	public void print(Employer[] top, int print, int printStart, String fields){
		for(int p  = printStart; p < print; p++){
			if(fields == "all"){System.out.println(top[p].empIndex + "- ID,  " + top[p].name + " - name, sal -   " + top[p].middleMoney);}// + " " + top[p].getClass());
			if(fields == "name"){System.out.println(top[p].name + " - name");}
			if(fields == "ID"){System.out.println(top[p].empIndex + "- ID");}
		}
	}
	public void sortABC(Employer[] top, int Index1, int Index2){
		if((top[Index1].name.compareTo(top[Index2].name))<0){
			Employer w = top[Index2];
			top[Index2] = top[Index1];
			top[Index1] = w;
		}
	}
	public void inputing(Employer[] bik, String[] name, int[] forHour, int[] fixSal){
		int iLaw = 0;
		for(; iLaw<(bik.length/2); iLaw++){
			bik[iLaw] = new Lawyer(name[iLaw],(iLaw+1));
			bik[iLaw].getMiddleMoney(forHour[iLaw]);
			}
		for(int iDev = 0; iDev<(bik.length/2); iDev++){
			bik[iDev+iLaw] = new Developer(name[iDev+iLaw],(iDev+iLaw+1));
			bik[iDev+iLaw].getMiddleMoney(fixSal[iDev]);
			}
	}
	public void sortInt(Employer[] top, int topLength){
		for (int d = 0; d< topLength; d++){
			for (int c = 0; c< topLength; c++){
				if(top[d].middleMoney>top[c].middleMoney){
					Employer y = top[c];
					top[c] = top[d];
					top[d] = y;
				}
				if(top[d].middleMoney==top[c].middleMoney){
					sortABC(top, d, c);
				}
			}
		}
		
	}
}
