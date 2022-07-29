package MyFirstCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a, b, result;
        String s;
        System.out.print(
                "Welcome to MyCalculator!\n" +
                        "Write your first number to calculate: "

        );
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.print(
                "Write your second number to calculate: "

        );
        b = scanner.nextDouble();
        System.out.print(
                "Write your operation: "

        );
        s = scanner.next();
        doCalc(a, b, s);


        scanner.close();


    }

    public static void doCalc(double a, double b, String s) {
        double result;
        switch (s) {
            case "+":
                result = a + b;
                System.out.println(
                        "Your result is: " + result);
                break;
            case "-":
                result = a - b;
                System.out.println(
                        "Your result is: " + result);
                break;

            case "*":
                result = a * b;
                System.out.println(
                        "Your result is: " + result);
                break;
            case "/":
                result = a / b;
                System.out.println(
                        "Your result is: " + result);
                break;

            default:
                System.out.println("incorrect operation!");
                break;
        }
    }
}
