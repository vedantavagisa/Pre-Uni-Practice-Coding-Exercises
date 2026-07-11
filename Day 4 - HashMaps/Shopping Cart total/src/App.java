/**
 * Purpose: Given a HashMap containing prices of specific items and a ArrayList containing a shopping list, output the total subtotal
 * Comment: what if there is an element on the shoppping list that is not on the pricelist? what if vice versa? Account for a NullPointerException on Line 32
*/

import java.util.ArrayList;
import java.util.HashMap;
public class App {
    public static void main(String[] args) {

        //initializing and printing the pricelist
        HashMap<String, Double> priceList = new HashMap<>();
        priceList.put("apple", 0.99);
        priceList.put("banana", 0.59);
        priceList.put("milk", 3.49);
        priceList.put("bread", 2.99);
        for (var entry : priceList.entrySet()) {
            System.out.println(entry.getKey() + " costs $" + entry.getValue());
        }

        //initializing and printing the shoppinglist
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("apple");
        shoppingList.add("apple");
        shoppingList.add("milk");
        shoppingList.add("bread");
        System.out.print("The shopping list is ");
        System.out.println(shoppingList.toString());

        double subtotal = 0;
        for (int i = 0; i < shoppingList.size(); i++) {
            subtotal+= priceList.get(shoppingList.get(i));
        } System.out.println("The subtotal of the shopping list is $" + subtotal);
    }
}
