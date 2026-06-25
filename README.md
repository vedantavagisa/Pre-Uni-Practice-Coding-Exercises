Hello!

This is me revising my programming understanding with simple exercises. The eventual goal is to recall the CS knowledge that I learned to prepare for University!

I made the following 60 day plan with Gemini, and I will more-or-less be following it throughout summer:

# The plan
I got into the WLU-based BBA/BCS Double Degree at WLU/UW.

I want to prepare my CS knowledge since I haven't done rigorous CS in maybe 3 years.

I asked AI elsewhere and got the following plan:

This is a 60-day, day-by-day roadmap tailored for your June-to-August timeline. It scales from **1 hour/day** (Days 1–20) while you finish up school commitments, up to **4 hours/day** (Days 21–60) for the heavy summer grind.

To maximize efficiency and keep you hackathon-ready, we are going to tweak the language order slightly: you will use **Python** for your backend and competitive programming, and **JavaScript/HTML/CSS** for your frontend. Learning JavaScript *before* your side project is essential, because it is the actual glue that connects a frontend to a backend API.

---

## Part 1: The Transition Block (Days 1–20)

**Commitment:** 1 hour / day
**Focus:** Revise Java foundations, master pure recursion (critical for your upcoming CS courses), and keep math fresh.

* **Day 1:** Map out your environment. Ensure you have an IDE (like IntelliJ or VS Code) set up. Write a quick Java program to test execution.
* **Day 2:** Arrays vs. Memory. Review how 1D and 2D arrays are stored in memory. Practice multi-dimensional array manipulation.
* **Day 3:** Array Lists. Implement an array resizing logic manually to understand what `ArrayList` does under the hood.
* **Day 4:** HashMaps & Sets. Learn how key-value pairs work. Solve 3 basic frequency-counting problems using a `HashMap`.
* **Day 5:** Big-O Notation. Study time complexity ($O(1)$, $O(\log n)$, $O(n)$, $O(n^2)$). Analyze your code from Days 2-4.
* **Day 6:** **Math Maintenance.** Review Set Theory notation ($\in, \subset, \cup, \cap$). This is vital for formal logic courses (like MATH 135).
* **Day 7:** Basic Recursion. Write a recursive function for factorials and Fibonacci. Trace the call stack on paper line by line.
* **Day 8:** Stack Frames. Study how the computer memory stack behaves during deep recursion. Write a recursive string-reversal function.
* **Day 9:** Binary Search (Iterative vs. Recursive). Implement both methods in Java. Compare their stack space complexity.
* **Day 10:** Divide and Conquer. Look at the conceptual logic of Merge Sort. Don't code it yet; just sketch the split-and-merge steps.
* **Day 11:** **Math Maintenance.** Practice algebraic proofs by contradiction (e.g., proving $\sqrt{2}$ is irrational).
* **Day 12:** Implement Merge Sort. Write the full recursive code in Java.
* **Day 13:** Implement Quick Sort. Understand the concept of a "pivot" element and partition logic.
* **Day 14:** Two-Pointer Technique. Solve a "Reverse an Array" or "Two-Sum" (on a sorted array) problem using two pointers.
* **Day 15:** Sliding Window Basics. Find the maximum sum of a contiguous subarray of size $k$.
* **Day 16:** **Math Maintenance.** Review Mathematical Induction. Prove simple summation formulas (e.g., the sum of the first $n$ integers).
* **Day 17:** Object-Oriented Programming (OOP) Review. Define Classes, Objects, and Constructors in Java.
* **Day 18:** Inheritance & Polymorphism. Build a small hierarchy (e.g., `Vehicle` $\rightarrow$ `Car`) to practice overriding methods.
* **Day 19:** Interfaces vs. Abstract Classes. Learn when to use an interface over an abstract class.
* **Day 20:** Phase 1 Review. Build a mini terminal-based application (like a student grading registry) using OOP, HashMaps, and custom classes.

---

## Part 2: The Core Skill Acceleration (Days 21–40)

**Commitment:** 4 hours / day (Split: 2 hours Competitive Programming/Algorithms, 2 hours Development)
**Focus:** Algorithmic thinking & Web Dev Fundamentals (HTML, CSS, JavaScript).

### Days 21–30: Python Translation & Frontend Foundations

* **Day 21:** * *Algorithms (2h):* Learn Python syntax for loops, lists, and dicts. Translate 3 of your Java data structure problems into Python.
* *Dev (2h):* Introduction to the Web. Learn how browsers parse HTML. Build a completely unstyled, semantic webpage outline.


* **Day 22:**
* *Algorithms (2h):* Practice Python-specific optimizations (list comprehensions, slicing). Solve 2 basic LeetCode string problems.
* *Dev (2h):* CSS Basics. Learn selectors, specificity, and the Box Model (margins, padding, borders).


* **Day 23:**
* *Algorithms (2h):* Two-pointer problems in Python. Solve LeetCode 11 (Container With Most Water).
* *Dev (2h):* CSS Layouts. Master **Flexbox**. Build a responsive navigation bar and a product card grid.


* **Day 24:**
* *Algorithms (2h):* Sliding Window in Python. Solve LeetCode 3 (Longest Substring Without Repeating Characters).
* *Dev (2h):* CSS Layouts. Master **CSS Grid**. Build a magazine-style dashboard layout.


* **Day 25:**
* *Algorithms (2h):* **Math Maintenance.** Spend this block reviewing Matrix multiplication and systems of linear equations.
* *Dev (2h):* Intro to JavaScript (JS). Learn variables (`let`, `const`), data types, and functions.


* **Day 26:**
* *Algorithms (2h):* Introduction to Graphs. Learn how to represent a graph using an Adjacency List in Python.
* *Dev (2h):* JS DOM Manipulation. Learn how to use `document.querySelector` to select and change HTML elements dynamically.


* **Day 27:**
* *Algorithms (2h):* Graph Traversal. Implement Breadth-First Search (BFS) iteratively using a queue.
* *Dev (2h):* JS Events. Learn how to listen for clicks, keypresses, and form submissions. Build a basic counter app.


* **Day 28:**
* *Algorithms (2h):* Graph Traversal. Implement Depth-First Search (DFS) recursively.
* *Dev (2h):* Modern JS (ES6+). Master arrow functions, array methods (`.map()`, `.filter()`, `.reduce()`), and destructuring.


* **Day 29:**
* *Algorithms (2h):* Introduction to Dynamic Programming (DP). Study the concept of memoization (caching recursive results).
* *Dev (2h):* Asynchronous JS. Understand the event loop, Promises, and the `async/await` syntax.


* **Day 30:**
* *Algorithms (2h):* **Math Maintenance.** Review modular arithmetic (e.g., $a \equiv b \pmod n$). This is foundational for cryptography and abstract algebra.
* *Dev (2h):* Working with APIs. Use `fetch()` in JS to request data from a public API (like a weather or dog image API) and render it on your page.



### Days 31–40: Advanced Logic & Backend Architecture

* **Day 31:**
* *Algorithms (2h):* Classic DP. Solve the 0/1 Knapsack problem using a memoization table.
* *Dev (2h):* Intro to Backend. Install Node.js or Python Flask/FastAPI (Recommended: **Python FastAPI** for clean, fast API building). Write a "Hello World" server.


* **Day 32:**
* *Algorithms (2h):* Tabular DP. Solve the Coin Change problem using bottom-up iteration.
* *Dev (2h):* HTTP Protocol. Learn HTTP methods (`GET`, `POST`, `PUT`, `DELETE`) and status codes (`200`, `201`, `404`, `500`).


* **Day 33:**
* *Algorithms (2h):* Greedy Algorithms. Solve interval scheduling problems (e.g., LeetCode 56: Merge Intervals).
* *Dev (2h):* Building Routing logic. Create a backend API that handles multiple endpoints and path parameters (e.g., `/items/42`).


* **Day 34:**
* *Algorithms (2h):* Bit Manipulation. Learn bitwise operators (`&`, `|`, `^`, `<<`, `>>`). Solve problems involving binary representations.
* *Dev (2h):* Request Bodies. Learn how to parse JSON payloads sent from a user in a `POST` request.


* **Day 35:**
* *Algorithms (2h):* **Math Maintenance.** Review combinatorics (permutations, combinations, and Pascal's triangle).
* *Dev (2h):* Databases. Understand SQL vs. NoSQL. Set up a simple local database or use a cloud solution like MongoDB Atlas or Supabase.


* **Day 36:**
* *Algorithms (2h):* Advanced Data Structures. Study the conceptual mechanics of a Binary Search Tree (BST).
* *Dev (2h):* Connecting Backend to Database. Write code to save a user's form input from the API endpoint straight into your database.


* **Day 37:**
* *Algorithms (2h):* Implement BST insertion, deletion, and lookups in Python.
* *Dev (2h):* Read Data from Database. Write a `GET` route that fetches data from your database and returns it as a JSON array.


* **Day 38:**
* *Algorithms (2h):* Tree Traversals (In-order, Pre-order, Post-order). Understand their relationships to DFS.
* *Dev (2h):* Cross-Origin Resource Sharing (CORS). Learn how to safely configure your backend so your local frontend can talk to it without security blocks.


* **Day 39:**
* *Algorithms (2h):* Solve 2 classic tree-based competitive programming problems (e.g., Finding the maximum depth of a tree).
* *Dev (2h):* Postman / Bruno. Learn to test backend endpoints systematically using API testing clients without needing a frontend UI.


* **Day 40:**
* *Algorithms (2h):* **Math Maintenance.** Review basic limit properties and derivative rules from Calculus to stay fresh for calculus sequences.
* *Dev (2h):* Architecture Planning. Design the data schema and API endpoints for your upcoming summer side project.



---

## Part 3: The Capstone & Polish Block (Days 41–60)

**Commitment:** 4 hours / day
**Focus:** Building your full-stack side project from scratch, deploying it, and setting up C++ environments.

* **Day 41–42: Project Kickoff & Database Setup** Initialize your Git repository. Create your database instances and write the backend scripts to initialize tables or collections.
* **Day 43–45: Core Backend API Build** Build out all necessary endpoints (`GET`, `POST`, etc.). Test every single route using your API client to ensure data validates, saves, and updates correctly.
* **Day 46–49: Frontend Interface Construction** Build your clean, responsive user interface using structural HTML, CSS Flexbox/Grid, and modular JavaScript files. Focus on the visual layout before linking data.
* **Day 50: Math Maintenance Intermission** Take a full 4-hour break from the project. Spend this day practicing proof-by-induction exercises and reviewing complex algebraic rearrangements.
* **Day 51–54: The Integration Phase (The Full Stack Connection)** Use modern JS `fetch` requests inside your frontend UI to send data to your running API server. Wire up event listeners so your app dynamically rerenders when changes happen in the database.
* **Day 55: Debugging & Edge Cases** Test user validation. What happens if a user submits an empty form? Catch errors on the backend and display meaningful messages on the frontend.
* **Day 56: Deployment Setup** Host your backend on a cloud service (like Render) and your frontend on a static provider (like Vercel or Netlify). Ensure they talk to each other across production URLs.
* **Day 57: Git Cleanup & Documentation** Refactor your code blocks. Write a pristine `README.md` file detailing your tech stack, system architecture, how to run it locally, and screenshots of features. This turns your repository into a true resume asset.
* **Day 58: Introduction to C++ Mechanics** Install a C++ compiler (GCC/Clang). Understand the manual compilation lifecycle (`g++ main.cpp -o main`). Write a basic program and look at static typing compared to Java.
* **Day 59: Memory & Pointer Fundamentals** Study memory allocation. Learn about references (`&`), raw pointers (`*`), dereferencing values, and why managing memory directly makes code faster but riskier.
* **Day 60: Wrap Up & Final Review** Test compile a small C++ application utilizing standard vectors. Take a step back, look at your deployed full-stack application, and rest up before moving to campus.
