package com.sourceit.java.basic.pshen.ht8;

import com.sourceit.java.basic.pshen.ht8.employer.Developer;
import com.sourceit.java.basic.pshen.ht8.employer.Employer;
import com.sourceit.java.basic.pshen.ht8.employer.Lawyer;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		String[] name = {"Vova","Boris","Misha","Vladimir","Lida", "Leonid","Boris","Iosif","Andrey","Glafira","Marfa","Petia", "Sasha", "Katia","Vova","Boris","Misha","Vladimir","Lida", "Leonid","Boris","Iosif","Andrey","Glafira","Marfa","Petia", "Sasha", "Katia"};
	
		Lawyer[] arr = new Lawyer[10];
		int iLaw = 0;
		int[] forHour = {10, 30, 15, 19, 30, 19, 10, 15, 15,16};
		for(; iLaw<arr.length; iLaw++){
			arr[iLaw] = new Lawyer(name[iLaw],(iLaw+1));
			arr[iLaw].getMiddleMoney(forHour[iLaw]);
			}
		Developer[] dev =new Developer[10];
		int[] fixSal = {3000, 5000, 5000, 4235, 4657, 4235, 3689,4000, 2300, 3200};
		int iDev = 0;
		for(; iDev<dev.length; iDev++){
			dev[iDev] = new Developer(name[iDev+iLaw],(iDev+iLaw+1));
			dev[iDev].getMiddleMoney(fixSal[iDev]);
			}
		
		int x = arr.length+dev.length;
		Employer[] top = new Employer[x];
		int z = 0;
		for(int a = 0; a<arr.length;a++, z++){
			top[z] = arr[a];
		}
		
		for(int b = 0; b<dev.length;b++,z++){
			top[z] = dev[b];
		}
		
		int topLength = top.length;
		int printStart = 0;
		//launcher.print(top, topLength, printStart);// Array before sorting
		launcher.sortInt(top, topLength);
		String fields ="all";
		launcher.print(top, topLength, printStart, fields);
		System.out.println();
		topLength =5;
		fields = "name";
		launcher.print(top, topLength, printStart, fields);
		System.out.println();
		printStart = top.length-3;
		fields = "ID";
		launcher.print(top, top.length, printStart, fields);
		
	}
	public void print(Employer[] top, int print, int printStart, String fields){
		for(int p  = printStart; p < print; p++){
			if(fields == "all"){System.out.println(top[p].empIndex + "- ID,  " + top[p].name + " - name, sal -   " + top[p].middleMoney);}// + " " + top[p].getClass());
			if(fields == "name"){System.out.println(top[p].name + " - name");}
			if(fields == "ID"){System.out.println(top[p].empIndex + "- ID");}
		}
	}
	public void sortABC(Employer[] top, int Index1, int Index2){
		//System.out.println(top[Index1].name.compareTo(top[Index2].name));
		if((top[Index1].name.compareTo(top[Index2].name))<0){
			//System.out.println(top[Index1].name.compareTo(top[Index2].name));
			Employer w = top[Index2];
			top[Index2] = top[Index1];
			top[Index1] = w;
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
