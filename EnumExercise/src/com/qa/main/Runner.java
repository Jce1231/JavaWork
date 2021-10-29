package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		int userWin = 0;
		int dealWin = 0;
		for (int i = 0; i<15; i++) {
		Dealer d = new Dealer();
		d.drawDeck();
		User dealer = new User("Dealer");
		User player = new User("Jordan");
		
		player.giveCard(d.drawCard());
		player.giveCard(d.drawCard());
		dealer.giveCard(d.drawCard());
		dealer.giveCard(d.drawCard());
		while(player.getHandValue() <=16) {
			player.giveCard(d.drawCard());
		}
		while(dealer.getHandValue()<=17) {
			dealer.giveCard(d.drawCard());
		}

		System.out.println(player);
		System.out.println(dealer);
		if(player.getHandValue() >= 22 && dealer.getHandValue()>= 22) {
			System.out.println("Both Lose");
		}else if (player.getHandValue() >= 22) {
			System.out.println("You lost");
			dealWin++;
		}else if (dealer.getHandValue()>= 22) {
			System.out.println("Dealer Lost");
			userWin++;
		}else if(player.getHandValue()>dealer.getHandValue()) {
			System.out.println("You win");
			userWin++;
		}else {System.out.println("Dealer Win");
			dealWin++;
		}
		System.out.println("");
		}
		System.out.format("The amount of times you won is : %s, The dealer won %d times",userWin,dealWin);
	}
	
}
