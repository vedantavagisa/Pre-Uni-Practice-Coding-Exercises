
'''
- Purpose: Given a HashMap containing prices of specific items and a ArrayList containing a shopping list, output the total subtotal
 - Comment: what if there is an element on the shoppping list that is not on the pricelist? what if vice versa? Account for a NullPointerException on Line 32

        #Below is the java code
        HashMap<String, Double> priceList = new HashMap<>();
        priceList.put("apple", 0.99);
        priceList.put("banana", 0.59);
        priceList.put("milk", 3.49);
        priceList.put("bread", 2.99);
        for (var entry : priceList.entrySet()) {
            System.out.println(entry.getKey() + " costs $" + entry.getValue());
        }


        initializing and printing the shoppinglist
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
'''


pricelist = {
        "apple": 0.99,
        "banana": 0.59,
        "milk": 3.49,
        "bread": 2.99
}

for entry in pricelist.items():         #interesting, there is absolutely no range needed here because it iterates through each key and not through indices. that's the thing about hashmaps that i forgot
        print(entry)

total = 0
for item, price in pricelist.items():
        total += price
print(f"The total after 13% tax is ${round(total*1.13, 2)}");