/**
 * MY CARD OBJECT
 For showing the nice children of CS111 how Java objects work
 */
public class Card {
	private int val;
	private String suit; //Instance variables. Should be restricted to only this class.
        
        public Card(int myVal, String mySuit){ //Parameter constructor
            val = myVal;
            suit = mySuit;}
            
	public Card(){ //Null constructor
		int val = 0;
                suit = null;}
        
        public void printCard(){
                String output = Integer.toString(val);
                if (val==10)
                    output=(String)"Ace"; //Overwrite 10 with "Ace" if val=10
                System.out.println(output + " of " + suit);
        } //Rename this to "printCard" or something. "getCard" implies it returns a Card object.
        
        public int getValue(){
            return val;
        }
        
        public boolean isBigger(Card compare){
            //card1.isBigger(card2);
            //Compares the calling card (haha, puns!) to the parameter card.
            //Returns FALSE if calling card's value is less than or equal to compared card, and TRUE otherwise.
            if(compare.getValue() >= this.getValue()){
                System.out.println("This card is smaller. False");
                return false;}
            else{
                System.out.println("This card is bigger. True");
                return true;}
        }
        
        public void printCardArt(){ //Because we all need more ASCII art in our lives.
            String mySuit = this.suit.toUpperCase();
            String suitIcon = "?";
            String aceMarker = " ";
            String valIcon = "X";
            if( mySuit.equals("HEARTS"))
                suitIcon = "♥";
            else if (mySuit.equals("DIAMONDS"))
                suitIcon = "♦";
            else if (mySuit.equals("CLUBS"))
                suitIcon = "♣";
            else if (mySuit.equals("SPADES"))
                suitIcon = "♠";
            else
                suitIcon = this.suit.substring(0,1).toUpperCase();

            if(this.val == 10){
                valIcon = "A";
                aceMarker="#";}
            else
                valIcon = Integer.toString(val);
            System.out.println(" _____"+
                            "\n|"+valIcon+suitIcon+"   |"
                           +"\n|  "+aceMarker+"  |"+
                            "\n|  "+aceMarker+"  |"+
                            "\n|   "+suitIcon+valIcon+"|"+
                            "\n ‾‾‾‾‾ ");
        }
}
