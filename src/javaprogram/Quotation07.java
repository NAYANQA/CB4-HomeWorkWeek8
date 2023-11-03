package javaprogram;

import java.util.Scanner;

/*
7. Write a java program to input any number and find out if it’s odd or even.
 */
public class Quotation07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:- ");
        int no = sc.nextInt();
        if (no / 2 == 0) {
            System.out.println("It's odd number");

        } else {
            System.out.println("Even No");
        }
    }

}
