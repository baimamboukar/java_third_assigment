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

public class CurrentTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        int hour = (int) (System.currentTimeMillis() / 1000 / 60 / 60 + offset) % 24;
        int minutes = (int) (System.currentTimeMillis() / 1000 / 60 % 60);
        int seconds = (int) (System.currentTimeMillis() / 1000 % 60);
        System.out.println("The current time is " + hour + ":" + minutes + ":" + seconds);
        input.close();
    }
}
