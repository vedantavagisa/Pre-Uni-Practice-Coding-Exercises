'''
Purpose:
* Given a list of words, make a dict that counts the occurrence of the words and output it
* The goal is to become familiar with the methods of Dicts
'''

words = ["apple", "banana", "apple", "orange", "banana", "apple"]

wordList = {}

for entry in words:
    if (entry in wordList):
        counter = wordList.get(entry)
        wordList.update({entry: counter +1})
    else:
        wordList.update({entry: 1})

for entry in wordList:
    print(f"{entry}: {wordList.get(entry)}")

