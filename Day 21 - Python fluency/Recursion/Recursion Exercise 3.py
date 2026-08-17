def permutations(string, passemot):

    if (len(string)==1):
        print(f"{passemot}{string}")
    else:
        for i in range(len(string)):
            permutations(string.replace(string[i], ""), passemot + string[i])

string = "ABCD"
permutations(string, "")