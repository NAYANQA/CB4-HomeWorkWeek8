package midweekjavaprogram;

import java.util.Scanner;

/*
6. A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */
public class Quotation06 {
    public static void main(String[] args) {
        System.out.println("Enter marks");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        String grade = calculateGrade(marks);
        System.out.println("corresponding Grade Is: " + grade);

    }

    public static String calculateGrade(int marks) {
        if (marks < 25) {
            return "F";
        } else if (marks >= 25 && marks < 45) {
            return "E";
        } else if (marks >= 45 && marks < 50) {
            return "D";
        } else if (marks >= 50 && marks < 60) {
            return "C";
        } else if (marks >= 60 && marks < 80) {
            return "B";
        } else if (marks >= 80 && marks < 100) {
            return "A";
        } else {
            return "Not allow Marks more then 100";
        }
    }
}
