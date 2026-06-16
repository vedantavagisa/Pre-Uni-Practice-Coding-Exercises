/**
 * Purpose: Given an unsorted ArrayList, output the list with no duplicates (without using hashSets) 
 */
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        
        int[] list = {1, 2, 2, 3, 1, 4, 1, 1, 1, 4, 2, 3, 5, 8};

        ArrayList<Integer> noDuplicates= new ArrayList();
        
        for (int i = 0; i < list.length; i++) {
            if (!noDuplicates.contains(list[i])) {
                noDuplicates.add(list[i]);
            }
        }

        System.out.println("The array without duplicates is " + noDuplicates.toString());
    }
}
