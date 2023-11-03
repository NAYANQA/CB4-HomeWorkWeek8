package javaprogram;

import java.util.Scanner;

/*
19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
 */
public class Quotation19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number:- ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
