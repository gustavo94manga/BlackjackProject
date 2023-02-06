package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> cards = new ArrayList<>();
//	private Card handValue;

	public Hand() {

	}

	public void clear() {

	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		return "hand has: " + cards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

}
