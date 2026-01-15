# Roman Numerals to Integer

## Overview
This project solves the **Roman Numerals to Integer** problem from LeetCode.  
The goal is to convert a Roman numeral string into its corresponding integer value while correctly handling subtraction rules and edge cases.

This challenge focuses on algorithmic thinking, conditional logic, and clean implementation.

---

## Problem Description
Roman numerals are represented by seven different symbols:

| Symbol | Value |
|------|------|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

Special subtraction cases apply:
- IV = 4  
- IX = 9  
- XL = 40  
- XC = 90  
- CD = 400  
- CM = 900  

---

## Solution Approach
The solution iterates through the Roman numeral string and:
- Maps each character to its integer value  
- Compares the current value with the next value  
- Subtracts when a smaller value appears before a larger one  
- Adds otherwise  

This approach ensures:
- Linear time complexity  
- Accurate handling of subtraction cases  
- Clean and readable logic  

---

## Tech Stack
- **Java** (or your language — adjust if needed)
- Basic data structures (HashMap / conditionals)

---

## Complexity Analysis
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)  

---

## What I Learned
- Translating problem statements into step-by-step logic  
- Handling edge cases effectively  
- Writing efficient and readable algorithms  
- Thinking in terms of time and space complexity  

---

## Why This Matters
This challenge demonstrates:
- Strong problem-solving skills  
- Attention to detail  
- Ability to reason through edge cases  
- Readiness for technical interviews  

---

## Author
**Princess Rodeeyah**  
Software Engineering Student | Problem-Solving Enthusiast
