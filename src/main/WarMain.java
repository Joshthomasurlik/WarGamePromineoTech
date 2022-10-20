package main;

public class WarMain {
	//shuffle method to shuffle the entire deck
	public static void main (String[] args) {
		//default constructor. If 
		Deck completeDeck = new Deck();
		completeDeck.shuffle();
		//create 2 players 
		Player player1 = new Player ("Josh");
		Player player2 = new Player ("Trish");
		//iteration of the deck. Split the deck in half
		for (int i = 1; i <= 26; i++) {
			player1.playerHand.add(completeDeck.draw());
			player2.playerHand.add(completeDeck.draw());
		}
		//Using the Card describe() method when each card 
		//is flipped illustrates the game play.
		
		player1.describe();
		player2.describe();
		//iteration of the draw method
		for(int j = 1; j<= 26; j++) {
			
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			//increment score method here
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			}else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
			}else {
				System.out.println("Draw");
			}
		}
		//sysout with player scores and results. At the end of the game: print the final score of each player and the winner’s name or 
		//“Draw” if the result is a tie.
		if (player1.score > player2.score) {
			System.out.println();
			System.out.println(player1.name + " has a final score of: " + player1.score);
			System.out.println(player2.name + " has a final score of: " + player2.score);
			System.out.println(player1.name + " Wins!");
		}else if (player2.score > player1.score) {
			System.out.println(player1.name + " has a final score of: " + player1.score);
			System.out.println(player2.name + " has a final score of: " + player2.score);
			System.out.println(player2.name + " Wins!");
		}else {
			System.out.println(player1.name + " has a final score of: " + player1.score);
			System.out.println(player2.name + " has a final score of: " + player2.score);
			System.out.println(" It's a draw!");
		}
	}

}
