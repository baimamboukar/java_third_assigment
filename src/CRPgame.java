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

public class CRPgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.print("1. Rock ** 2. Paper ** 3. Scissors: ");
        int choice = scanner.nextInt();
        int computerChoice = (int) (Math.random() * 3) + 1;
        if (choice == 1) {
            if (computerChoice == 1) {
                System.out.println("You are rock. The computer is rock. It's a tie.");
            } else if (computerChoice == 2) {
                System.out.println("You are rock. The computer is paper. The computer wins.");
            } else {
                System.out.println("You chose rock. The computer is scissors. You win.");
            }
        } else if (choice == 2) {
            if (computerChoice == 1) {
                System.out.println("You are paper. The computer is rock. You win.");
            } else if (computerChoice == 2) {
                System.out.println("You are paper. The computer is paper. It's a tie.");
            } else {
                System.out.println("You are paper. The computer is scissors. The computer wins.");
            }
        } else {
            if (computerChoice == 1) {
                System.out.println("You chose scissors. The computer chose rock. The computer wins.");
            } else if (computerChoice == 2) {
                System.out.println("You chose scissors. The computer chose paper. You win.");
            } else {
                System.out.println("You chose scissors. The computer chose scissors. It's a tie.");
            }
        }
        scanner.close();
    }
}
