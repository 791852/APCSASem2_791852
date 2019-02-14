/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("ten", "spades", 10); //new cards to test the methods
		Card card2 = new Card("eight", "clubs", 8);
		Card card3 = new Card("ace", "hearts", 1);
		Card card4 = new Card("jack", "hearts", 11);
		System.out.println("card1 suit = " + card1.suit()); //testing all the methods
		System.out.println("card2 rank = " + card2.rank());
		System.out.println("card3 point value = " + card3.pointValue());
		System.out.println(card4.toString());
		System.out.println(card1.matches(card2)); //seing if different cards match in suit, rank, or pointvalue
		System.out.println(card3.matches(card4));
	}
}
