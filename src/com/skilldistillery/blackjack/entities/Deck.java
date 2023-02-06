package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();

		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(rank, suit);
				deck.add(card);
			}
		}
	}

	public Card dealCard() {
		return deck.remove(0);

	}

	public int checkDeckSize() {
		return deck.size();

	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public List<Card> getDeck() {
		return deck;
	}

}
