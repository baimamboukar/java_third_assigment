package src;

import java.util.Scanner;

public class Main {
    /**
     * Driver code that display all file name inside src directory and run one file
     * depending n user input
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = input.nextLine();
        input.close();
        try {
            Class<?> cls = Class.forName(fileName);
            cls.getMethod("main", String[].class).invoke(null, (Object) new String[] {});
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

}
