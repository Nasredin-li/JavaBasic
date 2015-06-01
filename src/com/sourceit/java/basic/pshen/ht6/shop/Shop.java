package com.sourceit.java.basic.pshen.ht6.shop;

public class Shop {
	public String titleOfShop;
	public Seller seller;
	String listOfFoodstuff;
	public Shop(String titleOfShop){
		this.titleOfShop = titleOfShop;
		orderProduct(listOfFoodstuff);
		receiveProduct(listOfFoodstuff);
		this.seller = new Seller (titleOfShop);
	}
	public void orderProduct(String listOfFoodstuff){
		
	}
	public boolean receiveProduct(String listOfFoodstuff){
		return  (new Icecream("ванильное, ","в стаканчике")).title ==listOfFoodstuff;
	}
	public Foodstuff sellProduct(Icecream desire){
		return desire;
	}
	public void getProfit(){
		
	}
	
}
