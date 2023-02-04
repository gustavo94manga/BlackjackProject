package com.skilldistillery.blackjack.entities;

public class Player {
	protected BlackJackHand blackJackHand = new BlackJackHand();

	public void receivedCard(Card card) {
		blackJackHand.addCard(card);
	}

	public BlackJackHand getPlayerHand() {
		return blackJackHand;
	}

	public void setPlayerHand(BlackJackHand playerHand) {
		this.blackJackHand = playerHand;
	}
}
