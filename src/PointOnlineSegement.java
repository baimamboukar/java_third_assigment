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

public class PointOnlineSegement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the three points for p0, p1, and p2
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble(),
                y0 = input.nextDouble(),
                x1 = input.nextDouble(),
                y1 = input.nextDouble(),
                x2 = input.nextDouble(),
                y2 = input.nextDouble();

        // Computes if the point is in on line segment
        boolean online = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
                ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
                (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));

        // Display final result
        System.out.print("(" + x2 + ", " + y2 + ") is ");
        if (!online)
            System.out.print("not ");
        System.out.println("on the line segment from (" + x0 + ", " + y0 +
                ") to (" + x1 + ", " + y1 + ")");
        input.close();
    }

}
