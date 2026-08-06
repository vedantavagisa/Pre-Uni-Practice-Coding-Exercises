# This is a random code file that I made to revise python

print("Hello World!")
print("What is your name?")
name = input()
for i in range (3):
    print("Hello " + name)

n = int(input("enter a num "))
def fib(n):
    if (n <= 1):
        print(1)
        return 1
    else:
        x = fib(n-1) + fib(n-2)
        print(x)
        return x
print("the", n, "th fibonnaci number is", fib(n))

def fact (n):
    if (n <= 1):
        return 1
    else:
        x = n*fact(n-1)
        print (f"the {n}th factorial is {x}")
        return x


print(fact(n))