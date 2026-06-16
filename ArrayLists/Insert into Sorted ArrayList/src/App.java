/**
 * Purpose: Given a sorted ArrayList and an int, insert the int "in order" so the ArrayList is still sorted.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        
        //generate an ArrayList
        ArrayList<Integer> numbers = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(rand.nextInt());
        } Collections.sort(numbers);

        //make the integer
        int insert = rand.nextInt();

        System.out.println("The ArrayList is " + numbers.toString());
        System.out.println("The number to be inserted is " + insert);

        //the actual content
        boolean inserted = false;
        for (int i = 0; i < numbers.size()-1; i++) {
            if (insert > numbers.get(i) && insert < numbers.get(i+1)) {
                numbers.set(i+1, insert);
                inserted = true;
            }
        } if (!inserted) {
            numbers.add(insert);
        }

        System.out.println("The ArrayList after inserting is now " + numbers.toString());
    }
}
