package midweekjavaprogram;

import java.util.Scanner;

/*
8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */
public class Quotation08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of classes held:- ");
        int classesHeld = scanner.nextInt();
        System.out.println("Number of classes attended:- ");
        int classesAttended = scanner.nextInt();

        double percentageOfClassAttnded = classAttendancePercentage(classesHeld, classesAttended);
        System.out.println("Class Attendance  Percentage:- " + percentageOfClassAttnded + "%");

        if (percentageOfClassAttnded >= 75) {

            System.out.println("Is student is allowed to sit in exam ");
        } else {
            System.out.println("Is student is Not allowed to sit in exam ");

        }

    }

    public static double classAttendancePercentage(int classesHeld, int classesAttended) {
        return ((double) classesAttended / classesHeld) * 100;
    }
}
