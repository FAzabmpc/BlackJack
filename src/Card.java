public class Card
{
    // instance variables
    private char suit;
    private int rank;

    // the no-arg constructor
    public Card() {
        this.suit = 'C';
        this.rank = 1;
    }

    // the explicit (parameter) constructor
    public Card(char suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Accessor methods.
    public char getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    // Modifier methods.
    public void setSuit(char suit) {
        if(suit == 'C' || suit == 'c' || suit == 'S' || suit == 's' || suit == 'H' || suit == 'h' || suit == 'D' || suit == 'd') {
            this.suit = suit;
        }
    }

    public void setRank(int rank) {
        if(rank >= 1 && rank <= 13) {
            this.rank = rank;
        }
    }

    // the print method.
    public void print() {
        if(rank == 1) {     // First print out the rank.
            System.out.print("Ace of ");
        }
        else if(rank == 11) {
            System.out.print("Jack of ");
        }
        else if(rank == 12) {
            System.out.print("Queen of ");
        }
        else if(rank == 13) {
            System.out.print("King of ");
        }
        else {
            System.out.print(rank + " of ");
        }

        if(suit == 'C' || suit == 'c') {   // Then print out the suit.
            System.out.println("Clubs");
        }
        if(suit == 'S' || suit == 's') {
            System.out.println("Spades");
        }
        if(suit == 'H' || suit == 'h') {
            System.out.println("Hearts");
        }
        if(suit == 'D' || suit == 'd') {
            System.out.println("Diamonds");
        }
    }

    public String toString()
    {
        String result;
        if(rank == 1) {     // First print out the rank.
            result = "Ace of ";
        }
        else if(rank == 11) {
            result = "Jack of ";
        }
        else if(rank == 12) {
            result = "Queen of ";
        }
        else if(rank == 13) {
            result = "King of ";
        }
        else {
            result = rank + " of ";
        }

        if(suit == 'C' || suit == 'c') {   // Then print out the suit.
            result += "Clubs";
        }
        if(suit == 'S' || suit == 's') {
            result += "Spades";
        }
        if(suit == 'H' || suit == 'h') {
            result += "Hearts";
        }
        if(suit == 'D' || suit == 'd') {
            result += "Diamonds";
        }
        return result;
    }
}
