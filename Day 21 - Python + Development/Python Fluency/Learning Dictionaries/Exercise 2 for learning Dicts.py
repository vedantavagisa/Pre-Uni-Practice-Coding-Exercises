'''
Purpose:
* Given a dict representing a priceList, find the total cost of all the items. Also check what happens if a user wants something that isn't in the priceList
'''

priceList = {
        "apple": 0.99,
        "banana": 0.59,
        "milk": 3.49,
        "bread": 2.99
}

for entry in priceList.items():
        print(entry)

total = 0
for item, price in priceList.items():
        total += price
print(f"The total after 13% tax is ${round(total*1.13, 2)}");

userDesire = "yes"
while (userDesire == "yes"):
        print("What item would you like to know the price of?\n Press \"none\" if you would like to exit.")
        userInput = input()
        if userInput in priceList:
                print(f"The price of {userInput} is {priceList.get(userInput)}")
        elif userInput == "none":
                print("Okay! Thanks for shopping.")
                userDesire = "no"
        else:
                print(f"Warning: {userInput} is not in the items list.")
