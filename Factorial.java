/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [12/06/26] → #2  [13/06/26] → #3  [14/06/26]                    │
 * │  #4  [15/06/26] → #5  [16/06/26] → #6  [17/06/26]                    │
 * │  #7  [18/06/26] → #8  [19/06/26] → #9  [20/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 58: Find the Factorial of a Number                           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a non-negative integer n, compute its factorial.              │
 * │ The factorial of a number is the product of all positive integers   │
 * │ from 1 to n.                                                        │
 * │ Factorial is denoted by n!                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 5                                                          │
 * │ Output : FACTORIAL IS : 120                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ 5! = 1 × 2 × 3 × 4 × 5 = 120                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • n ≥ 0                                                             │
 * │ • Factorial of 0 is 1.                                              │
 * │ • Result should fit within the integer data type used.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Read the input number n.                                   │
 * │ Step 2 : Initialize fact = 1.                                       │
 * │ Step 3 : Iterate from i = 1 to n.                                   │
 * │ Step 4 : Multiply fact by i in each iteration.                      │
 * │ Step 5 : After the loop, print the value of fact.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 5                                                           │
 * │ fact = 1                                                            │
 * │ i = 1 → fact = 1                                                    │
 * │ i = 2 → fact = 2                                                    │
 * │ i = 3 → fact = 6                                                    │
 * │ i = 4 → fact = 24                                                   │
 * │ i = 5 → fact = 120                                                  │
 * │ Output : FACTORIAL IS : 120                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Multiplication (For Loop)                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │                    The loop executes n times.                       │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 58: Find the Factorial of a Number                           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given a non-negative integer n, compute its factorial.              │
 * │ The factorial of a number is the product of all positive integers   │
 * │ from 1 to n.                                                        │
 * │ Factorial is denoted by n!                                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 5                                                          │
 * │ Output : FACTORIAL IS : 120                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ 5! = 1 × 2 × 3 × 4 × 5 = 120                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • n ≥ 0                                                             │
 * │ • Factorial of 0 is 1.                                              │
 * │ • Result should fit within the integer data type used.              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Read the input number n.                                   │
 * │ Step 2 : Initialize fact = 1.                                       │
 * │ Step 3 : Iterate from i = 1 to n.                                   │
 * │ Step 4 : Multiply fact by i in each iteration.                      │
 * │ Step 5 : After the loop, print the value of fact.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 5                                                           │
 * │ fact = 1                                                            │
 * │ i = 1 → fact = 1                                                    │
 * │ i = 2 → fact = 2                                                    │
 * │ i = 3 → fact = 6                                                    │
 * │ i = 4 → fact = 24                                                   │
 * │ i = 5 → fact = 120                                                  │
 * │ Output : FACTORIAL IS : 120                                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Multiplication (For Loop)                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n)                                             │
 * │                    The loop executes n times.                       │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║ public class Factorial {                                             ║
* ║     public static void main(String[] args) {                         ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         int fact = 1;                                                ║
* ║         System.out.print("ENTER THE NUMBER : ");                     ║
* ║         int n = sc.nextInt();                                        ║
* ║                                                                      ║
* ║         for(int i=1; i<=n; i++){                                     ║
* ║             fact *= i;                                               ║
* ║         }                                                            ║
* ║         System.out.println("FACTORIAL IS : "+fact);                  ║
* ║         // Note: Works correctly for small non-negative integers.    ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
