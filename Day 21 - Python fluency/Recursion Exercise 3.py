def permutations(n, string, passemot):
    for i in range(len(string)):
        if (i != n):
            passemot = f"{passemot}{string[i]}"
            print(passemot)
    if (n < len(string)-1):

        permutations(n+1, string, f"{passemot}{string[n+1]}")

string = "ABCD"
print(permutations(0, string, f"{string[0]}"))