package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand{
	
	
	
	@Override
	public int getHandValue() {
		int handValue = 0;
		for (Card card : cards) {
			handValue += card.getValue();
		}
		return handValue;
	}
	
	
	public boolean isBlackJack() {
		return true;
		
	}
	
	public boolean isBust() {
		return true;
		
	}

	




	
	
	
}
