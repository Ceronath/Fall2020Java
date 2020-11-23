/**
 * Author: Jordan Poulin 
 * Date: Nov 16th 2020 
 * Description: Car and person program
 */
package Lab4b;

import Lab4.q3.*;
import java.util.Scanner;
import static java.lang.System.out;



public class App {
        private static int numCars = 100;
        private static Car[] cars = new Car[numCars];
        private Car[] sold = new Car[numCars];
        private static int currentIndex = 0;
        private int soldCurrentIndex = 0;
        private boolean loop = true;
        private Scanner input = new Scanner(System.in);
        private String menu = ""
            + "1. Add Car\n"
            + "2. List Cars\n"
            + "3. Edit Car\n"
            + "4. Delete Car\n"
            + "5. Sell Car\n"
            + "6. Sold Cars\n"
            + "99. quit";
        private String soldCarsMenu = ""
            + "1. List Cars\n"
            + "99. quit";
        private void addCar() {
        
        
        String stringChoice;
        int intChoice;
        
        Car car = new Car();
        
        
        out.println("Make: "); 
        stringChoice = input.next();
        car.setMake(stringChoice); 
        
        out.println("Model: ");
        stringChoice = input.next();
        car.setModel(stringChoice); 
        
        out.println("Year: ");
        intChoice = input.nextInt();
        car.setYear(intChoice); 
        
        out.println("VIN: ");
        intChoice = input.nextInt();
        car.setVIN(intChoice); 
        
        cars[currentIndex] = car;
        
        currentIndex++;
        }
        private void listCars() {
        
        for(int i = 0; cars[i] != null; i++) {
                out.println("Car number " + i);
            
                out.println("Make: ");
                out.println(cars[i].getMake());

                out.println("Model: ");
                out.println(cars[i].getModel());
                
                out.println("Year: ");
                out.println(cars[i].getYear());
                
                out.println("VIN: ");
                out.println(cars[i].getVIN());
            }
        }
        private void editCar(){
            String stringChoice;
            int intChoice;
            int indexChoice;
            
            out.println("What car do you want to edit?");
            indexChoice = input.nextInt();
            
            out.println("Make: ");
            stringChoice = input.next();
            cars[indexChoice].setMake(stringChoice);
            
            out.println("Model: ");
            stringChoice = input.next();
            cars[indexChoice].setModel(stringChoice);
            
            out.println("Year: ");
            intChoice = input.nextInt();
            cars[indexChoice].setYear(intChoice);
            
            out.println("VIN: ");
            intChoice = input.nextInt();
            cars[indexChoice].setVIN(intChoice);
            
        }
        
        private void deleteCar(){
            int indexChoice;
            
            out.println("What car do you want to delete?");
            indexChoice = input.nextInt();
            
            cars[indexChoice] = null;
            
            for(int i = 0; i<cars.length -1; i++){
                if (cars[i] == null && cars[i+1] !=null){
                    cars[i] = cars[i + 1];
                    cars[i+1] = null;
                }
            }
        }
        private void sellCar(){
            int indexChoice;
            String firstName, lastName;
            
            out.println("What car are you selling?");
            indexChoice = input.nextInt();
            
            sold[soldCurrentIndex] = cars[indexChoice];
            
            out.println("First name of buyer: ");
            firstName = input.next();
            sold[soldCurrentIndex].p.setFirstName(firstName);
            
            out.println("Last name of the buyer: ");
            lastName = input.next();
            sold[soldCurrentIndex].p.setLastName(lastName);
            
            soldCurrentIndex++;
            
            cars[indexChoice] = null;
            
            for(int i = 0; i< cars.length - 1; i++){
                if (cars[i] == null && cars[i+1] != null){
                    cars[i] = cars[i+1];
                    cars[i+1] = null;
                }
            }
        }
        
        private void soldCars(){
            for (int i = 0; sold[i] != null; i++){
                out.println("Sold car # " + i);
                
                out.println("Make: ");
                out.println(sold[i].getMake());

                out.println("Model: ");
                out.println(sold[i].getModel());
                
                out.println("Year: ");
                out.println(sold[i].getYear());
                
                out.println("VIN: ");
                out.println(sold[i].getVIN());
                
                out.println("First name: ");
                out.println(sold[i].p.getFirstName());
                
                out.println("VIN: ");
                out.println(sold[i].p.getLastName());
            }
        }
        public static void addTest(Car car){
            cars[currentIndex] = car;
            currentIndex++;
        }
        
        public static Car getCarTest(int index){
            out.println(index); //test failed so checking index
            return cars[index];
        }
        
        public static Car deleteCarTest(int index){
            return cars[index] = null;
        }
        
        
    public void run(){
        while(loop == true){
            out.println(menu);
            
            int choice =0;
            try{
                choice=input.nextInt();
            } catch (Exception e){
                out.println("Input incorrect.");
                continue;
            }
            
            switch(choice){
                case 1: addCar();
                        break;
                case 2: listCars();   
                        break;
                case 3: editCar();
                        break;
                case 4: deleteCar();
                        break;
                case 5: sellCar();
                        break;
                case 6: soldCars();
                        break;
                case 99: loop = false;
                        break;
                default: out.println("Input incorrect. Try again.");
            }
        }
    }
}
