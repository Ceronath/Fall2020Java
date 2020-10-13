
package Lab2.q3;
import java.util.Scanner;
/**
 * Author: Jordan Poulin 
 * Date: Oct 12th 2020 
 * Description: Calculates volume of cylinder
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        float radius = input.nextFloat();
        System.out.println("Please enter the length: ");
        float length = input.nextFloat();
        double area = radius*radius*Math.PI;
        double volume = area*length;
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
