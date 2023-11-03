package javaprogram;

import java.util.Scanner;

/*
6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
 */
public class Quotation06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee id:- ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name:- ");
        String employeeName = scanner.nextLine();

        System.out.println("Enter Basic Salary:- ");
        double basicSalary = scanner.nextDouble();

        double hra = 0.10 * basicSalary;
        double ta = 0.09 * basicSalary;
        double da = 0.08 * basicSalary;
        double pf = 0.20 * basicSalary;

        double grossSalary = basicSalary + hra + ta + da - pf;

        System.out.println("|         Salary Slip           |");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|Employee id   :" + employeeId + "            |");
        System.out.println("|Employee Name :" + employeeName + "             | ");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("-------------------------------");
        System.out.println("|Basic Salary  :" + basicSalary + "         |");
        System.out.println("|HRA 10%       :" + hra + "          |");
        System.out.println("|TA 8%         :" + ta + "          |");
        System.out.println("|DA 9%         :" + da + "          |");
        System.out.println("|PF - 20&      :" + pf + "          |");
        System.out.println("|                               |");
        System.out.println("|Gross Salary  :" + grossSalary + "         |");
        System.out.println("|===============================|");


    }
}
