package Lab3.q2;

import java.util.Scanner;

/**
 * Author: Jordan Poulin Date: Oct 28th 2020 Description: Luhn program question
 * 2
 */

public class App {

    public void run() {
        boolean lBool = true;
        long lLong;

        Scanner input = new Scanner(System.in);

        while (lBool) {
            System.out.println("Enter your account number, please: ");
            lLong = input.nextLong();

            if (String.valueOf(lLong).length() == 11) {
                String str = String.valueOf(lLong);
                int sum = 0;

                for (int i = 0; i < 10; i++) {
                    int num = str.charAt(i) - 48;

                    if (i % 2 == 1) {
                        num *= 2;

                        if (num >= 10) {
                            num -= 9;
                            sum += num;
                        } else {
                            sum += num;
                        }
                    } else {
                        sum += num;
                    }
                }
                sum = (sum * 9) % 10;

                int lastNum = str.charAt(10) - 48;

                if (lastNum == sum) {
                    System.out.println("Your account number: " + lLong + sum + " is valid.");
                } else {
                    System.out.println("Your account number: " + lLong + sum + " is not valid.");
                }
            } else if (lLong == 1) {
                lBool = false;
            }
            else{
                System.out.println("Please enter 11 numbers.");
            }
        }

    }
}
