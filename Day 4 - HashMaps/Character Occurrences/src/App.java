import java.util.HashMap;
public class App {
    public static void main(String[] args) {
        
        String str = "banana";
        HashMap<Character, Integer> hash = new HashMap<>();

        System.out.println("The word is " + str);

        for (int i = 0; i < str.length(); i++) {
            if (hash.containsKey(str.charAt(i))) {
                hash.put(str.charAt(i), hash.get(str.charAt(i))+1);
            } else {
                hash.put(str.charAt(i), 1);
            }
        } for (var iterator : hash.entrySet()) {
            System.out.println("Number of occurrences of '" + iterator.getKey() + "': " + iterator.getValue());
        }
    }
}
