/**
 * Purpose: Given an ArrayList, "rotate" it by a specific number of places.
 */

import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        int rotate = 3;
        for (int i = 0; i < list.size(); i++) {
            //case 1: i + rotate < 20
            //case 2: i + rotate >= 20
        }
    }
}
