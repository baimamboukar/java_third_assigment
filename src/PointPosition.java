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

public class PointPosition {
        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter the coordinates of the three points: ");
                double x0 = input.nextDouble(), y0 = input.nextDouble(), x1 = input.nextDouble(),
                                y1 = input.nextDouble(),
                                x2 = input.nextDouble(), y2 = input.nextDouble();
                double a = y1 - y0;
                double b = x0 - x1;
                double c = x1 * y0 - x0 * y1;
                double d = a * x2 + b * y2 + c;
                if (d == 0) {
                        System.out
                                        .println("The point (" + x2 + ", " + y2 + ")" + " is on the line from (" + x0
                                                        + ", " + y0 + ") to ("
                                                        + x1 + ", " + y1 + ")");
                } else if (d > 0) {
                        System.out
                                        .println("The point(" + x2 + ", " + y2 + ")" + " is on the right from (" + x0
                                                        + ", " + y0 + ") to ("
                                                        + x1 + ", " + y1 + ")");
                } else {
                        System.out
                                        .println("The point(" + x2 + ", " + y2 + ")" + " is on the left from (" + x0
                                                        + ", " + y0 + ") to ("
                                                        + x1 + ", " + y1 + ")");
                }
                input.close();

        }
}
