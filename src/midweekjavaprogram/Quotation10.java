package midweekjavaprogram;

import java.util.Scanner;

/*
10. Write a program to print the sum of two numbers entered by user by defining your
own method.
 */
public class Quotation10 {
    public static void main(String[] args) {
        System.out.println("Enter Number1:- ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter Number2:- ");
        int num2 = scanner.nextInt();

        double sum = ownMethod(num1, num2);
        System.out.println("Sum of the Two Number:- " + sum);


    }

    public static double ownMethod(double num1, double num2) {
        return num1 + num2;


    }

}
