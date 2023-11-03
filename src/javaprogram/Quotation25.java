package javaprogram;

/*
25. Declare one method with return type and parameter and print your name in console.
 */
public class Quotation25 {
    public static void main(String[] args) {
        String name = myName("Nayan");
        System.out.println(name);
    }
    public static String myName(String name) {
//        System.out.println("My name is: " +name);
        return name;
    }
}
