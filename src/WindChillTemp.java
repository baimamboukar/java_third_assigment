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

public class WindChillTemp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed: ");
        double windSpeed = input.nextDouble();
        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                    + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
            System.out.println("The wind chill index is " + windChill);
        } else {
            System.out.println("The input is invalid.");
        }
        input.close();
    }
}