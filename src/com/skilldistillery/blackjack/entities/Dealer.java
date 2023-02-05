package com.skilldistillery.blackjack.entities;

public class Dealer extends Player{
	private Deck deck = new Deck();
	
	public void shuffleDeck() {
		deck.shuffle();
	}
	
	public void dealCard(Player player) {
		Card dealCard = deck.dealCard();
		player.receivedCard(dealCard);
		
	}
	
	public void initialCards(Player player) {
		for(int i = 0; i < 2; i++) {
			Card dealCard = deck.dealCard();
			player.receivedCard(dealCard);
		}
	}
	
	public void showFirstCard() {
		System.out.println(blackJackHand.getCards().get(0));
			
//		System.out.println("Dealer's hand has: " + blackJackHand.getCards().get(1));
//		System.out.println("Dealer's total hand value: " + blackJackHand.getCards().get(1).getValue());
	}
	public void dealersNextCard() {
		for (int i = 1; i < 52; i ++) {
			
		}
	}
	

}
