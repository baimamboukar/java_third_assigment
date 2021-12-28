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
 * DESCRIPTION: Addition Quizz
 */
import java.util.Scanner;

public class AdditionQuizz {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        System.out.println("What is " + a + " + " + b + " + " + c + "?");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        if (sum == a + b + c) {
            System.out.println("Correct! You got it!");
        } else {
            System.out.println("Incorrect! You got it wrong.... So forget about it....");
        }
        scanner.close();
    }

}