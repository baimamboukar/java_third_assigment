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

public class Intersectingpoint {
    public static void main(String[] args) {
        /**
         * Write a program that prompts the user to enter four points and displays the
         * intersecting point. Here are sample runs:
         */
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the coordinates of the four points: ");
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble(),
                x3 = input.nextDouble(), y3 = input.nextDouble(), x4 = input.nextDouble(), y4 = input.nextDouble();
        double x = (x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4);
        double y = (x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4);
        double denom = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (denom == 0) {
            System.out.println("The lines are parallel.");
        } else {
            x /= denom;
            y /= denom;
            System.out.println("The intersection point is (" + x + ", " + y + ")");
        }
        input.close();
    }
}
