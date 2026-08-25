#Purpose: Given a sorted list and a target, output the indices of the two elements that sum to the target

def twoSum(arr, target):
    left = 0
    right = len(arr) - 1
    while (left < right):
        sum = arr[left] + arr[right]
        if (sum > target):
            right -= 1
        elif (sum < target):
            left += 1
        else:
            return left, right
    return -1, -1

arr = [3, 1, 7, 12, 87, 2, 7]
arr.sort()
target = 6
print(f"The array is {arr} and the target is {target}")
answers = twoSum(arr, target)
if (answers[0] != -1):
    print(f"The indices of the two numbers are {answers}")
else:
    print(f"Sorry, there are no numbers in the list that sum to {target}")
