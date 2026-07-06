/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [14/06/26] → #2  [15/06/26] → #3  [16/06/26]                    │
 * │  #4  [17/06/26] → #5  [18/06/26] → #6  [19/06/26]                    │
 * │  #7  [20/06/26] → #8  [21/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 68: Check Whether a Number is Prime                          ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, determine whether it is a prime number.         │
 * │ Return true if n has exactly two positive divisors (1 and itself);  │
 * │ otherwise return false.                                             │
 * │ Input: A single integer n. Output: Boolean (true/false).            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 13                                                         │
 * │ Output : true                                                       │
 * │ Explanation : No integer from 2 to √13 divides 13 evenly,           │
 * │ therefore it is a prime number.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n is an integer.                                                    │
 * │ n <= 1 is not considered prime.                                     │
 * │ Only divisors up to √n need to be checked.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : If n <= 1, return false.                                   │
 * │ Step 2 : If n == 2, return true since 2 is the smallest prime.      │
 * │ Step 3 : Iterate from 2 to √n and check divisibility.               │
 * │ Step 4 : If any divisor is found, return false; otherwise true.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics (Prime Number) | Square Root Optimization               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(√n)                                            │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Prime_Number {
    
    public static void main(String args[]) {
        int number = 13;
        
    }
}

/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 68: Check Whether a Number is Prime                          ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, determine whether it is a prime number.         │
 * │ Return true if n has exactly two positive divisors (1 and itself);  │
 * │ otherwise return false.                                             │
 * │ Input: A single integer n. Output: Boolean (true/false).            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 13                                                         │
 * │ Output : true                                                       │
 * │ Explanation : No integer from 2 to √13 divides 13 evenly,           │
 * │ therefore it is a prime number.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n is an integer.                                                    │
 * │ n <= 1 is not considered prime.                                     │
 * │ Only divisors up to √n need to be checked.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : If n <= 1, return false.                                   │
 * │ Step 2 : If n == 2, return true since 2 is the smallest prime.      │
 * │ Step 3 : Iterate from 2 to √n and check divisibility.               │
 * │ Step 4 : If any divisor is found, return false; otherwise true.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics (Prime Number) | Square Root Optimization               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(√n)                                            │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════════╗
* ║ public class Prime_Number {                                              ║
* ║     public static boolean isPrime(int n) {                               ║
* ║                                                                          ║
* ║         if (n <= 1) {                                                    ║
* ║             return false;                                                ║
* ║         }                                                                ║
* ║                                                                          ║
* ║         if (n == 2) {                                                    ║
* ║             return true;                                                 ║
* ║         }                                                                ║
* ║                                                                          ║
* ║         for (int i = 2; i <= Math.sqrt(n); i++) {                        ║
* ║             if (n % i == 0) {                                            ║
* ║                 return false;                                            ║
* ║             }                                                            ║
* ║         }                                                                ║
* ║         return true;                                                     ║
* ║     }                                                                    ║
* ║                                                                          ║
* ║     public static void main(String args[]) {                             ║
* ║         System.out.println("NUMBER IS : " + isPrime(4));                 ║
* ║     }                                                                    ║
* ║ }                                                                        ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Execution Breakdown for isPrime(4):                                     ║
* ║  1. Check (4 <= 1) -> false.                                             ║
* ║  2. Check (4 == 2) -> false.                                             ║
* ║  3. Loop bounds: i starts at 2; runs while i <= Math.sqrt(4) [which is 2]║
* ║  4. Iteration 1: i = 2 -> Check (4 % 2 == 0) -> true!                    ║
* ║  5. Method immediately returns false.                                    ║
* ║                                                                          ║
* ║  Output:                                                                 ║
* ║  NUMBER IS : false                                                       ║
* ╚══════════════════════════════════════════════════════════════════════════╝
*/