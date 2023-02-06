package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();

		app.run();

	}

	private void run() {
		Dealer dealer = new Dealer();
		Player player = new Player();
		Scanner playerInput = new Scanner(System.in);

		System.out.print("Type \"yes\" to play Black Jack, \"no\" to exit: ");

		String word = playerInput.nextLine();
		if (word.equalsIgnoreCase("yes")) {
			dealer.shuffleDeck();
			dealer.dealCard(player);
			dealer.dealCard(dealer);
			dealer.dealCard(player);
			dealer.dealCard(dealer);
			System.out.println("Player's " + player.getPlayerHand().toString());
			System.out.println("Player's total hand value: " + player.getPlayerHand().getHandValue());

			System.out.println(
					"Dealer's hand has: " + dealer.getPlayerHand().getCards().get(1) + " and a card laying facedown");
			System.out.println("Dealer's total hand value: " + dealer.getPlayerHand().getCards().get(1).getValue());

			boolean running = true;
			do {

				if (player.getPlayerHand().getHandValue() == 21) {
					System.out.println("BlackJack: " + player.getPlayerHand().isBlackJack() + ", BLACK JACK! You Win!");
					running = false;
					break;
				}
				// ask player to hit or to stay their hand
				System.out.println("Would you like to Hit or Stand your hand?");
				String choice = playerInput.nextLine();

				switch (choice) {
				case "Hit":
				case "hit":
				case "HIT":

					dealer.dealCard(player);
					System.out.println("Player's " + player.getPlayerHand().toString());
					System.out.println("Player's total hand value: " + player.getPlayerHand().getHandValue());
					dealer.dealCard(dealer);
					System.out.println("Dealer's hand has: " + dealer.getPlayerHand().getCards().get(1).toString()
							+ " and a card laying facedown");
					if (player.getPlayerHand().getHandValue() > 21) {
						System.out.println(
								"Player busts: " + player.getPlayerHand().isBust() + ", Dealer Wins. Game over.");
						running = false;
					}

					break;
				case "Stand":
				case "stand":
				case "STAND":

					while (dealer.getPlayerHand().getHandValue() < 17) {
						System.out.println("Dealer's " + dealer.getPlayerHand().toString());
						System.out.println("Dealer's hand value: " + dealer.getPlayerHand().getHandValue());
						dealer.dealCard(dealer);
						System.out.println("Dealer's hand is less than 17...dealer draw's again. \nDealer's "
								+ dealer.getPlayerHand().toString());
						System.out
								.println("Revealed dealer hand value: " + dealer.getPlayerHand().getHandValue() + "\n");
					}
					System.out.println("Dealer's " + dealer.getPlayerHand().toString());
					System.out.println("Dealer's hand value: " + dealer.getPlayerHand().getHandValue());
					if (dealer.getPlayerHand().getHandValue() > player.getPlayerHand().getHandValue()
							&& dealer.getPlayerHand().getHandValue() <= 21) {
						System.out.println("Dealer wins!");
						running = false;
					}
					if (dealer.getPlayerHand().getHandValue() == 21) {
						System.out.println(
								"Player busts: " + player.getPlayerHand().isBust() + ", Dealer Win's. Game over.");
						running = false;
					}
					if (dealer.getPlayerHand().getHandValue() > 21) {
						System.out.println("Dealer busts: " + dealer.getPlayerHand().isBust() + ", You Win! ");
						running = false;
					}
					if (dealer.getPlayerHand().getHandValue() == player.getPlayerHand().getHandValue()
							&& dealer.getPlayerHand().getHandValue() < 21) {
						System.out.println("Push!");
						running = false;
					}
					if (player.getPlayerHand().getHandValue() > dealer.getPlayerHand().getHandValue()
							&& player.getPlayerHand().getHandValue() < 21) {
						System.out.println("Black Jack: " + player.getPlayerHand().isBlackJack() + ", You Win!");
						running = false;
					}
					break;
				default:
					System.out.println("That was not a valid option.");
					break;

				}

			} while (running);
			playerInput.close();

		} else if (word.equalsIgnoreCase("no")) {
			System.out.println("That's okay, maybe next time.");
		} else if (!word.equals("yes") || !word.equals("no")) {
			System.out.println("That was not a valid option, try again.");
		}
	}

}
