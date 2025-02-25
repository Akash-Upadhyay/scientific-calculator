package com.calculator;

import java.util.Scanner;

public class ScientificCalculator {
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x == 0 || x == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm undefined for non-positive values.");
        }
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        while (true) {

            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Log (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter x: ");
                double x = scanner.nextDouble();
                System.out.println("Result: " + squareRoot(x));
            } else if (choice == 2) {
                System.out.print("Enter x: ");
                int x = scanner.nextInt();
                System.out.println("Result: " + factorial(x));
            } else if (choice == 3) {
                System.out.print("Enter x: ");
                double x = scanner.nextDouble();
                System.out.println("Result: " + naturalLog(x));
            } else if (choice == 4) {
                System.out.print("Enter x: ");
                double x = scanner.nextDouble();
                System.out.print("Enter b: ");
                double b = scanner.nextDouble();
                System.out.println("Result: " + power(x, b));
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
    }
}
