package midweekjavaprogram;

import java.util.Scanner;

/*
9. Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */
public class Quotation09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of classes held:- ");
        int classesHeld = scanner.nextInt();
        System.out.println("Number of classes attended:- ");
        int classesAttended = scanner.nextInt();

        double percentageOfClassAttnded = classAttendancePercentage(classesHeld, classesAttended);
        System.out.println("Class Attendance  Percentage:- " + percentageOfClassAttnded + "%");
        System.out.println("he/she has medical cause or not ( 'Y' or 'N' )");
        char hasMedicalCause = scanner.next().charAt(0);
        if (hasMedicalCause == 'Y' || hasMedicalCause == 'y' || percentageOfClassAttnded >= 75) {

            System.out.println("Is student is allowed to sit in exam ");
        } else {
            System.out.println("Is student is Not allowed to sit in exam ");

        }

    }

    public static double classAttendancePercentage(int classesHeld, int classesAttended) {
        return ((double) classesAttended / classesHeld) * 100;
    }

}
