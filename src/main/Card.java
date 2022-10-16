package main;

public class Card {

	public static final int Hearts = 0;
	public static final int Diamonds = 1;
	public static final int Spades = 2;
	public static final int Clubs = 3;
	
	public static final int Jack = 11;
	public static final int Queen = 12;
	public static final int King = 13;
	public static final int Ace = 14;
	
	
	public int getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	private int name;
	private int value;
	
	public Card (int name, int value) {
		this.setName(name);
		this.setValue(value);
	}
	
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
			}else {
				this.value = cardValue;
			}
	}
	public String toString() {
		String cardStr = "";
		if (value == Ace){
			cardStr += "Ace";
		}else if (value == King) {
			cardStr += "King"; 
		}else if (value == Queen) {
			cardStr += "Queen";
		}else if (value == Jack) {
			cardStr += "Jack";
		}else if (value == 2) {
			cardStr+= "Two";
		}else if (value == 3) {
			cardStr += "Three";
		}else if (value == 4) {
			cardStr += "Four";
		}else if (value == 5) {
			cardStr += "Five";
		}else if (value == 6) {
			cardStr += "Six";
		}else if (value == 7) {
			cardStr += "Seven";
		}else if (value == 8) {
			cardStr += "Eight";
		}else if (value == 9) {
			cardStr += "Nine";
		}else if (value == 10) {
			cardStr += "Ten";
		}else {
			cardStr += value;
		}
		
		cardStr += " of ";
		
		if (value == Hearts) {
			cardStr += "Hearts";
		}else if (value == Diamonds) {
			cardStr += "Diamonds";
		}else if (value == Spades) {
			cardStr += "Spades";
		}else {
			cardStr += "Hearts";
		}
		return cardStr;
	}
	public void describe() {
		System.out.println(this.toString());
		
	}
	
	}

