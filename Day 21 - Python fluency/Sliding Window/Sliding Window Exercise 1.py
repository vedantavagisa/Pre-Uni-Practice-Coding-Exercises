#Purpose: given an array, output the maximum sum of that array

def maxSum(arr, k):
    sum = 0
    for i in range(k):
        sum += arr[i]
    temporary = sum
    #now time to slide through the window
    for i in range(len(arr)-k):
        temporary -= arr[i]
        temporary += arr[i+k]
        if (temporary > sum):
            sum = temporary
    return sum

arr = [1, 6, 1, 33, 2, 6, 1, 7, 4]
k = 3
print(f"The list is {arr}")
print(f"The maximum sum of the list is {maxSum(arr, k)}")