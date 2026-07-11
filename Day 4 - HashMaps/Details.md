I asked ChatGPT to generate some HashMap exercises. Here is what it says.

# PROMPT: 
Give me some practice problems for me to practice HashMaps in Java. I want about 5 exercises so I can check my understanding.

# RESPONSE: 
Here are 5 HashMap exercises ordered roughly from easier to harder. Try to solve them without looking anything up first.

---

## 1. Word Frequency Counter

Write a program that counts how many times each word appears in a sentence.

### Example Input

```text
the cat sat on the mat the cat
```

### Example Output

```text
the -> 3
cat -> 2
sat -> 1
on -> 1
mat -> 1
```

### Requirements

* Split the sentence into words.
* Use a `HashMap<String, Integer>`.
* If a word already exists, increment its count.
* Otherwise, add it with count 1.

### Methods to Practice

```java
containsKey()
put()
get()
```

---

## 2. Student Grades

Create a gradebook using a `HashMap`.

### Sample Data

```java
Alice -> 87
Bob -> 92
Charlie -> 78
Diana -> 95
```

### Tasks

1. Add the students and grades to a `HashMap`.
2. Print Bob's grade.
3. Change Alice's grade to 90.
4. Print all students and grades.

### Expected Concepts

* Retrieving values
* Updating existing entries
* Iterating through the map

---

## 3. Character Frequency

Count how many times each character appears in a string.

### Example Input

```text
banana
```

### Example Output

```text
b -> 1
a -> 3
n -> 2
```

### Requirements

* Use a `HashMap<Character, Integer>`.
* Ignore spaces if you want an extra challenge.

### Extension

Find the most common character.

Example:

```text
Most common: a (3 times)
```

---

## 4. Shopping Cart Total

You are given:

```java
HashMap<String, Double> prices
```

containing:

```java
apple -> 0.99
banana -> 0.59
milk -> 3.49
bread -> 2.99
```

And an ArrayList:

```java
["apple", "apple", "milk", "bread"]
```

### Task

Calculate the total cost of the cart.

### Expected Output

```text
Total: $8.46
```

### Concepts

* Using a HashMap as a lookup table.
* Combining `ArrayList` and `HashMap`.

---

## 5. Reverse Lookup (Harder)

Given:

```java
Alice -> 87
Bob -> 92
Charlie -> 78
Diana -> 95
Ethan -> 92
```

### Task

Find all students who got a specific grade.

For example, if the user enters:

```text
92
```

Output:

```text
Bob
Ethan
```

### Challenge

Create a second map that groups students by grade:

```java
92 -> [Bob, Ethan]
87 -> [Alice]
78 -> [Charlie]
95 -> [Diana]
```

This requires:

```java
HashMap<Integer, ArrayList<String>>
```

and is excellent practice for nested collections.

---

## Bonus Challenge (Interview-Style)

Given:

```java
int[] nums = {2, 7, 11, 15};
int target = 9;
```

Find two numbers that add up to the target.

Output:

```text
2 + 7 = 9
```

Try solving this in **O(n)** using a `HashMap<Integer, Integer>`.

This is a classic problem because it teaches the main superpower of hash maps: **fast lookup**.

---

If you can solve all 5 comfortably (especially #5 and the bonus), you're probably at the point where HashMaps are no longer just a topic you know, but a tool you can naturally reach for when solving problems.
