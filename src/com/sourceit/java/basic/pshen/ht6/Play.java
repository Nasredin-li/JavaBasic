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
		
		Icecream order1= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(ch1.desire("���������� ���������� ", "�� �������."));
		Icecream order2= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(ch2.desire("��������� ���������� ", "� ����������."));
		Icecream order3= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(ch3.desire("����-����� ", "� �������."));
		Icecream order4= (Icecream) (shop.seller.workingInShop(shop)).sellProduct(ch4.desire("��������� ���������� ", "�����."));
		
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
