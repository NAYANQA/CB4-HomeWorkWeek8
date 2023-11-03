package javaprogram;

import java.util.Scanner;

/*
10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
public class Quotation10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales id:- ");
        int salesId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter seller Name:- ");
        String sellerName = scanner.nextLine();
        System.out.println("Enter sales amount:- ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary:- ");
        double basicSalary = scanner.nextDouble();
        double commission = 0.0;


        if (salesAmount >= 50000) {
            commission = 0.35;
        } else if (salesAmount >= 30000) {
            commission = 0.20;
        } else if (salesAmount >= 20000) {
            commission = 0.10;
        } else if (salesAmount >= 10000) {
            commission = 0.05;
        } else if (salesAmount < 10000) {
            commission = 0.02;
        }


        double salesCommission = salesAmount * commission;

        System.out.println("Sales Id:- " + salesId);
        System.out.println("seller Name:- " + sellerName);
        System.out.println("sales Amount:- " + salesAmount);
        System.out.println("Basic Salary:- " + basicSalary);
        System.out.println("Commission:- " + (commission * 100) + "%");
        System.out.println("sales Commission:- " + salesCommission);

    }
}
