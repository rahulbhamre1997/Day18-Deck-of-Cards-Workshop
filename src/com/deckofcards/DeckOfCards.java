package com.deckofcards;

import java.util.ArrayList;

public class DeckOfCards {
	 public ArrayList<String> cardsDeck = new ArrayList<>();

	    public void welcome(){
	        System.out.println("Welcome to deck of cards");
	    }
	    public void deckOfCards(){
	        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
	        int numOfCards = suits.length * ranks.length;
	        System.out.println("\nNumber of cards in the deck:" + numOfCards);
	        for (int i = 0; i < ranks.length; i++) {
	            for (int j = 0; j < suits.length; j++) {
	                cardsDeck.add(ranks[i] + "--->" + suits[j]);
	            }
	        }
	        toDisplay(cardsDeck);
	    }

	    public static void toDisplay(ArrayList<String> cardsDeck) {
	        System.out.println("\nCards in Deck:");
	        for (String element : cardsDeck) {
	            System.out.println(element);
	        }
	        System.out.println();
	    }
}
