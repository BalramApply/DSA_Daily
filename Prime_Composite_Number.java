/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [11/06/26] → #2  [12/06/26] → #3  [13/06/26]                    │
 * │  #4  [14/06/26] → #5  [15/06/26] → #6  [16/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 55: Check Whether a Number is Prime or Composite             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, determine whether it is a prime number or       │
 * │ a composite number.                                                 │
 * │ A prime number has exactly two factors: 1 and itself.               │
 * │ A composite number has more than two factors.                       │
 * │ Special case: 1 is neither prime nor composite.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 7                                                          │
 * │ Output : n is prime                                                 │
 * │ Explanation : 7 is divisible only by 1 and 7.                       │
 * │                                                                     │
 * │ Input  : 12                                                         │
 * │ Output : n is composite                                             │
 * │ Explanation : 12 has divisors other than 1 and itself.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • n ≥ 1                                                             │
 * │ • Handle edge case when n == 1.                                     │
 * │ • Check divisibility only up to √n for optimization.                │
 * │ • Integer input only.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Read input integer n.                                      │
 * │ Step 2 : If n == 1, directly print "neither prime nor composite".   │
 * │ Step 3 : Assume number is prime initially (isPrime = true).         │
 * │ Step 4 : Loop from i = 2 to i ≤ √n.                                 │
 * │ Step 5 : If n % i == 0, mark isPrime = false and break loop.        │
 * │ Step 6 : After loop, if isPrime is true → prime else composite.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Optimized Primality Check (Iteration up to Square Root)             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(√n)                                            │
 * │                    Only checks divisibility up to square root.      │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra variables.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Prime_Composite_Number {
    public static void main(String args[]) {
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 55: Check Whether a Number is Prime or Composite             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, determine whether it is a prime number or       │
 * │ a composite number.                                                 │
 * │ A prime number has exactly two factors: 1 and itself.               │
 * │ A composite number has more than two factors.                       │
 * │ Special case: 1 is neither prime nor composite.                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 7                                                          │
 * │ Output : n is prime                                                 │
 * │ Explanation : 7 is divisible only by 1 and 7.                       │
 * │                                                                     │
 * │ Input  : 12                                                         │
 * │ Output : n is composite                                             │
 * │ Explanation : 12 has divisors other than 1 and itself.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • n ≥ 1                                                             │
 * │ • Handle edge case when n == 1.                                     │
 * │ • Check divisibility only up to √n for optimization.                │
 * │ • Integer input only.                                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Read input integer n.                                      │
 * │ Step 2 : If n == 1, directly print "neither prime nor composite".   │
 * │ Step 3 : Assume number is prime initially (isPrime = true).         │
 * │ Step 4 : Loop from i = 2 to i ≤ √n.                                 │
 * │ Step 5 : If n % i == 0, mark isPrime = false and break loop.        │
 * │ Step 6 : After loop, if isPrime is true → prime else composite.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Optimized Primality Check (Iteration up to Square Root)             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(√n)                                            │
 * │                    Only checks divisibility up to square root.      │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra variables.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║ public class Prime_Composite_Number {                                ║
* ║     public static void main(String args[]) {                         ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         int n = sc.nextInt();                                        ║
* ║         boolean isPrime = true;                                      ║
* ║                                                                      ║
* ║         if (n <= 1) {                                                ║
* ║             System.out.println("n is neither prime nor composite");  ║
* ║         } else if (n == 2) {                                         ║
* ║             System.out.println("n is prime");                        ║
* ║         } else {                                                     ║
* ║             // Note: Condition should be i <= Math.sqrt(n)           ║
* ║             for (int i = 2; i <= Math.sqrt(n); i++) {                ║
* ║                 if (n % i == 0) {                                    ║
* ║                     isPrime = false;                                 ║
* ║                     break;                                           ║
* ║                 }                                                    ║
* ║             }                                                        ║
* ║             if (isPrime == true) {                                   ║
* ║                 System.out.println("n is prime");                    ║
* ║             } else {                                                 ║
* ║                 System.out.println("n is composite");                ║
* ║             }                                                        ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/