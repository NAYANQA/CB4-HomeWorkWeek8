package javaprogram;

/*
26. Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
 */
public class Quotation26 {

    public static void main(String[] args) {

        String name = "dsaf";
        System.out.println(name);
        String reverse = "";
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }

}
