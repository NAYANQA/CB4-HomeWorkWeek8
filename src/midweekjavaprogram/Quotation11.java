package midweekjavaprogram;

import java.util.Scanner;

/*
11. Write a program to print a string entered by user.
 */
public class Quotation11 {

    public static void main(String[] args) {
        System.out.println("Enter String value:- ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("User Entered String is:- " + string);
    }

    /*
    for Refre...!!
    String str = "Programiz";
    boolean result;

    // checks if str is an instance of
    // the String class
    result = str instanceof String;
    System.out.println("Is str an object of String? " + result);
     */
}
