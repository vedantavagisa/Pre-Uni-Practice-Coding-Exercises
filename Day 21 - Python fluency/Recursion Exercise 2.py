'''
Purpose:
* Recreate the reverse binary string project that I made in Java
* This is the first branched recursion exercise
'''
def binString(num, string):
    if num == 1:
        print(f"{string}{0}")
        print(f"{string}{1}")
    else:
        binString(num - 1, f"{string}{0}")
        binString(num - 1, f"{string}{1}")
binString(3, "")