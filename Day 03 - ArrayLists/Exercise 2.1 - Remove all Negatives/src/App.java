/**
 * Purpose: Remove all negatives from an ArrayList
 */

import java.util.ArrayList; 
import java.util.Random;
public class App {
    public static void main(String[] args) {
        
        //initialize the arraylist
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 0; i < 20; i++) {
            numbers.add(rand.nextInt());
        }

        System.out.println("The ArrayList is " + numbers.toString());

        //the actual content
        /**
         * this cycles through the arraylist for as long as elements exist
         * it checks if the element at that index is negative.
             * if so, it removes the element and KEEPS the index
             * if not, it increases the index
         */
        int i = 0; 
        while (numbers.size() > i) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }

        System.out.println("The ArrayList without negatives is " + numbers.toString());
    }
}
