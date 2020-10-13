package Lab2.q2;

import java.util.Scanner;

/**
 * Author: Jordan Poulin 
 * Date: Oct 12th 2020 
 * Description: Takes input for
 * fahrenheit and converts to celsius
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();
        float nine = 9.0f;
        float celsius = (fahrenheit-32) * (5/nine);
        System.out.println(fahrenheit + " degrees Fahrenheit = " + celsius
                + " degrees Celsius");
    }
}
