/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manxboy
 */
public class Problem5Test {
    @Test
    public void testSearch() {
        Problem5 problem = new Problem5();
        
        
        assertEquals(problem.search("ebay"), 26536);
        
        
        assertEquals(problem.search("a"), 0);
        
        
        assertEquals(problem.search("zzzz"), 99999);
        
        
        assertEquals(problem.search("nonexistant"), -1);
        
        
        assertEquals(problem.search("wilson"), 97383);
        
    }
}
