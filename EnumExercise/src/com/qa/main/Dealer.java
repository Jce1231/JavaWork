package com.qa.main;

import java.util.ArrayList;

public class Dealer {
	
	ArrayList<Card> deckArr = drawDeck();
	public ArrayList<Card> drawDeck(){
		ArrayList<Card> deck = new ArrayList<>();
		for (Card c: Card.values()) {
			deck.add(c);
		}
		return deck;
	}

public Card drawCard() {

	int i = (int) (Math.random()*(deckArr.size())-1);
	Card drawnCard = deckArr.get(i);
	deckArr.remove(i);
	return drawnCard;
}
}
