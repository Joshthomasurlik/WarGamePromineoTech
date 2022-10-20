package main;

import java.util.ArrayList;
import java.util.List;
//player hand field. Needs an int score and a String name
public class Player {
List<Card> playerHand = new ArrayList<Card>();
int score;
String name;
//player score field
public Player(String name) {
	this.score = 0;
	this.name = name;
}
//describe method. Has to go in card method as well
public void describe() {
	System.out.println(name + " has: ");
	for (Card card : playerHand) {
		card.describe();
	}
	System.out.println("-----------------");
	}
//flip method. Contains player hand and need to return top card of the hand. 
public Card flip() {
	Card topCard = playerHand.get(0);
	playerHand.remove(0);
	return topCard;
}
//draw method. Contains the deck and player hand.
public void draw(Deck deck) {
	Card card = deck.draw();
	playerHand.add(card);
}


//increment score method adds 1 to the players score field
public void incrementScore() {
	this.score++;
}
}
//constructors are special methods used to initialize objects. IE: 