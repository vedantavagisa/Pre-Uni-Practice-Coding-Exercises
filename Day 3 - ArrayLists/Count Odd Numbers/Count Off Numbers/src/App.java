/** 
 * Concept: there is an arraylist and count the number of odd numbers in the arraylist
*/

import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) {

        //initializing the array
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(rand.nextInt());
        }

        //counting the occurences of odd numbers
        int oddCount = 0;
        for (int i = 0; i < 20; i++) {
            if (numbers.get(i)%2 == 0) {
                oddCount++;
            }
        } 
        System.out.println("Here is the array: " + numbers.toString());
        System.out.println("There are " + oddCount + " odd numbers.");
    }
}
