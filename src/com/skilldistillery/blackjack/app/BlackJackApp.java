package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();

		app.run();
		
		
		System.out.println("Hello World");

	}


	private void run() {
		Dealer dealer = new Dealer();
		Player player = new Player();
		Scanner playerInput = new Scanner(System.in);
//		String playCards = playerInput.nextLine();
//		System.out.println(theDeck.getDeck().size());
//		Deck thePlayer = new Deck();
//		Deck theDealer = new Deck();

		System.out.println("Let's Play some Black Jack!!!");
		dealer.shuffleDeck();
		dealer.dealCard(player);
		dealer.dealCard(dealer);
		dealer.dealCard(player);
		dealer.dealCard(dealer);
		System.out.println("Player's " + player.getPlayerHand().toString());
		System.out.println("Player's total hand value: " + player.getPlayerHand().getHandValue());
		dealer.showOneCard();
//		int startingCards = 2;
		boolean running = true;
			do {
				
				
				//Need to show player how many cards he has in hand
				
				
				//ask player to hit or to stay their hand
				System.out.println("Would you like to Hit or Stay your hand?");
				String choice = playerInput.nextLine();
				
				switch(choice) {
				case "Hit":
				case "hit":
				case "HIT":
					dealer.dealCard(player);
					System.out.println("Player's " + player.getPlayerHand().toString());
//					hand.getHandValue();
//					thePlayer.dealCard();
//					if(thePlayer != null) {
//					System.out.println(hand.getHandValue());
//					}
					break;
				case "Stay":
				case "stay":
				case "STAY":
//					hand.getHandValue();
//					if(hand.getHandValue() > hand.getHandValue()) {
//						System.out.println("Dealer wins this round.");
//					}
//					else if(hand.getHandValue() == hand.getHandValue()) {
//						System.out.println("You won this round.");
//					}
//					else if(hand.getHandValue() < hand.getHandValue()) {
//						System.out.println("You're on a fire, you won this round.");
//					}
//					break;
				}

			} while (running);
			playerInput.close();

	}

}
