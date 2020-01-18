/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author manxboy
 */
public class PersonTest {
    
    private static Person apple;
    private static Person open;
    private static Person dead;
    private static Person ziglo;
    
    @BeforeClass
    public static void setup() {
        apple = new Person("appl3");
        open = new Person("open");
        dead = new Person("de@d");
        ziglo = new Person("z1glo");
    }
    
    @Test
    public void testCompareTo() {
        
        assertTrue(apple.compareTo(open) < 0);
        
        assertTrue(apple.compareTo(ziglo) < 0);
        
        assertTrue(ziglo.compareTo(apple) > 0);
        
        assertTrue(dead.compareTo(ziglo) < 0);
    }
    
    
    @Test
    public void testSort() {
        Person[] people = {ziglo, open, dead, apple};
        
        Person[] correct = {apple, dead, open, ziglo};
        
        Person.sort(people);
        
        assertArrayEquals(people, correct);
    }
}
