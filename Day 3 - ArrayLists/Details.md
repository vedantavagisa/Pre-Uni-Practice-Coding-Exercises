I asked ChatGPT to generate some ArrayList exercises. Here is what it says.

# PROMPT: 
Generate some ArrayList practice exercises.
# RESPONSE: 
Since you've already gotten comfortable with arrays and basic 2D arrays, I'd focus on exercises that teach what makes `ArrayList` different:

* Dynamic size
* Insertion/removal
* Searching
* Working with objects
* Using multiple collections together

Here's a progression.

---

# Level 1: Learn the Basics

### 1. Even Number Counter

Create an `ArrayList<Integer>` containing 20 random integers from 1–100.

Count how many are even.

Example:

```java
[12, 7, 9, 18, 24]
```

Output:

```text
3 even numbers
```

---

### 2. Find the Largest Value

Without sorting, find the largest integer in an `ArrayList<Integer>`.

---

### 3. Average Calculator

Calculate the average of all numbers in an `ArrayList<Double>`.

---

### 4. Count Occurrences

Given:

```java
[5, 2, 5, 7, 5, 1]
```

Count how many times `5` appears.

Output:

```text
3
```

---

# Level 2: Learn What Makes ArrayLists Special

### 5. Remove All Negatives

Given:

```java
[5, -2, 8, -4, 3]
```

Remove all negative values.

Result:

```java
[5, 8, 3]
```

This teaches an important lesson: removing elements while iterating.

---

### 6. Insert in Order

Given a sorted list:

```java
[1, 4, 7, 10]
```

Insert:

```java
5
```

so that the list remains sorted.

Result:

```java
[1, 4, 5, 7, 10]
```

---

### 7. Remove Duplicates

Given:

```java
[1, 2, 2, 3, 1, 4]
```

Produce:

```java
[1, 2, 3, 4]
```

without using a `Set`.

---

# Level 3: Interview-Style Problems

### 8. Rotate a List

Given:

```java
[1, 2, 3, 4, 5]
```

Rotate right by one:

```java
[5, 1, 2, 3, 4]
```

---

### 9. Reverse a List

Given:

```java
[1, 2, 3, 4]
```

Produce:

```java
[4, 3, 2, 1]
```

without using `Collections.reverse()`.

---

### 10. Second Largest Distinct Value

Do the problem you already solved with arrays, but using an `ArrayList<Integer>`.

---

# Level 4: Useful Real Programs

### 11. Student Marks

Create:

```java
ArrayList<Integer> marks
```

Allow the user to enter marks until they type `-1`.

Print:

* Highest mark
* Lowest mark
* Average mark

---

### 12. To-Do List

Menu:

```text
1. Add Task
2. Remove Task
3. View Tasks
4. Exit
```

Store tasks in an `ArrayList<String>`.

This is one of the first genuinely useful ArrayList projects.

---

### 13. Sanskrit Vocabulary Manager

Since you've mentioned wanting to build Sanskrit-related projects:

Store vocabulary words in:

```java
ArrayList<String>
```

Menu:

```text
1. Add word
2. Search word
3. Remove word
4. List all words
```

Example:

```text
Add: धर्म
Add: ज्ञान
Add: योग
```

This is exactly the kind of small project that belongs on GitHub.

---

# Level 5: Combining Concepts

### 14. Matrix Using ArrayLists

Create:

```java
ArrayList<ArrayList<Integer>>
```

Represent:

```text
1 2 3
4 5 6
7 8 9
```

Then compute:

* Row sums
* Column sums
* Largest element

This combines your 2D-array skills with ArrayLists.

---

### 15. Frequency Table

Given:

```java
[1, 1, 2, 3, 2, 1, 4]
```

Print:

```text
1 appears 3 times
2 appears 2 times
3 appears 1 time
4 appears 1 time
```

Without using a `HashMap`.

This is surprisingly good practice for nested loops.

---

# One I Think You'd Enjoy

Try this tomorrow:

### Sanskrit Word Quiz

Store:

```java
ArrayList<String> sanskrit
ArrayList<String> english
```

Example:

```java
sanskrit = ["धर्म", "ज्ञान", "योग"];
english = ["duty", "knowledge", "union"];
```

Randomly choose a Sanskrit word and ask the user for the English meaning.

Keep score.

It combines:

* ArrayLists
* Random numbers
* User input
* Searching
* Simple program structure

and feels like a real application rather than an exercise. That's about the point where programming starts becoming much more fun.
