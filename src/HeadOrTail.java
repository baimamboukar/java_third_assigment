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
import java.util.Scanner;

public class HeadOrTail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate a random integer 0 or 1
        int coin = (int) (Math.random() * 2);

        // Prompt the user to enter a guess
        System.out.print("Guess wheter it is head or tail. (Enter 0 for head or 1 for tail): ");
        int guess = input.nextInt();

        // Display result
        System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess.");

        input.close();
    }

}
