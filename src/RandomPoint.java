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

public class RandomPoint {

    public static void main(String[] args) {
        // generate a random number between 0 and 1
        double randomNumber = Math.random();
        // generate a random x coordinate
        double x = randomNumber * 100 - 50;
        // generate a random y coordinate
        double y = randomNumber * 200 - 100;
        // print the random coordinate
        System.out.println("COOORDINATES: (" + x + ", " + y + ")");
    }
}
