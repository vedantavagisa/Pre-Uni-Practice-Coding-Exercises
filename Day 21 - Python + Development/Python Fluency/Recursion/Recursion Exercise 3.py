'''
Purpose:
* Recreate the permutation exercise that I made in Java
* This is the second branched recursion exercise
'''

def permutations(string, passemot):

    if (len(string)==1):
        print(f"{passemot}{string}")
    else:
        for i in range(len(string)):
            permutations(string.replace(string[i], ""), passemot + string[i])

string = input("What string do you want to reverse")
permutations(string, "")