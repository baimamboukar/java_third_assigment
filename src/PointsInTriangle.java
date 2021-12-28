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

public class PointsInTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a point with x and y coordinates
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Determine whether the point is inside the triangle
        // getting the point of ina line that starts at point

        // Get the intersecting point with the hypotenuse side of the triangle
        // of a line that starts and points (0, 0) and touches the user points
        double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

        // Display results
        System.out.println("The point " + ((x > intersectx || y > intersecty)
                ? "is not "
                : "is ") + "in the triangle");
        input.close();
    }
}
