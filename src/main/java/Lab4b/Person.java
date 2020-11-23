/**
 * Author: Jordan Poulin 
 * Date: Nov 16th 2020 
 * Description: Car and person program
 */
package Lab4b;

import Lab4.q3.*;


public class Person {
    public static String firstName;
    public static String lastName;
    private int age;
    private double height;
    private double weight;
    private char gender;
    
    public Person(){
        
    }
    
    public Person(String firstArg, String lastArg, int ageArg, double heightArg,
            double weightArg, char gendArg) {
        firstName = firstArg;
        lastName = lastArg;
        age = ageArg;
        height = heightArg;
        weight = weightArg;
        gender = gendArg;
    }
    public Person(String firstArg, String lastArg, int ageArg, char gendArg){
        firstName = firstArg;
        lastName = lastArg;
        age = ageArg;
        gender = gendArg;
    }
    
    public String getFirstName(){
        return Person.firstName;
    }
    public void setFirstName(String firstNameArg){
        this.firstName = firstNameArg;
    }
    public String getLastName(){
        return Person.lastName;
    }
    public void setLastName(String lastNameArg){
        this.lastName = lastNameArg;
    }
    
    @Override
    public String toString() {
        return "Name : " + firstName + " " + lastName+"\n"+
                "Age : " + age + "\n" +
                "Height : " + height + "cm" + "\n" +
                "Weight : " + weight + "kg" + "\n"+
                "Gender : " + gender + "\n";
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        
        if(! (o instanceof Person))
            return false;
        
        Person p = (Person) o;
        if(p.firstName == this.firstName && p.lastName == this.lastName && p.age
                == this.age && p.gender == this.gender && p.height == this.height
                && p.weight == this.weight){
            return true;
        }
        else return false;
    }
    
    
}
