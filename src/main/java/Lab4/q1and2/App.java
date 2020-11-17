/**
 * Author: Jordan Poulin 
 * Date: Nov 15th 2020 
 * Description: Car and person program
 */
package Lab4.q1and2;


public class App {
    public void run(){
    Person p1 = new Person("Joe", "Student", 23, 'M');
    
    Person p2 = new Person("George", "Student", 24, 188.2, 60.0, 'M');
    
    Person p3 = new Person("Joe", "Student", 23, 'M');
    
    Person jordan = new Person("Jordan", "Poulin", 30, 185.42, 250, 'M');
    
    Car c1 = new Car("Mazda", "CX7", 2007, jordan, 1234);
    
    Car c2 = new Car("Ford", "Mustang", 2007, 1234);
    
    Car c3 = new Car("Ford", "Mustang", 2007, 1234);
    
    Car c4 = new Car("Chevy", "Camaro", 2008, 1345);
    
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(c1.toString());
    if(p1.equals(p2)){
        System.out.println("p1 is the same as p2.");
    }else{
        System.out.println("p1 is not the same as p2.");
    }
    if(p1.equals(p3)){
        System.out.println("p1 is the same as p3.");
    }else{
        System.out.println("p1 is not the same as p3");
    }
    if(c2.equals(c3)){
        System.out.println("c2 is the same as c3.");
    }else{
        System.out.println("c2 is not the same as c3.");
    }
    if(c2.equals(c4)){
        System.out.println("c2 is the same as c4.");
    }else{
        System.out.println("c2 is not the same as c4.");
    }
    
}
}
