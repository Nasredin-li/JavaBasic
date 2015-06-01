package com.sourceit.java.basic.pshen.ht6.shop;

import com.sourceit.java.basic.pshen.ht6.family.Adult;

public class Seller extends Adult{
	String placeOfWork;
	
	public Seller(String titleOfShop) {
		super();
		this.placeOfWork = titleOfShop;
	}

	public Shop workingInShop(Shop shop){
		return shop;
		
	}
	

}
