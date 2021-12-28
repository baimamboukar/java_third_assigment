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
 * DESCRIPTION: This program compare cost of two packages based on weight and price
 */
import java.util.Scanner;

public class CompareCost {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight and price of the first package: ");
        double weight1 = input.nextDouble(), price1 = input.nextDouble();
        System.out.println("Enter the weight and price of the second package: ");
        double weight2 = input.nextDouble(), price2 = input.nextDouble();
        if (price1 / weight1 > price2 / weight2) {
            System.out.println("Package 2 has a better price.");
        } else if (price1 / weight1 < price2 / weight2) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("The two packages have the same price.");
        }
        input.close();
    }
}
