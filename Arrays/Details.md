I asked ChatGPT to generate some HashMap exercises. Here is what it says.

# PROMPT: 
Give me a problem to test my understanding of 1D arrays. Then give me 2D array problems.

I want to practice my Java.

# RESPONSE: 
Great idea. I'll start with a 1D array problem to gauge your current level, then I'll give several 2D array problems that increase in difficulty.

## 1D Array Test Problem

**Problem: Find the Second Largest Number**

Write a Java method that returns the second largest **distinct** value in an integer array.

### Example

```java
int[] arr = {7, 3, 9, 2, 9, 5};
```

Output:

```java
7
```

Because the largest distinct number is `9`, and the second largest distinct number is `7`.

### Requirements

* Do not sort the array.
* Traverse the array only once if possible.
* Assume the array contains at least two distinct values.

**Method signature**

```java
public static int secondLargest(int[] arr)
```

---

## 2D Array Problems

### Problem 1: Sum Each Row

Given a 2D array, print the sum of each row.

### Example

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Output:

```
Row 0: 6
Row 1: 15
Row 2: 24
```

---

### Problem 2: Find the Largest Element

Find and return the largest value in a 2D array.

### Example

```java
int[][] matrix = {
    {3, 7, 1},
    {9, 2, 4},
    {5, 8, 6}
};
```

Output:

```java
9
```

---

### Problem 3: Sum of Main Diagonal

Given a square matrix, find the sum of the main diagonal.

### Example

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Main diagonal:

```
1 + 5 + 9
```

Output:

```java
15
```

---

### Problem 4: Count Even Numbers

Count how many even numbers exist in the entire 2D array.

### Example

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Output:

```java
3
```

---

### Problem 5: Matrix Transpose

Create a new matrix that is the transpose of the original matrix.

### Example

Input:

```java
{
    {1, 2, 3},
    {4, 5, 6}
}
```

Output:

```java
{
    {1, 4},
    {2, 5},
    {3, 6}
}
```

---

### Problem 6: Find the Row With the Largest Sum

Given:

```java
int[][] matrix = {
    {1, 2, 3},
    {10, 1, 1},
    {4, 4, 4}
};
```

Row sums:

```
6
12
12
```

Return the index of the first row with the maximum sum.

Output:

```java
1
```

---

### Challenge Problem: Saddle Point

A saddle point is an element that is:

* The smallest value in its row, and
* The largest value in its column.

Given:

```java
int[][] matrix = {
    {3, 1, 3},
    {4, 2, 5},
    {6, 0, 7}
};
```

Determine whether a saddle point exists and print its value.

---

If you solve the 1D problem, I can review your code and then give you a set of **AP Computer Science A–style 2D array questions** that are closer to what might appear on tests and exams.
