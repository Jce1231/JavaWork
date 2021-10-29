package com.qa.main;

import java.util.ArrayList;

public class User {
	private ArrayList<Card> curCards = new ArrayList<>();
	private String name;
	private int handValue;
	public User(String name) {
		this.name = name;
	}
	public void generateHandValue() {
		this.handValue = 0;
		int nextCount = 0;
		for (Card c : curCards) {
			if (c.rank == Rank.ACE) {
				nextCount++;
				continue;
					
				}else {
					this.handValue += c.cardValue;
				}
			}
		while(nextCount != 0) {
			if (this.handValue + 11 <= 21) {
				this.handValue += 11;
			}else {
				this.handValue += 1;
				}
			nextCount--;
		}
		}

	public int getHandValue() {
		return handValue;
	}
	public void giveCard(Card c) {
		this.curCards.add(c);
		generateHandValue();
	}
	@Override
	public String toString() {
		return name+" [curCards=" + curCards + ", handValue=" + handValue + "]";
	}
	
}
