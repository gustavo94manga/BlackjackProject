package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Card {
	private Rank rank;
	private Suit suit;

	public Card() {
	}

	public Card(Rank rk, Suit st) {
		suit = st;
		rank = rk;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int getValue() {
		return rank.getValue();
	}

	@Override
	public String toString() {
		return "a " + rank + " of " + suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

}
