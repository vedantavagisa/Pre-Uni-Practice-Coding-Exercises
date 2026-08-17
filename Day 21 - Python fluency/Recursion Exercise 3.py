def permutations(string, passemot):
    '''initial thoughts:
    for i in range(len(string)):
        if (i != n):
            passemot = f"{passemot}{string[i]}"
            print(passemot)
    if (n < len(string)-1):
        permutations(n+1, string, f"{passemot}{string[n+1]}")

    what i did for the java method:
        if (ogStr.length()==1) {
        System.out.println(output + ogStr);
        } else {
            for (int i = 0; i < ogStr.length(); i++) {
                generatePermutations(ogStr.replaceFirst(String.valueOf(ogStr.charAt(i)), ""), output + ogStr.charAt(i));
            }
        }
        '''

            # new python based on translating java pseudocode
    if (len(string)==1):
        print(f"{passemot}{string}")
    else:
        for i in range(len(string)):
            permutations(string.replace(string[i], ""), passemot + string[i])

string = "ABCD"
permutations(string, "")