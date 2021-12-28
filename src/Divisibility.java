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

public class Divisibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        Boolean divisibleByFiveAndSix = false;
        Boolean divisibleByFiveOrSix = false;
        int number = input.nextInt();
        if (number % 5 == 0 && number % 6 == 0) {
            divisibleByFiveAndSix = true;
        }
        if (number % 5 == 0 || number % 6 == 0) {
            divisibleByFiveOrSix = true;
        }
        System.out.println("The number is divisible by 5 and 6: " + divisibleByFiveAndSix);
        System.out.println("The number is divisible by 5 or 6: " + divisibleByFiveOrSix);
        System.out.println(
                "The number is divisible or 5 and 6, but not both:" + (divisibleByFiveAndSix ^ divisibleByFiveOrSix));
        input.close();
    }
}
