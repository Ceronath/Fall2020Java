/**
 * Author: Jordan Poulin 
 * Date: Nov 15th 2020 
 * Description: Car and person program
 */
package Lab4.q1and2;


public class Car {
    private String make;
    private String model;
    private Person owner;
    private int year;
    private int vin;
    
    //Person p = new Person("Jordan", "Poulin", 30, 185.42, 250, 'M');
    
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
}
