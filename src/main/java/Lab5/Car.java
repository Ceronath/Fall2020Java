/**
 * Author: Jordan Poulin 
 * Date: Nov 16th 2020 
 * Description: Car and person program
 */
package Lab5;

import Lab4.q3.*;

public class Car {
    private String make;
    private String model;
    private Person owner;
    private int year;
    private int vin;
    
    Person p = new Person();
    
    public Car(){
        
    }
    
    public Car(String makeArg, String modelArg, int yearArg){
        make = makeArg;
        model = modelArg;
        year = yearArg;
    }
    
    public Car(String makeArg, String modelArg, int yearArg, int vinArg){
        make = makeArg;
        model = modelArg;
        year = yearArg;
        vin = vinArg;
    }
    
    public Car(String makeArg, String modelArg, int yearArg, Person ownerArg, 
            int vinArg){
        make = makeArg;
        model = modelArg;
        year = yearArg;
        owner = ownerArg;
        vin = vinArg;
    }
    
    
    @Override
    public String toString(){
        return "Make : " + make + "\n"
                + "Model : " + model + "\n"
                + "Year : " + year + "\n"
                + "VIN : " + vin + "\n"
                + "Owner : " + owner.toString();
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        
        if(! (o instanceof Car))
            return false;
        
        Car p = (Car) o;
        if( p.make == this.make && p.model == this.model && p.year
                == this.year && p.vin == this.vin){
            return true;
        }
        else return false;
    }

    void setMake(String stringChoice) {
        this.make = stringChoice;
    }

    void setModel(String stringChoice) {
        this.model = stringChoice;
    }

    void setYear(int intChoice) {
        this.year = intChoice;
    }

    void setVIN(int intChoice) {
        this.vin = intChoice;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public int getVIN(){
        return this.vin;
    }
}
