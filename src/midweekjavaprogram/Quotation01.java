package midweekjavaprogram;

import java.util.Scanner;

/*
1. Take 10 integers from keyboard using loop and print their average value on the
screen.
 */
public class Quotation01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number ");
            sum = sum + sc.nextInt();
            avg = sum / 10;
            System.out.println("Avg is : " + avg);

        }

    }

}
