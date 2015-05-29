package com.sourceit.java.basic.pshen.ht15.Cards;

/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

public class Card {
	
	
    private final Rank rank;
    private final Suit suit;

   

    Card(Rank rank, Suit suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public static boolean isValidRank(int rank) {
        return ACE <= rank && rank <= KING;
    }

    public static boolean isValidSuit(int suit) {
        return DIAMONDS <= suit && suit <= SPADES;
    }

    public static String rankToString(int rank) {
        switch (rank) {
        case ACE:
            return "Ace";
        case DEUCE:
            return "Deuce";
        case THREE:
            return "Three";
        case FOUR:
            return "Four";
        case FIVE:
            return "Five";
        case SIX:
            return "Six";
        case SEVEN:
            return "Seven";
        case EIGHT:
            return "Eight";
        case NINE:
            return "Nine";
        case TEN:
            return "Ten";
        case JACK:
            return "Jack";
        case QUEEN:
            return "Queen";
        case KING:
            return "King";
        default:
            //Handle an illegal argument.  There are generally two
            //ways to handle invalid arguments, throwing an exception
            //(see the section on Handling Exceptions) or return null
            return null;
        }    
    }
    
    public static String suitToString(int suit) {
        switch (suit) {
        case DIAMONDS(1):
            break;
        case CLUBS:
        	break;
        case HEARTS:
        	break;
        case SPADES:
        	break;
        default:
            return null;
        }    
    }

	private static int DIAMONDS(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
enum Suit{
	DIAMONDS,
    CLUBS,
    HEARTS,
    SPADES;
}
enum Rank{
	ACE,
    DEUCE,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;
}

