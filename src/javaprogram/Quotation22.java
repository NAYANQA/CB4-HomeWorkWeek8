package javaprogram;

/*
22. Write a Java program to calculate the average value of array elements.
 */
public class Quotation22 {

    public static void main(String[] args) {

        int[] value = {1, 2, 3, 4, 5, 6};

        int sum = 0;

        for (int num : value) {
            sum += num;
        }
        double avg = sum / value.length;
        System.out.println(sum);
        System.out.println("sum values of an array:- " + avg);
    }
}
