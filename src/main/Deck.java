package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();
	
	public Deck () {
		for (int i = 0; i <= 3; i++) {
			for (int j = 2; j <= 14; j++) {
				cards.add(new Card (i, j));

			}
		}
	}
	public List<Card> getCards() {
		return cards;
	}

public Card draw() {
	if (cards.isEmpty()) {
		return null;
	}else {
		Card topCard = cards.get(0);
		cards.remove(0);
		return topCard;
	}
	}
public void shuffle() {
	Collections.shuffle(cards);
}
}