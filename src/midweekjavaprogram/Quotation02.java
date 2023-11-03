package midweekjavaprogram;
/*
2. Print multiplication table of 24, 50 and 29 using loop.
 */
public class Quotation02 {

    public static void main(String[] args) {
        int num24 = 24;
        int num50 = 50;
        int num29 = 29;
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num24, i, num24 * i);
        }
        System.out.println("------------------------------------");
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num50, i, num50 * i);

        }

        System.out.println("------------------------------------");
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num29, i, num29 * i);

        }

    }

}
