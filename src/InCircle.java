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

public class InCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), r1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble(), r2 = input.nextDouble();

        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        if (distance <= r1 + r2) {
            System.out.println("The second circle is inside the first circle.");
        } else if (distance == r1 + r2) {
            System.out.println("The second circle overlaps the first circle.");
        } else {
            System.out.println("The second circle is outside the first circle.");
        }
        input.close();
    }
}
