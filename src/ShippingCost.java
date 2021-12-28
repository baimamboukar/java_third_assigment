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

public class ShippingCost {
    public static void main(String[] args) {
        // askuser to prompt shiping weight
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight of your package: ");
        double weight = scanner.nextDouble();
        if (weight > 50) {
            System.out.println("The package cannot be shipped");
        } else {
            System.out.println("The shipping cost is:" + calculateShippingCost(weight));
        }

        scanner.close();
    }

    public static double calculateShippingCost(double weight) {
        // calculate shipping cost
        double shippingCost = 0.0;
        if (weight > 0 && weight <= 1) {
            shippingCost = 3.50;
        } else if (weight > 1 && weight <= 3) {
            shippingCost = 5.5;
        } else if (weight > 3 && weight <= 10) {
            shippingCost = 8.5;
        } else {
            shippingCost = 10.5;
        }
        return shippingCost;
    }

}
