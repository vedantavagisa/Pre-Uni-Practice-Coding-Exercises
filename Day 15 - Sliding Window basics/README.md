# Day 15: Sliding Window problems
Today was a fun day, even though it was spread across many days.
## ChatGPT link:
Here is a link to the ChatGPT conversation detailing my progress across all days: https://chatgpt.com/share/6a6cf0db-a504-83ea-8981-6b0dbe32e61c
## Exercises
Here are the exercises:
### Exercise 1: Brute force 
**Maximum Sum of a Subarray of Size k**

Given an array of integers and an integer `k`, find the maximum sum of any contiguous subarray of length `k`.

Example:
```
arr = [2, 1, 5, 1, 3, 2]
k = 3
Answer: 9
```
because
```2+1+5 = 8
1+5+1 = 7
5+1+3 = 9
1+3+2 = 6
```
**Goal: Write the obvious O(nk) solution.**
### Exercise 2: Can You Avoid Recomputing?
**Maximum Sum of a Subarray of Size k**

Now ask yourself: When I move from ```[2,1,5]``` to ```[1,5,1]```, why am I adding all three numbers again?

Can you somehow update the sum instead?

If you can, you've discovered the sliding window yourself.

Target complexity: ```O(n)```
### Exercise 3: Maximum Average
Same idea.

Given an array and k, return the maximum average of any contiguous subarray of size k.

Example:
```
arr = [1,12,-5,-6,50,3]
k = 4
Answer = 12.75
```
Nothing new algorithmically.

The goal is to convince yourself the window isn't only for sums.
### Exercise 4: First Negative Number in Every Window
Now the window becomes more interesting.

Example
```
arr = [12,-1,-7,8,-15,30,16,28]
k = 3
```
Output: ```[-1,-1,-7,-15,-15,0]```

Explanation:
```
[12,-1,-7] -> -1

[-1,-7,8] -> -1

[-7,8,-15] -> -7

[8,-15,30] -> -15

[-15,30,16] -> -15

[30,16,28] -> none -> 0
```
This is where you'll probably realize "I need to remember information about what's inside the window."

That idea appears constantly in interview problems.

(Hint: a queue is useful.)

### Exercise 5 — Longest subarray with sum ≤ K (Variable-size Sliding Window)

Given an array of positive integers and an integer `k`, find the length of the longest contiguous subarray whose sum is less than or equal to `k`.

Example:
```
int[] arr = {2, 1, 5, 1, 3, 2};
int k = 7;
```
Output: ```4```

Explanation:

The valid windows are:
```
[2,1]       sum = 3
[2,1,5]     sum = 8 ❌
[5,1]       sum = 6
[5,1,3]     sum = 9 ❌
[1,3,2]     sum = 6
[2,1,5,1]   sum = 9 ❌
```
The longest valid one is:
```
[1, 5, 1]
```

**Constraints:**
Assume:
```
All numbers are positive.
arr.length >= 1.
```
**Why this is Exercise 5**

This is the first time the window size is not fixed.

Previously:

Window size = k

You always did:

```text 
remove one
add one
```
Now the window can:
```text
expand when the sum is okay,
shrink when the sum becomes too large.
```
The sliding window idea changes from: ```"Move a fixed window."``` to: ```"Maintain a valid window."```