package problem2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manxboy
 */
public class Problem2Test {
    
    @Test
    public void testIsDivisibleByThree() {
        assertEquals(Problem2.isDivisibleByThree(69), true);
        
        assertEquals(Problem2.isDivisibleByThree(15), true);
        
        assertEquals(Problem2.isDivisibleByThree(1952), false);
        
        assertEquals(Problem2.isDivisibleByThree(0), false);
    }
}
