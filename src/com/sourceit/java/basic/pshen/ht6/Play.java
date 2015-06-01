package com.sourceit.java.basic.pshen.ht6;

import com.sourceit.java.basic.pshen.ht6.family.Child;
import com.sourceit.java.basic.pshen.ht6.family.Human;
import com.sourceit.java.basic.pshen.ht6.shop.Foodstuff;
import com.sourceit.java.basic.pshen.ht6.shop.Icecream;
import com.sourceit.java.basic.pshen.ht6.shop.Seller;
import com.sourceit.java.basic.pshen.ht6.shop.Shop;

public class Play {

	public static void main(String[] args) {
		Play play = new Play();
		Child ch1 = new Child("Вася ","Петров ", 2008);
		Child ch2 = new Child("Коля ","Ребров ", 2006);
		Child ch3 = new Child("Катя ","Литвин ", 2007);
		Child ch4 = new Child("Ира ","Варава ", 2006);
		Shop shop = new Shop("У бабуси");
		
		Icecream order1= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(ch1.desire("шоколадное мороженное ", "на палочке."));
		Icecream order2= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(ch2.desire("ванильное мороженное ", "в стаканчике."));
		Icecream order3= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(ch3.desire("крем-брюле ", "в брикете."));
		Icecream order4= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(ch4.desire("фруктовое мороженное ", "рожок."));
		
		play.print(ch1, order1);
		play.print(ch2, order2);
		play.print(ch3, order3);
		play.print(ch4, order4);
		

	}

	private void print(Child ch, Icecream order) {
		String result = (ch.name + ch.surname + ch.eat(order));
		System.out.println(result);
		
	}

	
}
