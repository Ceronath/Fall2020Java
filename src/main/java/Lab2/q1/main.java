/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.q1;

import java.util.Scanner;

/**
 * Author: Jordan Poulin 
 * Date: Oct 12th 2020 
 * Description: Takes input for
 * celcius and converts to fahrenheit
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature in Celcius: ");
        float celcius = input.nextFloat();
        float nine = 9.0f;
        float fahrenheit = (nine / 5) * celcius + 32;
        System.out.println(celcius + " degrees Celcius = " + fahrenheit
                + " degrees Fahrenheit");
    }
}
