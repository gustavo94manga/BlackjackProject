package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand{
	
	
	
	@Override
	public int getHandValue() {
		int handValue = 0;
		//     7 clubs 
		//     2 spades
		//     total = 7
		//     total + 2 = 9
		//     
		for (Card card : cards) {
			handValue += card.getValue();
		}
		return handValue;
	}
	
	
	public boolean isBlackJack() {
		return false;
		
	}
	
	public boolean isBust() {
		return false;
		
	}

	




	
	
	
}
