/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

/**
 *
 * @author cgallinaro
 */
public class Problem4 {
    
    
    /**
     * Runtime Complexity : O(n^2)
     * @param data 
     */
    public static void sort(int[] data) {
        
        //loop over all entries backwards
        for (int i = data.length - 1; i >= 1; i--) {
            
            //store the best value and best index
            int best_index = -1;
            int best_value = -1;
            
            //loop backwards starting from i
            for (int j = i; j >= 0; j--) {
                        
                //store the current index if the value at the index is better than the current value/index stored
                if (data[j] > best_value) {
                    best_index = j;
                    best_value = data[j];
                }
            }
            
            //swap the best index with the current index
            data[best_index] = data[i];
            data[i] = best_value;
        }
        
    }
}
