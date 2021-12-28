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

public class MonetaryUNits {

    public static void main(String[] args) {
        int amount = 0;
        int[] denominations = { 25, 10, 5, 1 };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in cents: ");
        amount = input.nextInt();
        input.close();
        int[] numCoins = new int[denominations.length];
        for (int i = 0; i < denominations.length; i++) {
            numCoins[i] = amount / denominations[i];
            amount = amount % denominations[i];
        }
        System.out.println("Your amount " + amount + " cents consists of:");
        for (int i = 0; i < denominations.length; i++) {
            if (numCoins[i] != 0) {
                if (numCoins[i] == 1) {
                    System.out.println("\t" + numCoins[i] + " " + denominations[i] + " cent");
                } else {
                    System.out.println("\t" + numCoins[i] + " " + denominations[i] + " cents");
                }
            }
        }

    }
}