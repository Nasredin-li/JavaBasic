package com.sourceit.java.basic.pshen.ht6.family;

import com.sourceit.java.basic.pshen.ht6.shop.Foodstuff;
import com.sourceit.java.basic.pshen.ht6.shop.Icecream;

public class Child extends Human implements scoolchild {
	
	
	
	public Child(String name, String surname, int dateOfBorn) {
		super.name = name;
		super.surname = surname;
		super.dateOfBorn = dateOfBorn;
	}
	public String getName(){
		return name;
	} 
	@Override
	public String eat(Foodstuff something) {
		String[] eating ={"грызет ", "ест ", "смакует ", "нямкает "};
		int i = (int)(Math.random()*(eating.length-1));
		return (eating[i] + ((Icecream)something).taste + ((Icecream)something).form );
	}
	
	public Icecream desire(Foodstuff something, Human somebody){
		return new Icecream(((Icecream)something).taste, ((Icecream)something).form);
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
