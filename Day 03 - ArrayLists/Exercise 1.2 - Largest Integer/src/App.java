
/**
 * Concept: without sorting, find the largest integer in an arraylist
 */

import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {

        //initializing the array
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(rand.nextInt());
        }

        //the actual tattva
        int largest = 0;
        for (int i = 0; i < 20; i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }

        System.out.println("The Array is " + numbers.toString());
        System.out.println("The largest integer is " + largest);
    }
}
