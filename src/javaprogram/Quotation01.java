package javaprogram;

import java.util.Scanner;

/*
1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)
 */
public class Quotation01 {


    public static void main(String[] args) {
        oddEvenNumber();
    }

    public static void oddEvenNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number :-  ");
        int value = scn.nextInt();

        String result = (value % 2 == 0) ? "even" : "odd";

        System.out.println("The entered value is :- " + result);


    }
}


