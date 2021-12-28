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

public class ZellerCongruence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the month(1-12): ");
        int month = scanner.nextInt();
        System.out.println("Enter the day of the month(1-7): ");
        int day = scanner.nextInt();
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        if (day > days) {
            System.out.println("Invalid date.");
        } else {
            int dayOfWeek = (day + (13 * (month + 1)) / 5 + year + year / 4 - year / 100 + year / 400) % 7;
            String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
            System.out.println("The day of the week is " + daysOfTheWeek[dayOfWeek]);
        }
        scanner.close();
    }
}