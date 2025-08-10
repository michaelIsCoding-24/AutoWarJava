package autoWar;

import java.util.ArrayList;
import java.util.List;

public class Player{
	
	// Player's hand
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	StringBuilder name = new StringBuilder();
	
	public void describe() {
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score += 1;
	}
	
}