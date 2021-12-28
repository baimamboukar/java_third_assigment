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
 * DESCRIPTION: BMI Calculator
 */

import java.util.Scanner;

public class BMIcalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in feet: ");
        double feet = scanner.nextDouble();
        System.out.println("Enter your height in inches: ");
        double inches = scanner.nextDouble();
        double height = (feet * 12 + inches) * 0.0254;
        // convert pounds to kilograms
        double weightKg = weight * 0.45359237;
        double bmi = weightKg / (height * height);
        System.out.println("Your BMI is " + bmi);
        scanner.close();
    }
}
