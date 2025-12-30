package com.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Choose an operation (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int result;

        switch (choice) {
            case 1:
                result = calculator.add(a, b);
                break;
            case 2:
                result = calculator.subtract(a, b);
                break;
            case 3:
                result = calculator.multiply(a, b);
                break;
            case 4:
                result = calculator.divide(a, b);
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
