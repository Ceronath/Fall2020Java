/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.f20;

/**
 *
 * @author jorda
 */
public class Course {
    String name;                  // Instance variables
    String code; 
    String startDate;
    int numberOfStudents;
    int count = 0;
    
    public Course(){}   // Default constructor
    
    public Course(String nameArg, String codeArg, String startDateArg, int numArg){   // Constructor initializes each attribute
        name = nameArg;
        code = codeArg;
        startDate = startDateArg;                       // Args here are local
        numberOfStudents = numArg;                      // In my setters I end 
        count ++;                                       // up using the same 
    }                                                   // variable names as here
    
    @Override
    public String toString(){
        return "Code: " + code + "\n" +
                "Name :" + name + "\n"; }
                
    
    @Override
    public boolean equals(Object o){                // Object is the method parameter
        if(this == o){
            return true;
        }
        
        if(! (o instanceof Course))
            return false;
        
        Course p = (Course) o;
        if( p.code == this.code){           
            return true;
        }
        else return false;
    }
    
    void setName(String nameArg){               // Setters have parameters sent
        this.name = nameArg;                    // from outside the class
    }
    
    void setCode(String codeArg){
        this.code = codeArg;
    }
    
    void setStartDate(String dateArg){
        this.startDate = dateArg;
    }
    
    void setNumOfStudents(int numArg){
        this.numberOfStudents = numArg;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public String getStartDate(){
        return this.startDate;
    }
    
    public int getNumOfStudents(){
        return this.numberOfStudents;
    }
}
