package main;

public class Card {
//name field
	public static final int HEARTS = 0;
	public static final int DIAMONDS = 1;
	public static final int SPADES = 2;
	public static final int CLUBS = 3;
	
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;
	
	private int name;
	private int value;
	
	public Card (int name, int value) {
		this.setName(name);
		this.setValue(value);
		}
	
	
	//Setting parameters for cards to be between Ace and King
	private void setName(int cardName) {
		if (cardName >=0 && cardName <= 3) {
			this.name = cardName;
		} else {
			throw new IllegalArgumentException ("Card is not between 0 and 3.");
		}
	}
	private void setValue(int cardValue) {
		if (cardValue < 2 || cardValue > 14) {
			throw new IllegalArgumentException("Card is not between 2 and 14.");
			}
				this.value = cardValue;
			}
	
	public String toString() {
		String cardVal = "";
		if (value == ACE){
			cardVal += "Ace";
		}else if (value == KING) {
			cardVal += "King"; 
		}else if (value == QUEEN) {
			cardVal += "Queen";
		}else if (value == JACK) {
			cardVal += "Jack";
		}else if (value == 2) {
			cardVal += "2";
		}else if (value == 3) {
			cardVal += "3";
		}else if (value == 4) {
			cardVal += "4";
		}else if (value == 5) {
			cardVal += "5";
		}else if (value == 6) {
			cardVal += "6";
		}else if (value == 7) {
			cardVal += "7";
		}else if (value == 8) {
			cardVal += "8";
		}else if (value == 9) {
			cardVal += "9";
		}else if (value == 10) {
			cardVal += "10";
		}else {
			cardVal += value;
		}
		
		cardVal += " of ";
		
		if (name == HEARTS) {
			cardVal += "Hearts";
		}else if (name == DIAMONDS) {
			cardVal  += "Diamonds";
		}else if (name == SPADES) {
			cardVal += "Spades";
		}else if (name == CLUBS) {
			cardVal += "Clubs";
		}
		
		return cardVal;
	}
	//describe method
	public void describe() {
		System.out.println(this.toString());
		//System.out.println("name = " + name + "value =  " + value);
		//System.out.println(name);
		
	}
	//getters and setters for Card int name and int value.
		public int getName() {
			return name;
		}
		
		public int getValue() {
			return value;
		}
	}
	
	

