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

public class ComputeTaxes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        input.close();
        double tax = 0;
        if (amount <= 8350) {
            tax = amount * 0.10;
        } else if (amount <= 33950) {
            tax = 8350 * 0.10 + (amount - 8350) * 0.15;
        } else if (amount <= 82250) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (amount - 33950) * 0.25;
        } else if (amount <= 171550) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (amount - 82250) * 0.28;
        } else if (amount <= 372950) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                    + (amount - 171550) * 0.33;
        } else {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                    + (372950 - 171550) * 0.33 + (amount - 372950) * 0.35;
        }
        System.out.println("The tax is " + tax);
    }
}
