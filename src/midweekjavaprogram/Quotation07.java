package midweekjavaprogram;

import java.util.Scanner;

/*
7. Take input of age of 3 people by user and determine oldest and youngest among
them.
 */
public class Quotation07 {


    public static void main(String[] args) {
        System.out.println("Enter first person age");
        Scanner scanner = new Scanner(System.in);
        int firstPersonAge = scanner.nextInt();
        System.out.println("Enter second person age");
        int secondPersonAge = scanner.nextInt();
        System.out.println("Enter Third person age");
        int thirdPersonAge = scanner.nextInt();
        int oldestPerson = oldAgePerson(firstPersonAge, secondPersonAge, thirdPersonAge);
        int youngestPerson = youngAgePerson(firstPersonAge, secondPersonAge, thirdPersonAge);
        System.out.println("OldestPerson is:- " + oldestPerson);
        System.out.println("YoungestPerson is:- " + youngestPerson);
    }

    public static int oldAgePerson(int age1, int age2, int age3) {
        return Math.max(Math.max(age1, age2), age3);
    }

    public static int youngAgePerson(int age1, int age2, int age3) {
        return Math.min(Math.min(age1, age2), age3);
    }

}
