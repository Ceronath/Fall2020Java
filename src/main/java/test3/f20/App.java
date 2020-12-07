/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.f20;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jorda
 */
public class App {
    ArrayList<Course> courses = new ArrayList<Course>();
    private Scanner input = new Scanner(System.in);
    boolean loop = true;
    private String menu = "" + 
            "1. Add a course\n" + 
            "2. Edit a course\n" +
            "3. List courses\n" + 
            "Enter a choice: \n";
    
    private void addCourse(){
        String nameChoice;
        String codeChoice;
        String dateChoice;
        int numStudents;
        
        out.println("Please enter the name of the course: \n");
        nameChoice = input.next();
        out.println("Please enter the course code: \n");
        codeChoice = input.next();
        out.println("Please enter the start date: \n");
        dateChoice = input.next();
        out.println("Please enter the number of students: ");
        numStudents = input.nextInt();
        
        Course newCourse = new Course(nameChoice, codeChoice, dateChoice, numStudents);
        courses.add(newCourse);
    }
    
    private void editCourse(){
        int indexChoice;
        String nameChoice;
        String codeChoice;
        String dateChoice;
        int numStudents;
        
        out.println("Which course would you like to edit? \n");
        indexChoice = input.nextInt();
        
        out.println("Please enter the name of the course: \n");
        nameChoice = input.next();
        courses.get(indexChoice).setName(nameChoice);
        out.println("Please enter the course code: \n");
        codeChoice = input.next();
        courses.get(indexChoice).setCode(codeChoice);
        out.println("Please enter the start date: \n");
        dateChoice = input.next();
        courses.get(indexChoice).setStartDate(dateChoice);
        out.println("Please enter the number of students: ");
        numStudents = input.nextInt();
        courses.get(indexChoice).setNumOfStudents(numStudents);
    }
    
    private void listCourses(){
        for (int i = 0; courses.get(i) != null;i++){
            out.println("Course #: " + i);
            
            out.println("Course name: ");
            out.println(courses.get(i).getName());
            
            out.println("Course code: ");
            out.println(courses.get(i).getCode());
            
            out.println("Course start date: ");
            out.println(courses.get(i).getStartDate());
            
            out.println("Number of students: ");
            out.println(courses.get(i).getNumOfStudents());
        }
    }
    void run() {
        while(loop == true){
            out.println(menu);
            
            int choice;
            try{
                choice = input.nextInt();
            } catch(Exception e) {
                out.println("Incorrect input.");
                continue;
            }
            
            switch(choice){
                case 1: addCourse();
                        break;
                case 2: editCourse();
                        break;
                case 3: listCourses();
                        break;
                default: out.println("Input incorrect. Try again.");
            }       
        }
        
        
    }
    
}
