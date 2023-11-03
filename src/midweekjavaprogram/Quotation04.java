package midweekjavaprogram;

import java.util.Scanner;

/*
4. Take values of length and breadth of a rectangle from user and check if it is square or not.
 */
public class Quotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of length");
        int length = scanner.nextInt();
        System.out.println("Enter the value of breadth");
        int breadth = scanner.nextInt();

        if (length == breadth) {
            System.out.println("It's square");
        } else {
            System.out.println("It's breadth");
        }
    }
}
