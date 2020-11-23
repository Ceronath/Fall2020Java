/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4b_test;

import Lab4b.Car;
import Lab4b.App;

import java.util.*;
import static java.lang.System.out;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class lab4b_tester {
    Car car1 = new Car("Ford", "Mustang", 2019, 1234);
    Car car2 = new Car("Ford", "Mustang", 2019, 12345);
    Car car3 = new Car("Ford", "Mustang", 2019, 1234);
    Car car4 = car1;

    
    @Before
    public void setup(){
        App.addTest(new Car("Ford", "Mustang", 2019, 1234123));
        App.addTest(new Car("Ford", "Mustang", 2019, 1234123));
        App.addTest(new Car("Ford", "Mustang", 2019, 1234123));
        App.addTest(new Car("Ford", "Mustang", 2019, 1234123));
        App.addTest(new Car("Ford", "Mustang", 2019, 1234123));
        
    }
    
    @Test
    public void test1(){
        assertEquals("car1 == car4", car1, car4);
    }
    
    @Test
    public void test2(){
        assertNotEquals("car1 != car2", car1, car2);
    }
    
    @Test
    public void test3(){
        assertEquals("car1 == car3", car1, car3);
    }
    
    @Test
    public void addTest(){
        assertNotNull(App.getCarTest(0));
        assertNotNull(App.getCarTest(1));
        assertNotNull(App.getCarTest(2));
        assertNotNull(App.getCarTest(3));
        assertNotNull(App.getCarTest(4));
    }
    
    @Test
    public void deleteTest(){
        assertNull(App.deleteCarTest(0));
        assertNull(App.deleteCarTest(1));
        assertNull(App.deleteCarTest(2));
        assertNull(App.deleteCarTest(3));
        assertNull(App.deleteCarTest(4));
    }
    
}
