/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chris
 */
public class Problem5 {
    
    //array of words
    private String[] words;
    
    //array of first letter indexes
    private int[] indexes;
    
    /**
     * initializes Problem 5, loads the word from the file and stores the
     * indexes of the first letters
     */
    public Problem5() {
        
        //initializes the index array to hold 26 entries
        indexes = new int[26];
        
        //loops over the index array setting the values to -1
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = -1;
        }
        
        //opens the file
        try (BufferedReader rd = new BufferedReader(new FileReader("wordlist.txt"))) {
            
            //initializes the array of words
            words = new String[NUMBER_OF_WORDS];
            
            //counts the number of lines loaded
            int i = 0;
            
            //stores the current line
            String line;
            
            //loop while there exists another line and the array is not full
            while ((line = rd.readLine()) != null && i < NUMBER_OF_WORDS) {
                //add the line to the words array
                words[i] = line;
                
                //get the first character
                char start = line.charAt(0);
                
                //find the index of the character (i.e. 0 for a, 1 for b ...)
                int index = start - 'a';
                
                //if the index is equals to -1, (if we have not written to it yet) assign the current value to it
                if (indexes[index] == -1) indexes[index] = i;
                
                //inc the line counter
                i++;
            }
            
         //catch file exceptions
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Problem5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Problem5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * searches the word list for the term. finds the range of the list to use,
     * using the character indexes, then calls the private binarySearch Method
     * @param term
     * @return the index of the term
     */
    public int search(String term) {
        //get the first letter of the search term
        char first = term.charAt(0);
        
        //get the index of the start of the words the start with the first letter
        int start = indexes[first - 'a'];
        
        //if the index is empty return -1 for not found
        if (start == -1) return -1;
        
        //set the end to -1
        int end = -1;
        
        //loop until end != 1
        for (int i = 1; end == -1; i++) {
            //get the index of the next letter
            int index = (first - 'a') + i;
            
            //if index excedes 26 return -1 "error"
            if (index >= 26) {
                end = words.length - 1;
                break;
            }
            
            //set end equal to the value at the index
            end = indexes[index];
        }
        
        //call binary search on the section and return the result
        return binarySearch(start, end, term);
        
    }
    
    /**
     * Private recursive binary search algorithm
     * @param start the start of the range to search
     * @param end the end of the range to search
     * @param term the term to search from
     * @return the index of the term, if found, else -1
     */
    private int binarySearch(int start, int end, String term) {

        //error case, the term cannot be found
        if (end < start) return -1;
        
        //find the midpoint
        int index = (start + end) / 2;
        
        //get the direction we need to travel (compare the term to the item at the midpoint)
        int direction = term.compareTo(words[index]);
                
        //if the term and the value are equal, return the index
        if (direction == 0) {
            return index;
        } else if (direction < 0) {
            //if the value is greater than the term, continue to the lower half
            return binarySearch(start, index - 1, term);
        } else { //direction > 0
            //else continue to the upper half
            return binarySearch(index + 1, end, term);
        }
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem5 problem = new Problem5();
        
        System.out.println(problem.search("ebay"));//26536

    }
    
    public static int NUMBER_OF_WORDS = 100_000;
    
}
