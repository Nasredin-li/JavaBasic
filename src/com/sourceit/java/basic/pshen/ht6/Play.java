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
		Child ch1 = new Child("���� ","������ ", 2008);
		Child ch2 = new Child("���� ","������ ", 2006);
		Child ch3 = new Child("���� ","������ ", 2007);
		Child ch4 = new Child("��� ","������ ", 2006);
		Shop shop = new Shop("� ������");
		Icecream desireOfChild1 = ch1.desire((new Icecream("���������� ", "�� �������")), shop.seller);
		Icecream order1= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(desireOfChild1);
		
		String result1 = (ch1.name + ch1.surname + ch1.eat(order1));
		System.out.println(result1);

	}
	
}
