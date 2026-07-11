/**
 * Purpose: Given a String, split it and count the number of occurrences of each word.
 * */
import java.util.HashMap;
public class App {
    public static void main(String[] args) {
        String text = "the cat sat on the mat the cat";
        HashMap<String, Integer> hashmap = new HashMap<>();
        String[] aaaaaa = text.split(" ");
        for (int i = 0; i < aaaaaa.length; i++) {
            if (hashmap.containsKey(aaaaaa[i])) {
                hashmap.put(aaaaaa[i], hashmap.get(aaaaaa[i])+1);
            } else {
                hashmap.put(aaaaaa[i], 1);
            }
        } for (int i = 0; i < hashmap.size(); i++) {
            System.out.println(hashmap.toString());
        }
    }
}