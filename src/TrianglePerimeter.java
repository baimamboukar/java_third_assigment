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

public class TrianglePerimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first edge: ");
        int a = input.nextInt();
        System.out.print("Enter the length of the second edge: ");
        int b = input.nextInt();
        System.out.print("Enter the length of the third edge: ");
        int c = input.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The perimeter is " + (a + b + c));
        } else {
            System.out.println("The input is invalid.");
        }
        input.close();

    }
}
