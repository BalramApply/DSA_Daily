/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [14/06/26] → #2  [15/06/26] → #3  [16/06/26]                    │
 * │  #4  [17/06/26] → #5  [18/06/26] → #6  [19/06/26]                    │
 * │  #7  [20/06/26] → #8  [21/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 69: Print All Prime Numbers in a Given Range                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print all prime numbers from 2 to n (inclusive).│
 * │ A helper function is used to determine whether each number is prime.│
 * │ Input: A single integer n. Output: All prime numbers up to n.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 20                                                         │
 * │ Output : 2 3 5 7 11 13 17 19                                        │
 * │ Explanation : Each number from 2 to 20 is checked for primality.    │
 * │ Only numbers having exactly two positive divisors are printed.      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n is a positive integer.                                            │
 * │ Numbers less than or equal to 1 are not prime.                      │
 * │ Each primality check examines divisors only up to √number.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create an isPrime() function to check whether a number is  │
 * │          prime using square root optimization.                      │
 * │ Step 2 : Iterate through all numbers from 2 to n.                   │
 * │ Step 3 : For each number, call isPrime().                           │
 * │ Step 4 : Print the number if isPrime() returns true.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics | Prime Number | Square Root Optimization               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : n = 10                                                      │
 * │ i = 2  → Prime  → Print 2                                           │
 * │ i = 3  → Prime  → Print 3                                           │
 * │ i = 4  → Not Prime → Skip                                           │
 * │ i = 5  → Prime  → Print 5                                           │
 * │ i = 6  → Not Prime → Skip                                           │
 * │ i = 7  → Prime  → Print 7                                           │
 * │ i = 8  → Not Prime → Skip                                           │
 * │ i = 9  → Not Prime → Skip                                           │
 * │ i = 10 → Not Prime → Skip                                           │
 * │ Output : 2 3 5 7                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n√n)                                           │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Prime_in_Range {
    
    public static void main(String args[]) {
        int number = 20;
     
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 69: Print All Prime Numbers in a Given Range                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print all prime numbers from 2 to n (inclusive).│
 * │ A helper function is used to determine whether each number is prime.│
 * │ Input: A single integer n. Output: All prime numbers up to n.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 20                                                         │
 * │ Output : 2 3 5 7 11 13 17 19                                        │
 * │ Explanation : Each number from 2 to 20 is checked for primality.    │
 * │ Only numbers having exactly two positive divisors are printed.      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n is a positive integer.                                            │
 * │ Numbers less than or equal to 1 are not prime.                      │
 * │ Each primality check examines divisors only up to √number.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create an isPrime() function to check whether a number is  │
 * │          prime using square root optimization.                      │
 * │ Step 2 : Iterate through all numbers from 2 to n.                   │
 * │ Step 3 : For each number, call isPrime().                           │
 * │ Step 4 : Print the number if isPrime() returns true.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Mathematics | Prime Number | Square Root Optimization               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : n = 10                                                      │
 * │ i = 2  → Prime  → Print 2                                           │
 * │ i = 3  → Prime  → Print 3                                           │
 * │ i = 4  → Not Prime → Skip                                           │
 * │ i = 5  → Prime  → Print 5                                           │
 * │ i = 6  → Not Prime → Skip                                           │
 * │ i = 7  → Prime  → Print 7                                           │
 * │ i = 8  → Not Prime → Skip                                           │
 * │ i = 9  → Not Prime → Skip                                           │
 * │ i = 10 → Not Prime → Skip                                           │
 * │ Output : 2 3 5 7                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n√n)                                           │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Prime_in_Range {                                        ║
* ║     public static boolean isPrime(int n){                            ║
* ║                                                                      ║
* ║         if (n<= 1) {                                                 ║
* ║             return false;                                            ║
* ║         }                                                            ║
* ║         if(n == 2){                                                  ║
* ║             return true;                                             ║
* ║         }                                                            ║
* ║         for(int i=2; i<=Math.sqrt(n); i++){                          ║
* ║             if(n % i == 0){                                          ║
* ║                 return false;                                        ║
* ║             }                                                        ║
* ║         }                                                            ║
* ║         return true;                                                 ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void primesInRange(int n) {                        ║
* ║         for (int i = 2; i <= n; i++) {                               ║
* ║             if (isPrime(i)) {                                        ║
* ║                 System.out.print(i + " ");                           ║
* ║             }                                                        ║
* ║         }                                                            ║
* ║         System.out.println();                                        ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]) {                         ║
* ║         int n = 20;                                                  ║
* ║         System.out.println("PRIME NUMBER IN RANGE " + n + " IS : "); ║
* ║         primesInRange(n);                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Execution Breakdown:                                                ║
* ║  - main() passes n = 20 to primesInRange().                          ║
* ║  - The loop evaluates every integer from 2 up to 20.                 ║
* ║  - isPrime(i) checks for factors up to √i for optimal efficiency.    ║
* ║                                                                      ║
* ║  Output:                                                             ║
* ║  PRIME NUMBER IN RANGE 20 IS :                                       ║
* ║  2 3 5 7 11 13 17 19                                                 ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
