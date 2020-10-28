package Lab3.q1;
import java.util.Scanner;
/**
 * Author: Jordan Poulin 
 * Date: Oct 28th 2020 
 * Description: Luhn program question 1
 */
public class App {

    public void run() {
        boolean lBool = true;
        long lLong;

        Scanner input = new Scanner(System.in);

        while (lBool) {
            System.out.println("Enter your 10 digit account number: ");
            lLong = input.nextLong();

            if (String.valueOf(lLong).length() == 10) {
                long leastSig = lLong % 10;
                leastSig *= 2;
                long temp = lLong / 10;
                if (leastSig >= 10) {
                    leastSig -= 9;
                }
                long leastSig1 = temp % 10;
                temp /= 10;

                long leastSig2 = temp % 10;
                leastSig2 *= 2;
                temp /= 10;
                if (leastSig2 >= 10){
                    leastSig2 -= 9;
                }
                
                long leastSig3 = temp % 10;
                temp /= 10;
                
                long leastSig4 = temp %10;
                leastSig4 *= 2;
                temp /= 10;
                if (leastSig4 >= 10){
                    leastSig4 -= 9;
                }
                
                long leastSig5 = temp % 10;
                temp /= 10;
                
                long leastSig6 = temp % 10;
                leastSig6 *= 2;
                temp /= 10;
                if(leastSig6 >= 10){
                    leastSig6 -= 9;
                }
                
                long leastSig7 = temp % 10;
                temp /= 10;
                
                long leastSig8 = temp % 10;
                leastSig8 *= 2;
                temp /= 10;
                if (leastSig8 >= 10){
                    leastSig8 -= 9;
                }
                
                long leastSig9 = temp % 10;
                
                long sum = ((leastSig + leastSig1 + leastSig2 + leastSig3 + 
                        leastSig4 + leastSig5 + leastSig6 + leastSig7 + 
                        leastSig8 + leastSig9) * 9) % 10;
                
                System.out.println("This account number is valid and is: " + 
                        lLong + sum + ".");
                
            }
            else if (lLong == 1){
                lBool = false;
            }
            
            else {
                System.out.println("Please enter 10 numbers.");
            }
        }
    }
}
