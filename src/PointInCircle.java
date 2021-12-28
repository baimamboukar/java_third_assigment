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

public class PointInCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the point: ");
        double x = input.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        double y = input.nextDouble();
        double radius = 10;
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= radius) {
            System.out.println("The point is within the circle.");
        } else {
            System.out.println("The point is not within the circle.");
        }
        input.close();
    }
}
