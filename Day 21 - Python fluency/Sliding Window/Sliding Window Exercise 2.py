#Purpose: Given a list and a target k, output the length of the largest subarray whose sum <= k

def slide(arr, k):

    '''pseudocode:
    - sum as much as you can before hitting k
    - after that, remove the first element and repeat the same process
    '''
    left = 0
    tempsum = 0
    templength = 0 #this is templength
    length = 0
    while (left < len(arr)):
        while (tempsum <= k):
            tempsum += arr[templength]
            templength += 1
        length = templength
        left += 1
    return length

arr = [4, 1, 6, 2, 6, 3, 6]
k = 11
print(f"The list is {arr}")
print(f"The greatest sublength of a subarray whose sum is less than or equal to {k} is {slide(arr, k)}")
