package com.qa.main;

import java.util.ArrayList;

public class Dealer {
	
	ArrayList<Card> deckArr = drawDeck();
	//The Dealer class will always have a deck of card, started by initialised to a full deck of cards.
	public ArrayList<Card> drawDeck(){
		//Create function called drawDeck
		//This will create a brand new deck including all the cards
		ArrayList<Card> deck = new ArrayList<>();
		//Initialises an arrayList containing "Cards". called Deck.
		for (Card c: Card.values()) {
			deck.add(c);
		}
		//For each C (card) in the list of Cards add it to the arrayList called Deck.
		return deck;
	}

public Card drawCard() {

	int i = (int) (Math.random()*(deckArr.size())-1);
	//int I is the indexer, and it's a random number in the range of the cards left in the deck.
	Card drawnCard = deckArr.get(i);
	//Draw a card from the deck at index I
	deckArr.remove(i);
	//Remove the card draw from the deck at index I
	return drawnCard;
}
}
