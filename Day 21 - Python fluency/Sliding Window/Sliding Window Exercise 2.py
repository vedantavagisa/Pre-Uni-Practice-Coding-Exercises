#Purpose: Given a list and a target k, output the length of the largest subarray whose sum <= k

def slide(arr, k):

    '''pseudocode:
    - sum as much as you can before hitting k
    - after that, remove the first element and repeat the same process
    '''

    left = 0
    right = 0
    tempsum = 0
    templength = 0
    length = 0
    #code to expand
    while (right < len(arr)):
        tempsum += arr[right]
        right += 1
        #code to shrink
        while (tempsum > k):
            tempsum -= arr[left]
            left += 1
        templength = right - left
        if (templength > length):
            length = templength
    return length

arr = [4, 1, 6, 2, 6, 3, 6]
k = 8
print(f"The list is {arr}")
print(f"The greatest sublength of a subarray whose sum is less than or equal to {k} is {slide(arr, k)}")
