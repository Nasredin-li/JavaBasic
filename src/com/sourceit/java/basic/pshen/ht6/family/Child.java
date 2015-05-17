package com.sourceit.java.basic.pshen.ht6.family;

public class Child extends Human implements scoolchild {
	String[] b = {"Петя", "Вася", "Коля", "Саша","Дима"};
	String[] g = {"Лена", "Таня", "Света", "Катя","Даша"};
	
	
	public Child(String name, String surname, int dateOfBorn) {
		super.name = name;
		super.surname = surname;
		super.dateOfBorn = dateOfBorn;
	}
	public String getName(){
		return name;
	} 
	@Override
	public void eat() {
		String[] eating ={"грызет", "ест", "смакует", "нямкает"};
		
		// TODO Auto-generated method stub
		
	}

	public boolean isHappy() {
		
		return false;
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
		
	}

	public void goToScool() {
		if(getAge()> 7 & getAge()<17){
		}
		
	}

}
