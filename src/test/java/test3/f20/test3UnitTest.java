/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.f20;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import test3.f20.Course;
import test3.f20.App;
/**
 *
 * @author jorda
 */
public class test3UnitTest {
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test1(){
        Course course1 = new Course("Java 1", "CSD211", "09/08/2020", 25);
        Course course2 = new Course("Java 1", "CSD211", "09/08/2020", 25);
        assertEquals("course1 == course2", course1, course2);
    }
    
    public void test2(){
        Course course3 = new Course("Java 1", "CSD211", "09/08/2020", 25);
        Course course4 = new Course("Database Modelling", "CSD210", "09/08/2020", 25);
        assertEquals("course3 != course 4", course3, course4);
    }
}
