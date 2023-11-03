package javaprogram;

import java.util.Scanner;

/*
11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.
 */
public class Quotation11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any City name start between A and F");

        char alphabet = sc.next().charAt(0);
        if (alphabet == 'A') {
            System.out.println("Anand");
        } else if (alphabet == 'B') {
            System.out.println("Baroda");
        } else if (alphabet == 'C') {
            System.out.println("Chanod");

        } else if (alphabet == 'D') {
            System.out.println("Dahod");

        } else if (alphabet == 'E') {
            System.out.println("Eshanpur");

        } else if (alphabet == 'F') {
            System.out.println("Faridabad");

        } else {
            System.out.println("Invalid Alphabet");
        }
    }
}
