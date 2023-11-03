package javaprogram;

/*
21. Write a Java program to sum values of an array.
 */
public class Quotation21 {

    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5, 6};

        int sum = 0;

        for (int num : value) {
            sum += num;
        }
        System.out.println("sum values of an array:- " + sum);
    }
}

