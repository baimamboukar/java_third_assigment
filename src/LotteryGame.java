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

public class LotteryGame {

    public static void main(String[] args) {
        // generate a lottery of a threedigit number
        int lottery = (int) (Math.random() * 1000);
        // get first, second and third digit of the lottery number
        int lotteryFirstDigit = lottery / 100;
        int lotterySecondDigit = (lottery / 10) % 10;
        int lotteryThirdDigit = lottery % 10;
        // get the user's guess
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        int guess = scanner.nextInt();
        // get first, second and third digit of the guess
        int guessFirstDigit = guess / 100;
        int guessSecondDigit = (guess / 10) % 10;
        int guessThirdDigit = guess % 10;
        // check if the guess is correct

        // print lottery number
        System.out.println("The lottery number is " + lottery);
        // check If all digits in the user input match all digits in the lottery number
        if (guessFirstDigit == lotteryFirstDigit && guessSecondDigit == lotterySecondDigit
                && guessThirdDigit == lotteryThirdDigit) {
            System.out.println("You win $10,000!");
        } else if ((guessFirstDigit == lotteryFirstDigit || guessFirstDigit == lotterySecondDigit
                || guessFirstDigit == lotteryThirdDigit)
                && (guessSecondDigit == lotteryFirstDigit || guessSecondDigit == lotterySecondDigit
                        || guessSecondDigit == lotteryThirdDigit)
                && (guessThirdDigit == lotteryFirstDigit || guessThirdDigit == lotterySecondDigit
                        || guessThirdDigit == lotteryThirdDigit)) {
            System.out.println("You win $3,000");
        } else if (guessFirstDigit == lotteryFirstDigit || guessFirstDigit == lotterySecondDigit
                || guessFirstDigit == lotteryThirdDigit || guessSecondDigit == lotteryFirstDigit
                || guessSecondDigit == lotterySecondDigit || guessSecondDigit == lotteryThirdDigit
                || guessThirdDigit == lotteryFirstDigit || guessThirdDigit == lotterySecondDigit
                || guessThirdDigit == lotteryThirdDigit) {
            System.out.println("You win $1,000");
        } else {
            System.out.println("You win $0");
        }
        scanner.close();
    }

}
