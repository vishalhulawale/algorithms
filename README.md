# DSA Interview Questions — Topic-Wise Structured Knowledge Document

---

## Overall Summary

- **Total Questions Count:** 65
- **Difficulty Wise Count:**
    - Easy: 33
    - Medium: 27
    - Hard: 5

---

### Topic Summary Table

| Topic                                            | Total    |  Easy   | Medium | Hard |
|--------------------------------------------------|:--------:|:-------:|:------:|:----:|
| [Strings](#strings)                              |  14      | 10 [✅] |   4    |  0   |
| [Arrays](#arrays)                                |  13      | 5 [✅]  |   7    |  1   |
| [Math / Number Theory](#math--number-theory)     |   9      | 6 [✅]  |   2    |  1   |
| [Sorting & Searching](#sorting--searching)       |   6      | 2 [✅]  |   3    |  1   |
| [Dynamic Programming](#dynamic-programming)      |   4      |   1      |   2    |  1   |
| [Linked Lists](#linked-lists)                    |   3 [✅] | 1 [✅]  | 2 [✅]  |  0   |
| [Trees (BST)](#trees-bst)                        |   2      |   2      |   0    |  0   |
| [Stacks & Queues](#stacks--queues)               |   3      |   1 [✅] |   2    |  0   |
| [Graphs](#graphs)                                |   2      |   0      |   1    |  1   |
| [Hashing](#hashing)                              |   4      |   2      |   2    |  0   |
| [Design / Miscellaneous](#design--miscellaneous) |   3      |   1      |   2    |  0   |
| [Simulation](#simulation)                        |   2      |   1      |   1    |  0   |

---

# Strings

**Total Questions: 14**
Easy: 10 | Medium: 4 | Hard: 0

**Key Patterns Tested:**

- Character frequency counting
- Sliding window
- Two-pointer manipulation
- String parsing and encoding

---

## [✅] 1: First Non-Repeating Character

**Difficulty:** Easy

**Problem Statement:**
Given a string of lowercase English characters, find and return the first character that does not repeat anywhere in the
string. Traverse the string from left to right and identify the character whose frequency is exactly one and whose first
occurrence comes earliest. If every character repeats, return an appropriate indicator (e.g., `'_'` or `null`).

**Examples:**

```
Input: "racecars"
Output: "e"

Input: "aabdcce"
Output: "d"
```

---

## [✅] 2: Find Last Index of a Character in a String

**Difficulty:** Easy

**Problem Statement:**
Given a string `str` and a character `x`, write a function that returns the last (rightmost) index at which `x` appears
in `str`. If the character is not found, return `-1`. The search should consider the entire string.

**Examples:**

```
Input: str = "hello world", x = 'o'
Output: 7

Input: str = "programming", x = 'g'
Output: 10
```

---

## [✅] 3: Find Smallest and Largest Word in a String

**Difficulty:** Easy

**Problem Statement:**
Given a sentence consisting of words separated by spaces, find and return the smallest (shortest) and the largest (
longest) word in the sentence. If there are multiple words with the same minimum or maximum length, return the first one
encountered.

**Examples:**

```
Input: "This is a test string"
Output: Minimum length word: "a", Maximum length word: "string"

Input: "I love coding challenges"
Output: Minimum length word: "I", Maximum length word: "challenges"
```

---

## [✅] 4: Missing Characters to Make Pangram

**Difficulty:** Easy

**Problem Statement:**
A pangram is a sentence that contains every letter of the English alphabet at least once. Given a string, determine
which letters of the English alphabet are missing from the string. Return all missing letters in alphabetical order. The
check should be case-insensitive.

**Examples:**

```
Input: "The quick brown fox jumps over the lazy dog"
Output: "" (empty — it is already a pangram)

Input: "Hello World"
Output: "abcfgijkmnpqstuvxyz"
```

---

## [✅] 5: Print Words of a String in Reverse Order

**Difficulty:** Easy

**Problem Statement:**
Given a sentence as a string, reverse the order of words in it. Words are separated by single spaces. The individual
characters within each word should remain unchanged — only the word positions should be swapped so the last word comes
first, the second-to-last comes second, and so on.

**Examples:**

```
Input: "I AM A TESTER"
Output: "TESTER A AM I"

Input: "Hello World"
Output: "World Hello"
```

---

## [✅] 6: Run Length Encoding

**Difficulty:** Easy

**Problem Statement:**
Implement a run-length encoding function. Given a string of characters, compress it by replacing consecutive identical
characters with the character followed by the count of its consecutive occurrences. This is a basic form of lossless
data compression.

**Examples:**

```
Input: "aabbb"
Output: "a2b3"

Input: "SSSSSTTPPQ"
Output: "S5T2P2Q1"
```

---

## [✅] 7: Sort a String in Descending Order

**Difficulty:** Easy

**Problem Statement:**
Given a string consisting of lowercase English characters, sort all characters of the string in descending (reverse
alphabetical) order. Return the resulting string. Characters that appear more than once should all appear in their
correct sorted positions.

**Examples:**

```
Input: "mupursingh"
Output: "uusrpnmihg"

Input: "apple"
Output: "pplea"
```

---

## [✅] 8: Split String by Delimiter

**Difficulty:** Easy

**Problem Statement:**
Given a string and a delimiter character, split the string at each occurrence of the delimiter and return the resulting
list of substrings. Consecutive delimiters may produce empty strings in the result. This tests basic string parsing
without using built-in split methods.

**Examples:**

```
Input: str = "one,two,three,four", delimiter = ','
Output: ["one", "two", "three", "four"]

Input: str = "hello world foo", delimiter = ' '
Output: ["hello", "world", "foo"]
```

---

## [✅] 9: Convert String to Camel Case

**Difficulty:** Easy

**Problem Statement:**
Given a sentence of words separated by spaces, remove all spaces and convert the sentence to CamelCase format, where
every word begins with an uppercase letter and the remaining characters are lowercase. This is commonly used in
programming for naming conventions.

**Examples:**

```
Input: "this is a test string"
Output: "ThisIsATestString"

Input: "hello world from java"
Output: "HelloWorldFromJava"
```

---

## [✅] 10: Debug and Fix String Reversal

**Difficulty:** Easy

**Problem Statement:**
You are given a program that is intended to reverse a string but contains one or more bugs. Your task is to identify the
bugs, fix them, and ensure the corrected program passes all test cases. The function should take a string as input and
return its reverse. Consider edge cases such as empty strings, single characters, and strings with special characters.

**Examples:**

```
Input: "hello"
Output: "olleh"

Input: "abcd"
Output: "dcba"
```

---

## 11: Largest Substring with All Unique Characters

**Difficulty:** Medium

**Problem Statement:**
Given a string, find the longest contiguous substring that contains all unique (non-repeating) characters. If multiple
substrings of the same maximum length exist, return the first one encountered. This is a classic sliding window problem
that tests your ability to manage a dynamic window of characters efficiently.

**Examples:**

```
Input: "aaabcbdeaf"
Output: "cbdeaf"

Input: "abcabcbb"
Output: "abc"
```

---

## 12: Longest Palindromic Substring

**Difficulty:** Medium

**Problem Statement:**
Given a string, find the longest contiguous substring that reads the same forwards and backwards. If there are multiple
palindromic substrings of the same maximum length, return any one of them. Consider both odd-length and even-length
palindromes. The solution should efficiently expand around potential centers or use dynamic programming.

**Examples:**

```
Input: "babad"
Output: "bab" (or "aba")

Input: "cbbd"
Output: "bb"
```

---

## 13: Longest Uniform Substring

**Difficulty:** Medium

**Problem Statement:**
Given a string of characters, find the longest contiguous substring that consists of a single repeated character. Return
the starting index and the length of this substring. If there are ties, return the one that appears first.

**Examples:**

```
Input: "abbbccda"
Output: (1, 3)  — substring "bbb" starts at index 1, length 3

Input: "aabbbbddcc"
Output: (2, 4)  — substring "bbbb" starts at index 2, length 4
```

---

## 14: Reverse Individual Words in a String

**Difficulty:** Medium

**Problem Statement:**
Given a sentence as a string, reverse each individual word in place while keeping the word order the same. Words are
separated by spaces. For example, if a word is "hello", it becomes "olleh", but its position relative to other words
remains unchanged.

**Examples:**

```
Input: "Hello World"
Output: "olleH dlroW"

Input: "I love programming"
Output: "I evol gnimmargorp"
```

---

# Arrays

**Total Questions: 13**
Easy: 5 | Medium: 7 | Hard: 1

**Key Patterns Tested:**

- Two-pointer technique
- Prefix sums / subarray sums
- Sorting-based logic
- Matrix traversal (spiral order)

---

## [✅] 15: Dot Product of Two Arrays

**Difficulty:** Easy

**Problem Statement:**
Given two integer arrays, compute and return their dot product. The dot product is defined as the sum of element-wise
products: `result = array1[0]*array2[0] + array1[1]*array2[1] + ...`. If the two arrays have different lengths, compute
the dot product over the length of the shorter array, ignoring extra elements in the longer one.

**Examples:**

```
Input: array1 = [1, 2, 3], array2 = [4, 5, 6]
Output: 32  (1*4 + 2*5 + 3*6)

Input: array1 = [1, 2, 3, 4], array2 = [5, 6]
Output: 17  (1*5 + 2*6)
```

---

## [✅] 16: Mean and Median of an Unsorted Array

**Difficulty:** Easy

**Problem Statement:**
Given an unsorted array of `n` integers, compute both the mean (arithmetic average) and the median. The mean is the sum
of all elements divided by the count. The median is the middle element when sorted; if the array has even length, return
the average of the two middle elements.

**Examples:**

```
Input: [3, 1, 4, 1, 5]
Output: Mean = 2.8, Median = 3

Input: [7, 2, 10, 4]
Output: Mean = 5.75, Median = 5.5
```

---

## [✅] 17: Pair Sum — Count Pairs with Given Sum

**Difficulty:** Easy

**Problem Statement:**
Given an array of integers and a target sum, find the total number of pairs of elements whose sum equals the target.
Each element may be used only once per pair. Two indices `(i, j)` where `i < j` form a valid pair if
`arr[i] + arr[j] == target`.

**Examples:**

```
Input: arr = [1, 5, 7, -1, 5], target = 6
Output: 3  — pairs: (1,5), (1,5), (7,-1)

Input: arr = [2, 2, 2, 2], target = 4
Output: 6
```

---

## [✅] 18: Sum of Product of All Pairs

**Difficulty:** Easy

**Problem Statement:**
Given an array of integers, find the sum of the product of every unique pair `(arr[i], arr[j])` where `i < j`. You
should consider all combinations of two distinct indices and sum up their products. An efficient O(n) mathematical
approach exists using algebraic identities.

**Examples:**

```
Input: [1, 3, 4]
Output: 19  — (1*3) + (1*4) + (3*4) = 3 + 4 + 12 = 19

Input: [2, 3, 5]
Output: 31  — (2*3) + (2*5) + (3*5) = 6 + 10 + 15 = 31
```

---

## [✅] 19: Divisible by 3 Using Array Digits

**Difficulty:** Easy

**Problem Statement:**
Given an array of single-digit integers, determine whether it is possible to concatenate all the digits (in any order)
to form a number that is divisible by 3. A number is divisible by 3 if and only if the sum of its digits is divisible by
3. You must use all digits in the array.

**Examples:**

```
Input: [3, 1, 2]
Output: true  (sum = 6, divisible by 3)

Input: [1, 2, 4]
Output: false  (sum = 7, not divisible by 3)
```

---

## 20: Second Smallest Element in an Array

**Difficulty:** Medium

**Problem Statement:**
Given an unsorted array of integers with at least two distinct elements, find and return the second smallest element.
The second smallest is the smallest value strictly greater than the minimum. You must handle duplicates correctly — for
example, if the minimum appears multiple times, the second smallest is still the next distinct value.

**Examples:**

```
Input: [5, 3, 8, 1, 4, 1]
Output: 3

Input: [10, 20, 30]
Output: 20
```

---

## 21: Second Largest Element in an Array

**Difficulty:** Medium

**Problem Statement:**
Given an unsorted array of integers, find and return the second largest element. The second largest is the largest value
strictly less than the maximum. Handle edge cases where the array may have duplicates. Aim for a single-pass O(n)
solution without sorting.

**Examples:**

```
Input: [12, 35, 1, 10, 34, 1]
Output: 34

Input: [10, 10, 10]
Output: -1  (no second largest exists)
```

---

## 22: Print Matrix in Spiral Form

**Difficulty:** Medium

**Problem Statement:**
Given an `m x n` matrix, return all elements of the matrix in spiral order. Start from the top-left corner, move right
across the top row, then down the last column, then left across the bottom row, then up the first column, and repeat,
spiraling inward until all elements have been visited.

**Examples:**

```
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]

Input: [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
```

---

## 23: Reverse Spiral Matrix Using Recursion

**Difficulty:** Medium

**Problem Statement:**
Given an `m x n` matrix, print all elements in reverse spiral order using recursion. Reverse spiral order means starting
from the innermost element and spiraling outward, which is the reverse of the standard spiral traversal. You must
implement this recursively.

**Examples:**

```
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [5, 4, 7, 8, 9, 6, 3, 2, 1]

Input: [[1,2],[3,4]]
Output: [4, 3, 1, 2]  (reverse of spiral [1,2,4,3])
```

---

## 24: Smallest Subarray with Sum ≥ Target

**Difficulty:** Medium

**Problem Statement:**
Given an array of positive integers and a target value, find the length of the smallest contiguous subarray whose sum is
greater than or equal to the target. If no such subarray exists, return 0. This is a classic sliding window problem
requiring an efficient O(n) solution.

**Examples:**

```
Input: arr = [2, 3, 1, 2, 4, 3], target = 7
Output: 2  — subarray [4, 3]

Input: arr = [1, 1, 1, 1, 1], target = 11
Output: 0  — no subarray has sum ≥ 11
```

---

## 25: Longest Subarray with Sum K

**Difficulty:** Medium

**Problem Statement:**
Given an array of integers (which may include negative numbers) and an integer `k`, find the length of the longest
contiguous subarray whose elements sum to exactly `k`. Use a prefix sum approach with a hash map for an efficient O(n)
solution.

**Examples:**

```
Input: arr = [10, 5, 2, 7, 1, 9], k = 15
Output: 4  — subarray [5, 2, 7, 1]

Input: arr = [-1, 1, 1, -1, 2], k = 2
Output: 5
```

---

## 26: Median of Two Sorted Arrays

**Difficulty:** Hard

**Problem Statement:**
Given two sorted arrays of integers, find the median of the combined sorted array. The overall run-time complexity
should be O(log(min(m, n))) where m and n are the sizes of the two arrays. The median is the middle value in the merged
sorted array; if the total number of elements is even, return the average of the two middle values.

**Examples:**

```
Input: nums1 = [1, 3], nums2 = [2]
Output: 2.0

Input: nums1 = [1, 2], nums2 = [3, 4]
Output: 2.5
```

---

## 27: Unique Tuples

**Difficulty:** Medium

**Problem Statement:**
Given an array of integers and a tuple size `k`, generate all unique contiguous tuples (subsequences of length `k`) from
the array. Return the list of unique tuples without any duplicates. This tests your ability to use sliding windows and
hash-based deduplication.

**Examples:**

```
Input: arr = [1, 2, 3, 2, 1], k = 2
Output: [(1,2), (2,3), (3,2), (2,1)]

Input: arr = [1, 1, 1, 1], k = 2
Output: [(1,1)]
```

---

# Math / Number Theory

**Total Questions: 9**
Easy: 6 | Medium: 2 | Hard: 1

**Key Patterns Tested:**

- Modular arithmetic
- Factorization
- Exponentiation
- Number properties (Fibonacci, Armstrong, powers)

---

## [✅] 28: Armstrong Number Check

**Difficulty:** Easy

**Problem Statement:**
An Armstrong number (also known as a narcissistic number) of `n` digits is a number where the sum of each digit raised
to the power of `n` equals the number itself. For a 3-digit number, it means the sum of cubes of its digits equals the
number. Given an integer, determine if it is an Armstrong number.

**Examples:**

```
Input: 371
Output: true  (3³ + 7³ + 1³ = 27 + 343 + 1 = 371)

Input: 123
Output: false  (1³ + 2³ + 3³ = 1 + 8 + 27 = 36 ≠ 123)
```

---

## [✅] 29: Check if a Number is a Power of Another Number

**Difficulty:** Easy

**Problem Statement:**
Given two positive integers `x` and `y`, determine whether `x` is a power of `y`. That is, check if there exists a
non-negative integer `k` such that `y^k == x`. Handle edge cases where `y` is 1 (only `x = 1` is valid) and where `x` is
0.

**Examples:**

```
Input: x = 27, y = 3
Output: true  (3³ = 27)

Input: x = 10, y = 2
Output: false
```

---

## [✅] 30: Is Power of 10

**Difficulty:** Easy

**Problem Statement:**
Given a positive integer `x`, determine whether it is a power of 10. A number is a power of 10 if it can be expressed as
`10^k` for some non-negative integer `k` (i.e., 1, 10, 100, 1000, ...). Implement this without using logarithmic
functions for a clean iterative solution.

**Examples:**

```
Input: 1000
Output: true

Input: 500
Output: false
```

---

## [✅] 31: Fibonacci — Nth Number (Iterative and Recursive)

**Difficulty:** Easy

**Problem Statement:**
The Fibonacci series is defined as: `F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2)` for `n ≥ 2`. Given a non-negative
integer `n`, return the nth Fibonacci number. Implement both an iterative and a recursive approach. Discuss the time and
space complexity trade-offs of each.

**Examples:**

```
Input: n = 6
Output: 8  (sequence: 0, 1, 1, 2, 3, 5, 8)

Input: n = 10
Output: 55
```

---

## [✅] 32: Add Two Fractions

**Difficulty:** Easy

**Problem Statement:**
Given two fractions represented as pairs of integers `(numerator, denominator)`, compute their sum and return the result
as a simplified fraction. The result should be reduced to its lowest terms using the Greatest Common Divisor (GCD).
Handle negative fractions and ensure the denominator is always positive.

**Examples:**

```
Input: (1, 3) + (3, 9)
Output: (2, 3)

Input: (1, 2) + (1, 3)
Output: (5, 6)
```

---

## [✅] 33: Prime Factorization

**Difficulty:** Easy

**Problem Statement:**
Given a positive integer `x`, find all prime factors of `x` and return them as an array. The product of all elements in
the returned array should equal `x`. Each prime factor should appear in the result as many times as it divides `x`.
Return the factors in ascending order.

**Examples:**

```
Input: 12
Output: [2, 2, 3]

Input: 100
Output: [2, 2, 5, 5]
```

---

## 34: Compute Power (Base^Exponent)

**Difficulty:** Medium

**Problem Statement:**
Implement a function to compute `base` raised to the power of `exponent`. The exponent can be positive, negative, or
zero. For negative exponents, return the reciprocal. Implement an efficient solution using fast exponentiation (
exponentiation by squaring) for O(log n) time complexity. Handle edge cases like `0^0` and negative bases.

**Examples:**

```
Input: base = 2, exponent = 10
Output: 1024

Input: base = 2, exponent = -2
Output: 0.25
```

---

## 35: Count Fibonacci Numbers in a Given Range

**Difficulty:** Medium

**Problem Statement:**
Given a range `[low, high]`, count how many Fibonacci numbers fall within this range (inclusive). The solution should
run in O(log n) time and O(1) space by generating Fibonacci numbers iteratively and counting those within range,
stopping once the Fibonacci number exceeds `high`.

**Examples:**

```
Input: low = 10, high = 100
Output: 5  (13, 21, 34, 55, 89)

Input: low = 1, high = 10
Output: 6  (1, 1, 2, 3, 5, 8)
```

---

## 36: Pairs Where a^b = b^a

**Difficulty:** Hard

**Problem Statement:**
Given an array of positive integers, find all pairs `(a, b)` where `a < b` such that `a^b == b^a`. This is a
mathematical problem that requires careful handling. Note that the equation `a^b = b^a` holds for certain special
cases (e.g., `(2, 4)`) and can be analyzed by comparing `a^(1/a)` values. Implement an efficient solution that avoids
brute-force exponentiation for large numbers.

**Examples:**

```
Input: [2, 3, 4, 5]
Output: [(2, 4)]

Input: [1, 2, 4]
Output: [(1, 1 is trivial — excluded), (2, 4)]
```

---

# Sorting & Searching

**Total Questions: 6**
Easy: 2 | Medium: 3 | Hard: 1

**Key Patterns Tested:**

- Binary search on rotated arrays
- Custom comparator sorting
- Sorting with specific constraints

---

## [✅] 37: Smallest Number in a Rotated Sorted Array

**Difficulty:** Easy

**Problem Statement:**
Given a sorted array that has been rotated an unknown number of times, find the minimum element in the array. A rotated
sorted array is one where a sorted array is split at some pivot and the two halves are swapped. Use binary search for an
O(log n) solution.

**Examples:**

```
Input: [5, 6, 1, 2, 3, 4]
Output: 1

Input: [3, 4, 5, 1, 2]
Output: 1
```

---

## [✅] 38: Second Smallest in a Sorted Rotated Array

**Difficulty:** Easy

**Problem Statement:**
Given a sorted array that has been rotated, find the second smallest element. First, locate the minimum element using
binary search on the rotated array, then determine the second smallest by comparing adjacent candidates. The array
contains distinct elements.

**Examples:**

```
Input: [5, 6, 1, 2, 3, 4]
Output: 2

Input: [3, 4, 5, 1, 2]
Output: 2
```

---

## 39: Arrange Numbers to Form the Biggest Number

**Difficulty:** Medium

**Problem Statement:**
Given a list of non-negative integers, arrange them such that they form the largest possible number and return it as a
string. This requires a custom comparator: for two numbers `a` and `b`, compare the concatenations `ab` vs `ba` to
decide ordering. Handle the edge case where all numbers are zero.

**Examples:**

```
Input: [1, 34, 3, 98, 9, 76, 45, 4]
Output: "998764543431"

Input: [10, 2]
Output: "210"
```

---

## 40: Check if Array is Stack Sortable

**Difficulty:** Medium

**Problem Statement:**
An array `A[]` of size `n` containing a permutation of `1` to `n` is said to be stack-sortable if it can be sorted into
array `B[]` in ascending order using an auxiliary stack `S`. Elements are pushed from `A` to `S` and popped from `S` to
`B`. Determine whether the given permutation is stack-sortable.

**Examples:**

```
Input: [1, 2, 3]
Output: true

Input: [2, 3, 1]
Output: true

Input: [3, 1, 2]
Output: false
```

---

## 41: Square Root Without Built-in Functions

**Difficulty:** Medium

**Problem Statement:**
Given a non-negative integer `x`, compute and return the integer part of the square root of `x` without using any
built-in exponent or square root functions. Use binary search or Newton's method for an efficient O(log n) solution.

**Examples:**

```
Input: 16
Output: 4

Input: 8
Output: 2  (since √8 ≈ 2.828, floor is 2)
```

---

## 42: Pascal's Triangle — Return Element at Given Position

**Difficulty:** Hard

**Problem Statement:**
Pascal's Triangle is a triangular array where each number is the sum of the two numbers directly above it. Given a row
number `r` and a column number `c` (both 1-indexed), return the element at that position. The element at row `r`, column
`c` is the binomial coefficient `C(r-1, c-1)`. Implement this efficiently without constructing the entire triangle.

**Examples:**

```
Input: row = 5, col = 2
Output: 4  (Row 5: 1, 4, 6, 4, 1)

Input: row = 6, col = 3
Output: 10  (Row 6: 1, 5, 10, 10, 5, 1)
```

---

# Dynamic Programming

**Total Questions: 4**
Easy: 1 | Medium: 2 | Hard: 1

**Key Patterns Tested:**

- Counting combinations (staircase)
- Grid-based DP (optimal path)
- Subproblem decomposition

---

## 43: Print Staircase Pattern

**Difficulty:** Easy

**Problem Statement:**
Given a positive integer `n`, print a staircase of size `n`. The staircase is right-aligned and composed of `#` symbols
and spaces. Each row `i` (1-indexed) contains `n - i` spaces followed by `i` `#` characters. This is a basic
pattern-printing problem.

**Examples:**

```
Input: n = 4
Output:
   #
  ##
 ###
####
```

---

## 44: Climbing Stairs — Count Ways (1, 2, or 3 Steps)

**Difficulty:** Medium

**Problem Statement:**
A child is climbing a staircase with `n` steps. At each step, the child can take either 1, 2, or 3 steps at a time.
Write a function that returns the total number of unique ways the child can reach the top. This is a classic dynamic
programming problem where `dp[i] = dp[i-1] + dp[i-2] + dp[i-3]`.

**Examples:**

```
Input: n = 3
Output: 4  (1+1+1, 2+1, 1+2, 3)

Input: n = 4
Output: 7  (1+1+1+1, 2+1+1, 1+2+1, 1+1+2, 2+2, 3+1, 1+3)
```

---

## 45: Optimal Path in a Grid

**Difficulty:** Medium

**Problem Statement:**
Given an `m x n` grid filled with non-negative integers, find a path from the top-left corner to the bottom-right corner
that minimizes the sum of all numbers along the path. You can only move either down or right at any step. Return the
minimum path sum. Use dynamic programming where `dp[i][j]` represents the minimum cost to reach cell `(i, j)`.

**Examples:**

```
Input: [[1, 3, 1], [1, 5, 1], [4, 2, 1]]
Output: 7  (path: 1→3→1→1→1)

Input: [[1, 2, 3], [4, 5, 6]]
Output: 12  (path: 1→2→3→6)
```

---

## 46: Snowpack (Trapping Rain Water)

**Difficulty:** Hard

**Problem Statement:**
Given an array of non-negative integers representing an elevation map where the width of each bar is 1, compute how much
water can be trapped after raining. For each position, the water trapped is determined by the minimum of the maximum
heights to its left and right minus the current height. Implement an efficient O(n) solution using two pointers or
precomputed arrays.

**Examples:**

```
Input: [0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0]
Output: 14

Input: [3, 0, 2, 0, 4]
Output: 7
```

---

# Hashing

**Total Questions: 4**
Easy: 2 | Medium: 2 | Hard: 0

**Key Patterns Tested:**

- Frequency counting
- Grouping by derived keys
- Aggregation with hash maps

---

## 47: Best Average Grade

**Difficulty:** Easy

**Problem Statement:**
Given a list of student name-score pairs (where the same student may appear multiple times with different scores), find
the highest average score among all students. For each student, compute their average score across all entries, then
return the maximum average (as an integer, floored).

**Examples:**

```
Input: [("Alia", -678), ("Bobby", 100), ("Alex", 223), ("Alex", -23), ("Bobby", 723)]
Output: 411  (Bobby's avg = (100+723)/2 = 411.5 → 411)

Input: [("Alice", 90), ("Bob", 80), ("Alice", 100)]
Output: 95
```

---

## 48: First Repeated Word in a String

**Difficulty:** Easy

**Problem Statement:**
Given a string of words separated by spaces, find the first word that appears more than once. Traverse the words left to
right and return the first word that has been seen before. Use a hash set for O(1) lookup per word.

**Examples:**

```
Input: "Ravi had been saying that he had been there"
Output: "had"

Input: "he went to to the market"
Output: "to"
```

---

## 49: Group Anagrams

**Difficulty:** Medium

**Problem Statement:**
Given a list of strings, group the anagrams together. Two strings are anagrams if they contain the same characters with
the same frequencies. Return a list of groups where each group contains all strings that are anagrams of each other. Use
sorted characters or character frequency as a hash key.

**Examples:**

```
Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

Input: ["listen", "silent", "hello"]
Output: [["listen", "silent"], ["hello"]]
```

---

## 50: Election Winner (Most Votes with Tie-Breaking)

**Difficulty:** Medium

**Problem Statement:**
Given an array of candidate names where each name represents one vote for that candidate, determine the winner of the
election. The winner is the candidate with the most votes. If there is a tie, return the candidate whose name is
lexicographically smallest. Use a hash map to count votes efficiently.

**Examples:**

```
Input: ["Alice", "Bob", "Alice", "Charlie", "Bob", "Alice"]
Output: "Alice"

Input: ["John", "Jane", "John", "Jane"]
Output: "Jane"  (tie-breaker: lexicographically smaller)
```

---

# Linked Lists

**Total Questions: 3**
Easy: 1 | Medium: 2 | Hard: 0

**Key Patterns Tested:**

- Cycle detection (Floyd's algorithm)
- Recursive reversal
- Doubly linked list operations

---

## [✅] 51: Detect Loop in a Linked List

**Difficulty:** Easy

**Problem Statement:**
Given the head of a singly linked list, determine whether the linked list contains a cycle (loop). A cycle exists if
some node's `next` pointer points back to a previously visited node. Use Floyd's cycle detection algorithm (tortoise and
hare) for an O(n) time, O(1) space solution.

**Examples:**

```
Input: 1 → 2 → 3 → 4 → 2 (cycle back to node 2)
Output: true

Input: 1 → 2 → 3 → null
Output: false
```

---

## [✅] 52: Count Length of Cycle in a Linked List

**Difficulty:** Medium

**Problem Statement:**
Given the head of a linked list that may contain a cycle, determine the length of the cycle if one exists. First, detect
the cycle using Floyd's algorithm. Once the slow and fast pointers meet inside the cycle, keep one pointer fixed and
advance the other, counting steps until they meet again. Return 0 if no cycle exists.

**Examples:**

```
Input: 1 → 2 → 3 → 4 → 5 → 3 (cycle of length 3: 3→4→5→3)
Output: 3

Input: 1 → 2 → 3 → null
Output: 0
```

---

## [✅] 53: Reverse a Doubly Linked List Using Recursion

**Difficulty:** Medium

**Problem Statement:**
Given the head of a doubly linked list, reverse the entire list using recursion. Each node has `data`, `next`, and
`prev` pointers. After reversal, the head should point to the original tail, and all `next` and `prev` pointers should
be swapped correctly. The function should return the new head of the reversed list.

**Examples:**

```
Input: 1 ⇄ 2 ⇄ 3 ⇄ 4
Output: 4 ⇄ 3 ⇄ 2 ⇄ 1

Input: 10 ⇄ 20
Output: 20 ⇄ 10
```

---

# Stacks & Queues

**Total Questions: 3**
Easy: 1 | Medium: 2 | Hard: 0

**Key Patterns Tested:**
- Stack-based simulation
- Expression parsing
- Queue implementation using stacks

---

## [✅] 54: Implement Queue Using Stacks

**Difficulty:** Easy

**Problem Statement:**
Implement a FIFO (First-In-First-Out) queue using only two LIFO stacks. Support the following operations: `enqueue(x)`
to add an element to the back, `dequeue()` to remove and return the front element, `peek()` to view the front element,
and `isEmpty()` to check if the queue is empty. Each operation should have amortized O(1) time complexity.

**Examples:**

```
Input: enqueue(1), enqueue(2), dequeue(), enqueue(3), dequeue()
Output: dequeue returns 1, then 2

Input: enqueue(5), peek(), enqueue(10), dequeue()
Output: peek returns 5, dequeue returns 5
```

---

## 55: Convert Infix to Prefix Notation

**Difficulty:** Medium

**Problem Statement:**
Given a mathematical expression in infix notation (e.g., `A + B * C`), convert it to prefix (Polish) notation. Use the
Shunting-yard algorithm adapted for prefix conversion: reverse the infix expression, swap parentheses, apply the
standard infix-to-postfix algorithm, then reverse the result. Handle operator precedence and associativity correctly.

**Examples:**

```
Input: "A + B * C"
Output: "+ A * B C"

Input: "(A + B) * (C - D)"
Output: "* + A B - C D"
```

---

## 56: Magic Potion (Stack-Based Simulation)

**Difficulty:** Medium

**Problem Statement:**
A wizard is brewing a magic potion by adding ingredients one at a time. If the same ingredient is added consecutively (
the top of the current potion stack matches the new ingredient), they cancel each other out and both are removed. Given
a sequence of ingredients, determine the final state of the potion after all ingredients have been processed. This is
essentially a stack-based adjacent duplicate removal problem.

**Examples:**

```
Input: ["a", "b", "a", "a", "b"]
Output: ["a", "b", "b"]

Input: ["a", "a", "b", "b"]
Output: []  (all cancel out)
```

---

# Trees (BST)

**Total Questions: 2**
Easy: 2 | Medium: 0 | Hard: 0

**Key Patterns Tested:**

- BST insertion and search
- In-order traversal

---

## 57: Binary Search Tree — Put, Contains, InOrder Traversal

**Difficulty:** Easy

**Problem Statement:**
Implement a Binary Search Tree (BST) with the following operations:

1. **put(value):** Insert a new value into the BST maintaining the BST property (left child < parent < right child).
2. **contains(value):** Return `true` if the value exists in the BST, `false` otherwise.
3. **inOrderTraversal():** Return all values in the BST in sorted (ascending) order by performing an in-order
   traversal (left → root → right).

**Examples:**

```
Input: put(5), put(3), put(7), put(1), contains(3), contains(6), inOrderTraversal()
Output: contains(3) → true, contains(6) → false, inOrderTraversal → [1, 3, 5, 7]

Input: put(10), put(5), put(15), inOrderTraversal()
Output: [5, 10, 15]
```

---

## 58: ATOI — String to Integer Conversion

**Difficulty:** Easy

**Problem Statement:**
Implement the `atoi` (ASCII to Integer) function, which converts a string to a 32-bit signed integer. The function
should: (1) discard leading whitespace, (2) check for an optional `+` or `-` sign, (3) read in digits until a non-digit
character is reached or end of string, (4) convert the digits to an integer. If the result overflows, clamp it to
`INT_MIN` (-2³¹) or `INT_MAX` (2³¹ - 1). Return 0 if no valid conversion can be performed.

**Examples:**

```
Input: "42"
Output: 42

Input: "   -42"
Output: -42

Input: "4193 with words"
Output: 4193
```

---

# Graphs

**Total Questions: 2**
Easy: 0 | Medium: 1 | Hard: 1

**Key Patterns Tested:**

- Shortest path algorithms (BFS/Dijkstra)
- Graph modeling from real-world data

---

## 59: Train Map — Shortest Path Between Stations

**Difficulty:** Medium

**Problem Statement:**
You are given a train network represented as a graph where stations are nodes and direct routes between stations are
edges with associated travel times (weights). Implement a `shortestPath(fromStation, toStation)` method that returns the
shortest travel time (or path) between two stations. Use BFS for unweighted graphs or Dijkstra's algorithm for weighted
graphs. Handle disconnected stations gracefully.

**Examples:**

```
Input: Stations: A-B(5), B-C(3), A-C(10); shortestPath("A", "C")
Output: 8  (A → B → C)

Input: shortestPath("A", "D") where D is not connected
Output: -1
```

---

## 60: Apache Log — Most Frequent IP Address

**Difficulty:** Hard

**Problem Statement:**
Given a web server log file where each line contains an IP address and request details, parse the log and determine the
IP address(es) that accessed the site most frequently. Handle large log files efficiently. If multiple IP addresses have
the same highest frequency, return all of them. This combines file parsing, hashing, and sorting concepts.

**Examples:**

```
Input: 
  "192.168.1.1 - GET /index.html"
  "10.0.0.1 - GET /about.html"
  "192.168.1.1 - GET /contact.html"
  "10.0.0.1 - GET /index.html"
  "192.168.1.1 - POST /login"
Output: "192.168.1.1"  (3 accesses)

Input: Log with tied frequencies
Output: All tied IPs
```

---

# Design / Miscellaneous

**Total Questions: 3**
Easy: 1 | Medium: 2 | Hard: 0

**Key Patterns Tested:**

- Password validation logic
- Function composition (higher-order functions)
- Concurrency concepts (deadlock)

---

## 61: Password Strength Checker

**Difficulty:** Easy

**Problem Statement:**
Given a password string, determine its strength based on the following criteria:

- **Strong:** Contains at least one lowercase letter, one uppercase letter, one digit, one special character (
  `!@#$%^&*(`), and length ≥ 8.
- **Moderate:** Contains at least one lowercase, one uppercase, one special character, and length ≥ 6.
- **Weak:** Does not meet the above criteria.

Evaluate and return the strength classification.

**Examples:**

```
Input: "SapientGlobalMarkets!@12"
Output: "Strong"

Input: "gfg!@12"
Output: "Moderate"

Input: "abc"
Output: "Weak"
```

---

## 62: Create Deadlock (Concurrency)

**Difficulty:** Medium

**Problem Statement:**
Write a program that demonstrates a deadlock scenario using two threads and two shared resources (locks/monitors).
Thread 1 should acquire Lock A and then attempt to acquire Lock B, while Thread 2 acquires Lock B and then attempts to
acquire Lock A. This mutual circular waiting creates a deadlock. This is a conceptual question — do NOT run in a
production environment.

**Examples:**

```
Input: Two threads, two locks
Output: Both threads are stuck waiting indefinitely (deadlock state)

Conceptual Output:
  Thread-1: holds Lock-A, waiting for Lock-B
  Thread-2: holds Lock-B, waiting for Lock-A
```

---

## 63: Function Composition

**Difficulty:** Medium

**Problem Statement:**
Write a `compose` function that accepts an array of single-argument functions and returns a new function. When the
composed function is called with an argument, it should apply the functions from left to right (or right to left,
depending on convention). The output of each function becomes the input of the next. Support binding context (`this`)
for method calls.

**Examples:**

```
Input: compose([add1, multiplyBy2])(1)  where add1 = a => a+1, multiplyBy2 = a => a*2
Output: 4  (add1(1) = 2, multiplyBy2(2) = 4)

Input: compose([multiplyBy2, add1])(1)
Output: 3  (multiplyBy2(1) = 2, add1(2) = 3)
```

---

# Simulation

**Total Questions: 2**
Easy: 1 | Medium: 1 | Hard: 0

**Key Patterns Tested:**

- Coordinate tracking
- Simulation of movement

---

## 64: Robot Movement Simulation

**Difficulty:** Easy

**Problem Statement:**
A robot starts at position `(0, 0)` on a 2D grid. Given a string of movement commands where `'U'` moves up (y+1), `'D'`
moves down (y-1), `'L'` moves left (x-1), and `'R'` moves right (x+1), compute the robot's final position after
executing all commands. Ignore any characters that are not `U`, `D`, `L`, or `R`.

**Examples:**

```
Input: "UUDDLRLR"
Output: (0, 0)

Input: "UUURRDD"
Output: (3, 0)  — 3 right, 3 up, 2 down → (3, 1)... correction: U×3, R×3, D×2 → (3, 1)
```

---

## 65: Top 10 Videos by Watch Rate

**Difficulty:** Medium

**Problem Statement:**
Given a list of `(video_name, watch_rate)` tuples where a video name may appear multiple times, compute the total watch
rate for each unique video by summing all its entries. Return the top 10 videos sorted by their total watch rate in
descending order. If there are fewer than 10 unique videos, return all of them sorted.

**Examples:**

```
Input: [("abc", 10), ("def", 15), ("ghi", 10), ("abc", 12), ("xyz", 100)]
Output: ["xyz", "abc", "def", "ghi"]

Input: [("a", 50), ("b", 50), ("c", 30)]
Output: ["a", "b", "c"]  (tie broken by order or alphabetically)
```

---

## Appendix: Dictionary / Word Search

> *Bonus question not counted in primary total — included for completeness.*

### Dictionary — Longest Word from Given Letters

**Difficulty:** Medium

**Problem Statement:**
Given a set of available letters and a dictionary of words, find the longest word(s) in the dictionary that can be
formed using only the available letters (each letter used at most once, or as many times as it appears in the input). If
multiple words share the maximum length, return all of them.

**Examples:**

```
Input: letters = "oet", dictionary = ["to", "toe", "toes"]
Output: ["toe"]

Input: letters = "ogd", dictionary = ["go", "dog", "god", "do"]
Output: ["dog", "god"]
```

---

## Appendix: Minimum Distance Between Two Words

> *Bonus question not counted in primary total — included for completeness.*

### Distance Between Two Words

**Difficulty:** Medium

**Problem Statement:**
Given a string of words and two target words, find the minimum distance between the two target words in terms of the
number of words between them. The distance is measured from the middle (center character) of one word to the middle of
the other, counting characters. If multiple occurrences exist, return the minimum distance found.

**Examples:**

```
Input: text = "the quick brown fox quick", word1 = "quick", word2 = "fox"
Output: 1  (adjacent occurrence)

Input: text = "hello world foo hello bar world", word1 = "hello", word2 = "world"
Output: 1
```
