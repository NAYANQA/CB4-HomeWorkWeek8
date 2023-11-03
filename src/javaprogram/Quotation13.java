package javaprogram;

import java.util.Scanner;

/*
13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to theirsymbol(using if else)
 */
public class Quotation13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number:-");
        double number1 = scanner.nextDouble();
        System.out.println("Enter 2nd Number:-");
        double number2 = scanner.nextDouble();
        System.out.println("Enter any of Symbol +, -, /, * :- ");
        char symbol = scanner.next().charAt(0);
        double ans = 0;

        if (symbol == '+') {
            ans = number1 + number2;
            System.out.println("Addition of Number1 and Number2 is :- " + ans);
        } else if (symbol == '-') {
            ans = number1 - number2;
            System.out.println("Subtraction of Number1 and Number2 is :- " + ans);

        } else if (symbol == '*') {
            ans = number1 * number2;
            System.out.println("Multiplication of Number1 and Number2 is :- " + ans);

        } else if (symbol == '/') {
            ans = number1 / number2;
            System.out.println("Division of Number1 and Number2 is :- " + ans);

        } else {
            System.out.println("Invalid symbol");
        }
    }
}
