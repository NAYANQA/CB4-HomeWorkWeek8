package javaprogram;

import java.util.Scanner;

/*
8. Write a java program to get numbers from users and print whether it is positive or negative.
 */
public class Quotation08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:-");
        int number = sc.nextInt();
        if (number > 0) {

            System.out.println("It's positive Number");
        } else if (number < 0) {
            System.out.println("It's Negative Number");
        } else {
            System.out.println("It's zero value");
        }
    }

}
