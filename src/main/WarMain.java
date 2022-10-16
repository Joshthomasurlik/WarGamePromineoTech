package main;

public class WarMain {
	
	public static void main (String[] args) {
		Deck allDeck = new Deck();
		allDeck.shuffle();
		
		Player player1 = new Player ("Josh");
		Player player2 = new Player ("Trish");
		
		for (int i = 1; i <= 26; i++) {
			player1.playerHand.add(allDeck.draw());
			player2.playerHand.add(allDeck.draw());
		}
		
		player1.describe();
		player2.describe();
		
		for(int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			}else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
			}else {
				System.out.println("Draw");
			}
		}
		if (player1.score > player2.score) {
			System.out.println();
			System.out.println(player1.name + " has a final score of: " + player1.score + "\n" );
			System.out.println(player2.name + " has a final score of: " + player2.score + "\n");
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
