package primitive_data;
import java.util.Scanner;
/**
 * Author: Jordan Poulin 
 * Date: Oct 05th 2020 
 * Description: Shows all 9 data types
 * and asks for user input
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        byte myByte = 100;
        System.out.println("Byte: " + myByte);
        short myShort = 5000;
        System.out.println("Short: " + myShort);
        int myInt = 100000;
        System.out.println("Int: " + myInt);
        long myLong = 10000000000000L;
        System.out.println("Long " + myLong);
        float myFloat = 4.34f;
        System.out.println("Float: " + myFloat);
        double myDouble = 20.59d;
        System.out.println("Double: " + myDouble);
        boolean myBool = true;
        System.out.println("Boolean: " + myBool);
        char myChar = 'J';
        System.out.println("Char: " + myChar);
        String myString = "Jordan";
        System.out.println("String: " + myString);

        System.out.println("Please enter a new value for Byte: ");
        byte newByte = input.nextByte();
        System.out.println(newByte);
        System.out.println("Please enter a new value for Short: ");
        short newShort = input.nextShort();
        System.out.println(newShort);
        System.out.println("Please enter a new value for Int: ");
        int newInt = input.nextInt();
        System.out.println(newInt);
        System.out.println("Please enter a new value for Long: ");
        long newLong = input.nextLong();
        System.out.println(newLong);
        System.out.println("Please enter a new value for Float: ");
        float newFloat = input.nextFloat();
        System.out.println(newFloat);
        System.out.println("Please enter a new value for Double: ");
        double newDouble = input.nextDouble();
        System.out.println(newDouble);
        System.out.println("Please enter a new value for Boolean: ");
        boolean newBool = input.nextBoolean();
        System.out.println(newBool);
        System.out.println("Please enter a new value for Char: ");
        String newChar = input.nextLine();
        System.out.println(newChar);
        System.out.println("Please enter a new value for String: ");
        String newString = input.nextLine();
        System.out.println(newString);
    }
}
