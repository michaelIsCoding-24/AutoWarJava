package autoWar;

public class Card{
	
	// Card Fields
	int cardValue;
	String cardName;
	
	// Value getter
	public int getValue(){
		return cardValue;
	}
	// Value setter
	public void setValue(int value) {
		this.cardValue = value;
	}
	
	// Name getter
	public String getName() {
		return cardName;
	}
	// Name setter
	public void setName(String name) {
		this.cardName = name;
	}
	
	public Card(int value, String name) {
		this.cardName = name;
		this.cardValue = value;
	}
	
	public String describe() {
		return cardValue + " of " + cardName;
	}
}