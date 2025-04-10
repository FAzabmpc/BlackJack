
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BlackJack{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f");
        ArrayList<Card> deck = new ArrayList<Card>();

        makeDeck(deck);

        System.out.println("Welcome to Blackjack!");
        int totalProfit = 0;
        boolean keepPlaying = true;

        // Keep Playing loop done by Anthony!

        while (keepPlaying) {
            ArrayList<Card> playerHand = new ArrayList<Card>();
            ArrayList<Card> computerHand = new ArrayList<Card>();
            int playerScore = 0;
            int computerScore = 0;

            // bbetting system done by Fady!

            System.out.print("How much would you like to bet? ");
            int bet = keyboard.nextInt();

            System.out.println("Player hand = " + playerHand);

            System.out.println("Player score = " + score(playerHand));
            System.out.println("Player, hit or stay? ");
            String answer = keyboard.next();

            while (answer.equals("hit")) {
                System.out.println("Dealing ... ");
                playerHand.add(deal(deck));
                System.out.println("Player hand = " + playerHand);
                playerScore = score(playerHand);

                System.out.println("Player score = " + playerScore);
                if (playerScore > 21) {
                    System.out.println("You lost!");
                    totalProfit -= bet;
                    break;
                }
                System.out.print("Player, hit or stay? ");
                answer = keyboard.next();
            }

            if (playerScore <= 21) {
                System.out.print("House: ");
                while (computerScore < 16) {
                    System.out.println("Dealing ... ");
                    computerHand.add(deal(deck));
                    computerScore = score(computerHand);
                    System.out.println("House hand = " + computerHand);
                    System.out.println("House score = " + computerScore);
                }

                if (computerScore > 21 || playerScore > computerScore) {
                    System.out.println("You won!");
                    totalProfit += bet;
                } else if (computerScore > playerScore) {
                    System.out.println("You lost :(");
                    totalProfit -= bet;
                } else {
                    System.out.println("You tied");
                }
            }

            // profit element done by Fady!

            System.out.println("Your total profit is: " + totalProfit + " chips.");
            System.out.print("Do you want to play another round? (yes/no): ");
            String continuePlaying = keyboard.next();
            keepPlaying = continuePlaying.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final profit is: " + totalProfit + " chips.");
    }

    public static void makeDeck(ArrayList<Card> deck) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("src/cards.txt"));
        int k = 0;
        while (k < 52 && inputFile.hasNext()) {
            char tempSuit = inputFile.next().charAt(0);
            int tempRank = inputFile.nextInt();
            Card tempCard = new Card(tempSuit, tempRank);
            deck.add(tempCard);
            k++;
        }
    }

    public static Card deal(ArrayList<Card> deck) {
        int rand = randomInt(0, deck.size());
        Card tempCard = deck.get(rand);
        deck.remove(rand);
        return tempCard;
    }

    public static int randomInt(int low, int high) {
        int range = high - low;
        return (int) (range * Math.random()) + low;
    }

    public static int score(ArrayList<Card> hand) {
        int score = 0;
        for (int k = 0; k < hand.size(); k++) {
            score += blackJackValue(hand.get(k));
        }
        return score;
    }

    public static int blackJackValue(Card c) {
        if (c.getRank() < 11) {
            return c.getRank();
        } else {
            return 10;
        }
    }
}