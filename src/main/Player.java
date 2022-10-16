package main;

import java.util.ArrayList;
import java.util.List;

public class Player {
List<Card> playerHand = new ArrayList<Card>();
int score;
String name;

public Player(String name) {
	this.score = 0;
	this.name = name;
}

public void describe() {
	for (Card card : playerHand) {
		card.describe();}
	}
public Card flip() {
	Card topCard = playerHand.get(0);
	playerHand.remove(0);
	return topCard;
}
public void draw(Deck deck) {
	Card card = deck.draw();
	playerHand.add(card);
}
public void incrementScore() {
	this.score++;
}
}
