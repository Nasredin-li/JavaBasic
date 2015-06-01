package com.sourceit.java.basic.pshen.ht15.Cards;

public abstract class TestCards {

	public static void main(String[] args) {
		Card one = new Card(Rank.FIVE, Suits.HEARTS);
		Card two = new Card(Rank.DEUCE, Suits.DIAMONDS);
		Card three = new Card(Rank.QUEEN, Suits.SPADES);
		
		System.out.println(one.getRank());
		System.out.println(one.getSuit());
		System.out.println(Card.rankToString(two.getRank()));
		System.out.println(one.suitToString(three.getSuit()));
		
	}

}
