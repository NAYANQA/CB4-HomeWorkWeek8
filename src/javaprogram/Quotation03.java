package javaprogram;

/*
3. Declare multidimensional array and store 5 countries and their capital and print them in
console.
 */
public class Quotation03 {

    public static void main(String[] args) {

        String[][] countryArray = {{"India", "Gujarat"}, {"USA", "New York"}, {"France", "Paris"}, {"Japan", "Tokyo"}, {"Australia", "Sydney"}};

        for (int i = 0; i < countryArray.length; i++) {
            String country = countryArray[i][0];
            String capital = countryArray[i][1];

            System.out.println(country + "= " + capital);
        }
    }
}