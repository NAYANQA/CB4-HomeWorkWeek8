package javaprogram;

import java.util.Scanner;

/*
15. Write a program that tells us input value is number or an alphabet orsymbol.
 */
public class Quotation15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value");

        char value = scanner.next().charAt(0);
        if (Character.isDigit(value)) {
            System.out.println("It's Number");
        } else if (Character.isAlphabetic(value)) {
            System.out.println("It's a Alphabet");
        } else {
            System.out.println("It's a symbol");
        }
    }
}
