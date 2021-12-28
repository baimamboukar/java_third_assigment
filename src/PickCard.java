package src;

/**
 * COURSE: JAVA PROGRAMMING I | ICT UNIVERSITY | FALL 2021
 * INSTRUCTOR: Eng. DANIEL MOUNE
 * ..................................................................
 * ⚝ NAME: BAIMAM BOUKAR JEAN JACQUES
 * ⚝ MATRIC NO: ICTU20201685
 * ⚝ EMAIL: baimamboukar@gmail.com
 * ⚝ GITHUB: github.com/baimamboukar
 * ⚝ LINKEDIN: linkedin.com/in/baimamboukar
 * ..................................................................
 */
public class PickCard {
    public static void main(String[] args) {

        int card = (int) (Math.random() * 52 + 1);
        int rank = card % 13;
        int suit = card / 13;
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        System.out.println("The card you picked is the " + ranks[rank] + " of " + suits[suit]);

    }
}
