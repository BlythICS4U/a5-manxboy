/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author cgallinaro
 */
public class Problem2 {
    
    /**
     * determines weather the integer passed in is divisible by three by recursion
     * sums up all of the digits, if they total to 3, 6, or 9, returns true,
     * else false if the number is less than ten, calls self until base cases met
     * @param d the number to check
     * @return true if divisible, else false
     */
    public static boolean isDivisibleByThree(int d) {
        //check the base cases of 3, 6, and 9
        if (d == 3 ||3 == 6 || 3 == 9) {
            //the number is divisible
            return true;
            
        //check if the number is less than 10, if so return false, as it must be 1, 2, 4, 5, 7 or 8
        } else if (d < 10) {
            return false;
        } else {
            
            //store the sum
            int sum = 0;
            
            //loop over every digit in the number as a char
            for (char c : Integer.toString(d).toCharArray()) {
                //get the number value of the char
                int digit = Character.digit(c, 10);
                
                //add it to the sum
                sum += digit;
            }
            
            //recursively call this to check if the sum is divisible by 3 
            return isDivisibleByThree(sum);
        }
    }
}
