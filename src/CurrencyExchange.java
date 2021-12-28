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

public class CurrencyExchange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from U.S. dollars to Chinese RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print(
                "Enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars: ");
        int choice = input.nextInt();
        if (choice == 0) {
            System.out.print("Enter the amount in U.S. dollars to convert it to Chinese RMB: ");
            double amount = input.nextDouble();
            System.out.println("The amount in Chinese RMB is " + amount * exchangeRate);
        } else {
            System.out.print("Enter the amount in Chinese RMB to convert it to U.S. dollars: ");
            double amount = input.nextDouble();
            System.out.println("The amount in U.S. dollars is " + amount / exchangeRate);
        }
        input.close();

    }
}
