package com.qa.main;

public enum Card {
	ACEOFSPADE(Suit.SPADES,Rank.ACE,1),
	TWOOFSPADE(Suit.SPADES,Rank.TWO,2),
	THREEOFSPADE(Suit.SPADES,Rank.THREE,3),
	FOUROFSPADE(Suit.SPADES,Rank.FOUR,4),
	FIVEOFSPADE(Suit.SPADES,Rank.FIVE,5),
	SIXOFSPADE(Suit.SPADES,Rank.SIX,6),
	SEVENOFSPADE(Suit.SPADES,Rank.SEVEN,7),
	EIGHTOFSPADE(Suit.SPADES,Rank.EIGHT,8),
	NINEOFSPADE(Suit.SPADES,Rank.NINE,9),
	TENOFSPADE(Suit.SPADES,Rank.TEN,10),
	JACKOFSPADE(Suit.SPADES,Rank.JACK,10),
	QUEENOFSPADE(Suit.SPADES,Rank.QUEEN,10),
	KINGOFSPADE(Suit.SPADES,Rank.KING,10),
	ACEOFHEART(Suit.HEARTS,Rank.ACE,1),
	TWOOFHEART(Suit.HEARTS,Rank.TWO,2),
	THREEOFHEART(Suit.HEARTS,Rank.THREE,3),
	FOUROFHEART(Suit.HEARTS,Rank.FOUR,4),
	FIVEOFHEART(Suit.HEARTS,Rank.FIVE,5),
	SIXOFHEART(Suit.HEARTS,Rank.SIX,6),
	SEVENOFHEART(Suit.HEARTS,Rank.SEVEN,7),
	EIGHTOFHEART(Suit.HEARTS,Rank.EIGHT,8),
	NINEOFHEART(Suit.HEARTS,Rank.NINE,9),
	TENOFHEART(Suit.HEARTS,Rank.TEN,10),
	JACKOFHEART(Suit.HEARTS,Rank.JACK,10),
	QUEENOFHEART(Suit.HEARTS,Rank.QUEEN,10),
	KINGOFHEART(Suit.HEARTS,Rank.KING,10),
	ACEOFCLUBS(Suit.CLUBS,Rank.ACE,1),
	TWOOFCLUBS(Suit.CLUBS,Rank.TWO,2),
	THREEOFCLUBS(Suit.CLUBS,Rank.THREE,3),
	FOUROFCLUBS(Suit.CLUBS,Rank.FOUR,4),
	FIVEOFCLUBS(Suit.CLUBS,Rank.FIVE,5),
	SIXOFCLUBS(Suit.CLUBS,Rank.SIX,6),
	SEVENOFCLUBS(Suit.CLUBS,Rank.SEVEN,7),
	EIGHTOFCLUBS(Suit.CLUBS,Rank.EIGHT,8),
	NINEOFCLUBS(Suit.CLUBS,Rank.NINE,9),
	TENOFCLUBS(Suit.CLUBS,Rank.TEN,10),
	JACKOFCLUBS(Suit.CLUBS,Rank.JACK,10),
	QUEENOFCLUBS(Suit.CLUBS,Rank.QUEEN,10),
	KINGOFCLUBS(Suit.CLUBS,Rank.KING,10),
	ACEOFDIAMOND(Suit.DIAMONDS,Rank.ACE,1),
	TWOOFDIAMOND(Suit.DIAMONDS,Rank.TWO,2),
	THREEOFDIAMOND(Suit.DIAMONDS,Rank.THREE,3),
	FOUROFDIAMOND(Suit.DIAMONDS,Rank.FOUR,4),
	FIVEOFDIAMOND(Suit.DIAMONDS,Rank.FIVE,5),
	SIXOFDIAMOND(Suit.DIAMONDS,Rank.SIX,6),
	SEVENOFDIAMOND(Suit.DIAMONDS,Rank.SEVEN,7),
	EIGHTOFDIAMOND(Suit.DIAMONDS,Rank.EIGHT,8),
	NINEOFDIAMOND(Suit.DIAMONDS,Rank.NINE,9),
	TENOFDIAMOND(Suit.DIAMONDS,Rank.TEN,10),
	JACKOFDIAMOND(Suit.DIAMONDS,Rank.JACK,10),
	QUEENOFDIAMOND(Suit.DIAMONDS,Rank.QUEEN,10),
	KINGOFDIAMOND(Suit.DIAMONDS,Rank.KING,10);



public final Rank rank;

public final Suit suit;

public final int cardValue;
Card( Suit suit, Rank rank, int cardValue) {
	this.rank = rank;
	this.suit = suit;
	this.cardValue = cardValue;
}

}