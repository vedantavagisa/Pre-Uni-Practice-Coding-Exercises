'''
* Purpose: Given a dict listing an inventory and a list containing orders, do the following:
    * update the inventory if the item exists
    * if the item does not exist, output something accordingly
    * if the item is not in stock, output something accordingly
* This is the hardest "translation" problem that ChatGPT recommended to translate my Java HashMap knowledge to Python's dictionaries.
'''

inventory = {
    "apples": 10,
    "bananas": 5,
    "milk": 1,
    "bread": 7
}

purchases = ["apples", "milk", "apples", "bread", "milk", "milk", "eggs"]

for item in purchases:
    if item in inventory and inventory.get(item) > 0:
        inventory[item] -= 1
        print(f"You have bought the {item}. The current number of {item} remaining is {inventory.get(item)}")
    elif item not in inventory:
        print(f"Sorry, {item} do not exist in the inventory.")
    else:
        print(f"Sorry, {item} is out of stock.")