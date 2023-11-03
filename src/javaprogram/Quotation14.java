package javaprogram;

/*
14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately.
 */
public class Quotation14 {

    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number between 1 to 100");
        int number = scanner.nextInt();

        if (number%3==0){
            System.out.println("It's divided by three");
            
        } else if (number%5 == 0) {
            System.out.println("It's divided by five");
        }
        else {
            System.out.println("Entered Number is not divided by 3 or 5");
        }

      */

        System.out.println("Divide by 3");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "divide by 3");

            } else if (i % 5 == 0) {
                System.out.println(i + "divide by 5");

            } else {
                System.out.println("not valid ");
            }
        }
    }
}
