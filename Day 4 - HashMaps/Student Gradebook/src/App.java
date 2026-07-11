/**
 * Purpose: Record students' grades
*/
import java.util.HashMap;
public class App {
    public static void main(String[] args) {
        
        HashMap<String, Integer> gradebook = new HashMap<>(); 

        //task 1: add the students' grades to a hashmap
        gradebook.put("Alice", 87);
        gradebook.put("Bob", 92);
        gradebook.put("Charlie", 78);
        gradebook.put("Diana", 95);

        System.out.println(gradebook.entrySet());

        //task 2: print bob's grade
        System.out.println("Bob's grade: " + gradebook.get("Bob"));

        //task 3: change alice's grade to 90
        gradebook.put("Alice", 90);

        //task 4: print all students' grades
        for (var entry : gradebook.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
        
    }
}
