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

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private double discriminant;

    public static void main(String[] args) {
        // prompt user to enter a and b
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.isReal() && equation.getX1() != equation.getX2()) {
            System.out.println("The equation has two imaginary roots.");
            System.out.println("x1 = " + equation.getX1());
            System.out.println("x2 = " + equation.getX2());
        } else if (equation.isReal() && equation.getX1() == equation.getX2()) {
            System.out.println("The equation has one real root.");
            System.out.println("x0 = " + equation.getX1());
        } else {
            System.out.println("The equation has no real roots.");
        }
        input.close();
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            this.x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            this.x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            this.x1 = -b / (2 * a);
            this.x2 = -b / (2 * a);
        } else {
            this.x1 = Double.NaN;
            this.x2 = Double.NaN;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getDiscriminant() {
        return discriminant;
    }

    public boolean isReal() {
        return !Double.isNaN(x1) && !Double.isNaN(x2);
    }

    public boolean isImaginary() {
        return Double.isNaN(x1) && !Double.isNaN(x2);
    }

    public boolean isComplex() {
        return !Double.isNaN(x1) && Double.isNaN(x2);
    }

}