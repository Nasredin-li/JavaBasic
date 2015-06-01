package com.sourceit.java.basic.pshen.ht15.Cards;


public class Card {
    private final Rank rank;
    private final Suits suit;


    public Card(Rank rank, Suits suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public Suits getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public static boolean isValidRank(Rank rank) {
        return rank instanceof Rank;
    }

    public static boolean isValidSuit(Suits suit) {
        return suit instanceof Suits;
    }

    public static String rankToString(Rank rank) {
        switch (rank) {
        case ACE:
        	return rank.name();
        case DEUCE:
        	return rank.name();
        case THREE:
        	return rank.name();
        case FOUR:
        	return rank.name();
        case FIVE:
        	return rank.name();
        case SIX:
        	return rank.name();
        case SEVEN:
        	return rank.name();
        case EIGHT:
        	return rank.name();
        case NINE:
        	return rank.name();
        case TEN:
        	return rank.name();
        case JACK:
        	return rank.name();
        case QUEEN:
        	return rank.name();
        case KING:
        	return rank.name();
        default:
            //Handle an illegal argument.  There are generally two
            //ways to handle invalid arguments, throwing an exception
            //(see the section on Handling Exceptions) or return null
            return null;
        }
		
    }
    
    public static String suitToString(Suits suit) {
        switch (suit) {
        case DIAMONDS:
        	return suit.name();
        case CLUBS:
        	return suit.name();
        case HEARTS:
        	return suit.name();
        case SPADES:
        	return suit.name();
        default:
            return null;
        }    
    }
}

