package javaprogram;

import java.util.Scanner;

/*
4. Write if else condition and print your group name in console else others group name.
 */
public class Quotation04 {

    public static void main(String[] args) {

       /* String [] code1  = {"Kinnari","Rutvi","Akash","Hitesh","Rushit","Jay"};
        String [] agile ={"Khusbhu Patel","Kinjal","Ripti","Avani","Nayan","Shikha"};
        String [] restAssured ={"Jwalant","Sumit","Rajvir","Kulwinder","Jay","Vinay","Preksha"};
        String []  code2 ={"Ayan","Zarna","Miten","Sonal","Pankti"};
        String [] java ={"Divya","Khusbu","Harita"};

       */

//        String agile = "AGILE";
//        String code1= "CODE1";
//        String restAssured= "RESTASSURED";
//        String code2= "CODE2";
//        String java= "JAVA";
//        if (code1.equals(agile)) {
//            System.out.println("Your group name is: " + agile);
//        } else if (code2.equals("code2")) {
//            System.out.println("Code2's name is: " + code2);
//        } else if (java.equals("Java")) {
//            System.out.println("Java 3's name is: " + java);
//        } else if (restAssured.equals("RestAssured")) {
//            System.out.println("Group 4's name is: " + restAssured);
//        } else if (restAssured.equals("RestAssured")) {
//            System.out.println("Group 5's name is: " + restAssured);
//
//        } else {
//            System.out.println("A different group name is:");
//        }

        System.out.println("Enter group number");
        Scanner scanner = new Scanner(System.in);
        int groupNumber = scanner.nextInt();

        if (groupNumber == 1) {
            System.out.println("AGILE Group");
        } else if (groupNumber == 2) {

            System.out.println("CODE1 Group");

        } else if (groupNumber == 3) {

            System.out.println("CODE2 Group");

        } else if (groupNumber == 4) {

            System.out.println("RESTASSURED Group");

        } else if (groupNumber == 5) {

            System.out.println("JAVA Group");

        } else {
            System.out.println("You enter Wrong Group Name ");
        }
    }
}




