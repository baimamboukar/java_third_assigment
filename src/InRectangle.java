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

public class InRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), width1 = input.nextDouble(),
                height1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble(), width2 = input.nextDouble(),
                height2 = input.nextDouble();
        double x3 = x1 - width1 / 2;
        double y3 = y1 - height1 / 2;
        double x4 = x2 - width2 / 2;
        double y4 = y2 - height2 / 2;
        double x5 = x1 + width1 / 2;
        double y5 = y1 + height1 / 2;
        double x6 = x2 + width2 / 2;
        double y6 = y2 + height2 / 2;
        if (x3 <= x4 && x4 <= x5 && y3 <= y4 && y4 <= y5) {
            System.out.println("The second rectangle is inside the first rectangle.");
        } else if (x3 <= x4 && x4 <= x5 && y3 <= y4 && y4 <= y5 && x4 <= x6 && x6 <= x5 && y4 <= y6 && y6 <= y5) {
            System.out.println("The second rectangle is overlapping the first rectangle.");
        } else {
            System.out.println("The second rectangle is outside the first rectangle.");
        }
        input.close();

    }
}
