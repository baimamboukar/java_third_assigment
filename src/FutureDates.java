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

public class FutureDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.println("Enter today's day of the week: ");
        int today = scanner.nextInt();
        System.out.println("Enter the number of days after today: ");
        int days = scanner.nextInt();
        int future = (today + days) % 7;
        System.out
                .println("Today is " + daysOfTheWeek[today] + " and The future is " + daysOfTheWeek[future]);
        scanner.close();
    }
}