'''
Purpose:
* Reverse a String recursively
* Understand recursion and miscellaneous stuff for Python
'''
def fx(x, text):
    print(text[x - 1: x])
    if (x > 0):
        return fx(x-1, text)
    # unlike Java, functions in python don't require a return value and so therefore this is not necessary a void nor non-void function

text = "कृष्णदेव वेदान्तवागीश" #change the string here
fx(len(text), text)