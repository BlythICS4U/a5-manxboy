/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author manxboy
 */
public class Problem4Test {
    
    @Test
    public void testSort() {
        int[] data = {40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};
        
        Problem4.sort(data);
        
        System.out.println(Arrays.toString(data));
        
        assertArrayEquals(data, new int[] {-1, 0, 1, 2, 3, 3, 4, 40, 42, 43, 58, 65});
        
    }
}
