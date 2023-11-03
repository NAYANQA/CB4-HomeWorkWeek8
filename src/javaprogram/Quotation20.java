package javaprogram;

import java.util.Arrays;

/*
20. Write a Java program to sort a numeric array and a string array.
 */
public class Quotation20 {

    public static void main(String[] args) {
        int[] numericArray = {1, 2, 9, 4, 5};
        String[] stringArray = {"Nayan", "UK", "Patel"};

        System.out.println("Actual numeric Arrays :- " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric Arrays :- " + Arrays.toString(numericArray));
        System.out.println("Actual String Arrays :- " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Arrays:- " + Arrays.toString(stringArray));
    }
}
