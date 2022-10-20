package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//Card field
	private List<Card> cards = new ArrayList<Card>();
//instantiating each suit (52/4 = 13, so the cards need to be less than or equal to 13)	
	public Deck () {
		for (int b = 0; b < 4; b++) {
			for (int j = 2; j <= 14; j++) {
				//non default constructor. Has non prescribed values for i and j.
				cards.add(new Card (b, j));

			}
		}
	}
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List <Card> cards) {
		this.cards = cards;
	}
//draw method
public Card draw() {
	if (cards.isEmpty()) {
		return null;
	}else {
		Card topCard = cards.get(0);
		cards.remove(0);
		return topCard;
	}
	}
//shuffle method. Needs to go in WarMain class
public void shuffle() {
	Collections.shuffle(cards);
}
}