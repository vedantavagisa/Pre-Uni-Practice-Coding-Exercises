# Purpose: Using two-pointers, reverse a list

def reverse(arr):
    left = 0
    right = len(arr) - 1
    while(left <= right):

        temporary = arr[left]
        arr[left] = arr[right]
        left += 1
        arr[right] = temporary
        right -= 1

arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
reverse(arr)
for element in arr:
    print(element)