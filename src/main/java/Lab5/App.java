/**
 * Author: Jordan Poulin 
 * Date: Dec 02nd 2020 
 * Description: Car and person program
 */
package Lab5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class App {
        ArrayList<Car> cars = new ArrayList<Car>();
        ArrayList<Car> sold = new ArrayList<Car>();
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
            + "7. Save lot to file\n"   
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
        
        cars.add(car);
        
        }
        private void listCars() {
        
        for(int i = 0; cars.get(i) != null; i++) {
                out.println("Car number " + i);
            
                out.println("Make: ");
                out.println(cars.get(i).getMake());

                out.println("Model: ");
                out.println(cars.get(i).getModel());
                
                out.println("Year: ");
                out.println(cars.get(i).getYear());
                
                out.println("VIN: ");
                out.println(cars.get(i).getVIN());
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
            cars.get(indexChoice).setMake(stringChoice);
            
            out.println("Model: ");
            stringChoice = input.next();
            cars.get(indexChoice).setModel(stringChoice);
            
            out.println("Year: ");
            intChoice = input.nextInt();
            cars.get(indexChoice).setYear(intChoice);
            
            out.println("VIN: ");
            intChoice = input.nextInt();
            cars.get(indexChoice).setVIN(intChoice);
            
        }
        
        private void deleteCar(){
            int indexChoice;
            
            out.println("What car do you want to delete?");
            indexChoice = input.nextInt();
            
            cars.set(indexChoice, null);
            int carListLength = cars.size() - 1;
            for(int i = 0; i<carListLength; i++){
                if (cars.get(i) == null && cars.get(i+1) !=null){
                    cars.set(i, cars.get(i + 1));
                    cars.set(i+1, null);
                }
            }
        }
        private void sellCar(){
            int indexChoice;
            String firstName, lastName;
            
            out.println("What car are you selling?");
            indexChoice = input.nextInt();
            
            sold.set(soldCurrentIndex, cars.get(indexChoice));
            
            out.println("First name of buyer: ");
            firstName = input.next();
            sold.get(soldCurrentIndex).p.setFirstName(firstName);
            
            out.println("Last name of the buyer: ");
            lastName = input.next();
            sold.get(soldCurrentIndex).p.setLastName(lastName);
            
            soldCurrentIndex++;
            
            cars.set(indexChoice, null);
            int carListLength = cars.size() - 1;
            for(int i = 0; i< carListLength; i++){
                if (cars.get(i) == null && cars.get(i+1) != null){
                    cars.set(i, cars.get(i+1));
                    cars.set(i+1, null);
                }
            }
        }
        
        private void soldCars(){
            for (int i = 0; sold.get(i) != null; i++){
                out.println("Sold car # " + i);
                
                out.println("Make: ");
                out.println(sold.get(i).getMake());

                out.println("Model: ");
                out.println(sold.get(i).getModel());
                
                out.println("Year: ");
                out.println(sold.get(i).getYear());
                
                out.println("VIN: ");
                out.println(sold.get(i).getVIN());
                
                out.println("First name: ");
                out.println(sold.get(i).p.getFirstName());
                
                out.println("VIN: ");
                out.println(sold.get(i).p.getLastName());
            }
        }
        public void saveCars(){
            try {
                FileOutputStream saveFile = new FileOutputStream("test.sav");
                ObjectOutputStream save = new ObjectOutputStream(saveFile);
                save.writeObject(cars);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    public void run(){
        while(loop == true){
            out.println(menu);
            
            int choice;
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
                case 7: saveCars();
                        break;
                case 99: loop = false;
                        break;
                default: out.println("Input incorrect. Try again.");
            }
        }
    }
}
