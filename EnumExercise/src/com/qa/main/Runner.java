package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		Dealer d = new Dealer();
		User dealer = new User("Dealer");
		User player = new User("Jordan");
		
		player.giveCard(d.drawCard());
		player.giveCard(d.drawCard());
		dealer.giveCard(d.drawCard());
		dealer.giveCard(d.drawCard());
		player.giveCard(d.drawCard());
		dealer.giveCard(d.drawCard());

		System.out.println(player);
		System.out.println(dealer);
		
		
	}
	
}
