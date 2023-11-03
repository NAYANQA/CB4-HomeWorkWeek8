package midweekjavaprogram;

import java.util.Scanner;

/*
5. Take two int values from user and print greatest among them.
 */
public class Quotation05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st value");
        int firstValue = scanner.nextInt();
        System.out.println("Enter 2st value");
        int secondValue = scanner.nextInt();
        int greatestValue = Math.max(firstValue, secondValue);
        System.out.println("It's greatest values is " + greatestValue);
    }

}
