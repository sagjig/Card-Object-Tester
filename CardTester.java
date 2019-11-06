/*
CARD TESTER CODE
For demonstrating Card.java's methods.
 */

/**
 *
 * @author Seven
 */
public class CardTester {
    public static void main(String []args){
        Card specialCard = new Card(7,"*");
        
        Card[] deck = new Card[4];
        deck[0] = new Card(5,"Hearts");
        deck[1] = new Card();
        deck[2] = new Card(10,"Spades");
        deck[3] = new Card();
        /*deck[0].getCard();
        deck[1].getCard();
        deck[2].getCard();*/
        specialCard.isBigger(deck[1]);
        
        Card[] deck2 = new Card[3];
        deck2[0] = new Card(7, "Spades");
        for(int i=deck.length-1;i>=0;i--){
            deck[i].printCard();}
        
        specialCard.printCardArt();
        deck[0].printCardArt();
        deck[2].printCardArt();
    }
}
