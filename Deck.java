package autoWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
	
	// Making the deck
	// List of cards
	List<Card> cards = new ArrayList<Card>();
	
	// the 4 card suits as a string
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};{
		
	// iterates through each suit, 2-14
	for(String suit : suits) {
		for(int i = 2; i <= 14; i++) {
			cards.add(new Card(i, suit));
		}
	}
	}
	
	public void shuffleDeck(){
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card topCard = cards.get(0);
		cards.remove(0);
		return topCard;
	}
}