package javaprogram;

import java.util.Scanner;

/*
12. Same as above program-8 using switch statement.
 */
public class Quotation12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char alphabet = scanner.next().charAt(0);
        switch (alphabet) {
            case 'A':
                System.out.println("Anand");
            case 'B':
                System.out.println("Baroda");
            case 'C':
                System.out.println("Canod");
            case 'D':
                System.out.println("Dahod");
            case 'E':
                System.out.println("Edar");
            case 'F':
                System.out.println("Fatepura");
        }
        System.out.println("No alphabet Match");
    }
}
