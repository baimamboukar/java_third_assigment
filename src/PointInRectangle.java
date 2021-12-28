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

public class PointInRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the point: ");
        double x = input.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        double y = input.nextDouble();
        double width = 10;
        double height = 5;
        if (x >= -width / 2 && x <= width / 2 && y >= -height / 2 && y <= height / 2) {
            System.out.println("The point (" + x + ", " + y + ") is within the rectangle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is not within the rectangle.");
        }
        input.close();
    }
}
