package autoWar;

public class App {
	public static void main(String[] args) {
		
		
		// New Deck
		Deck deck = new Deck();
		
		// 2 players
		Player player1 = new Player();
		Player player2 = new Player();
		
		// Shuffle the deck
		deck.shuffleDeck();
		
		// Deals out cards to each player
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		// for loop that iterates through each player's card
		for (int i = 0; i < 26; i++) {
			
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			// store each Player's card value in a variable
			int player1CardValue = player1Card.cardValue;
			int player2CardValue = player2Card.cardValue;
			
			// Prints out round number & each card played
			System.out.println("ROUND " + (i + 1));
			System.out.println(player1Card.describe() + " VERSUS " + player2Card.describe());
			
			// determines who gets the score
			if(player1CardValue > player2CardValue) {
				System.out.println("Player 1 scored!");
				player1.incrementScore();
			} else if(player2CardValue > player1CardValue) {
				System.out.println("Player 2 scored!");
				player2.incrementScore();
			} else {
				System.out.println("No point was rewarded.");
			}
			
			// prints out current score
			System.out.println("CURRENT SCORE: " + player1.score + " - " + player2.score);
			System.out.println();
		}
		
		// prints out the winner!
		System.out.println();
		System.out.println("FINAL");
		System.out.println("PLAYER 1:");
		System.out.println(player1.score);
		System.out.println("PLAYER 2:");
		System.out.println(player2.score);

		if (player1.score > player2.score) {
			System.out.println("Player 1 wins!");
			
		} else {
			System.out.println("Player 2 wins!");
		}

	
	
	
	
	
	
	}
}


