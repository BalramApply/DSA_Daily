/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [12/06/26] → #2  [13/06/26] → #3  [14/06/26]                    │
 * │  #4  [15/06/26] → #5  [16/06/26] → #6  [17/06/26]                    │
 * │  #7  [18/06/26] → #8  [19/06/26] → #9  [20/06/26]                    │
 * │  #10 [21/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 59: Print the Multiplication Table of a Number               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print its multiplication table from             │
 * │ 1 to 10 in the standard format:                                     │
 * │ n × i = result                                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 5                                                          │
 * │ Output :                                                            │
 * │ 5 * 1 = 5                                                           │
 * │ 5 * 2 = 10                                                          │
 * │ 5 * 3 = 15                                                          │
 * │ ...                                                                 │
 * │ 5 * 10 = 50                                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The program multiplies the given number by every integer            │
 * │ from 1 to 10 and prints the result.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Input can be any integer.                                         │
 * │ • Print exactly 10 multiples.                                       │
 * │ • Use a for loop for iteration.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Read the integer n from the user.                          │
 * │ Step 2 : Iterate from i = 1 to 10.                                  │
 * │ Step 3 : Compute table = n × i.                                     │
 * │ Step 4 : Print the multiplication expression and result.            │
 * │ Step 5 : Repeat until all 10 multiples are printed.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 3                                                           │
 * │ i = 1 → 3 × 1 = 3                                                   │
 * │ i = 2 → 3 × 2 = 6                                                   │
 * │ i = 3 → 3 × 3 = 9                                                   │
 * │ ...                                                                 │
 * │ i = 10 → 3 × 10 = 30                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Multiplication (For Loop)                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    The loop always executes exactly 10 iterations.  │
 * │                    (Can also be viewed as O(n) for k fixed outputs.)│
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

import java.util.Scanner;
public class Table_of_N {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 59: Print the Multiplication Table of a Number               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print its multiplication table from             │
 * │ 1 to 10 in the standard format:                                     │
 * │ n × i = result                                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : 5                                                          │
 * │ Output :                                                            │
 * │ 5 * 1 = 5                                                           │
 * │ 5 * 2 = 10                                                          │
 * │ 5 * 3 = 15                                                          │
 * │ ...                                                                 │
 * │ 5 * 10 = 50                                                         │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The program multiplies the given number by every integer            │
 * │ from 1 to 10 and prints the result.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Input can be any integer.                                         │
 * │ • Print exactly 10 multiples.                                       │
 * │ • Use a for loop for iteration.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Read the integer n from the user.                          │
 * │ Step 2 : Iterate from i = 1 to 10.                                  │
 * │ Step 3 : Compute table = n × i.                                     │
 * │ Step 4 : Print the multiplication expression and result.            │
 * │ Step 5 : Repeat until all 10 multiples are printed.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Input : 3                                                           │
 * │ i = 1 → 3 × 1 = 3                                                   │
 * │ i = 2 → 3 × 2 = 6                                                   │
 * │ i = 3 → 3 × 3 = 9                                                   │
 * │ ...                                                                 │
 * │ i = 10 → 3 × 10 = 30                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Multiplication (For Loop)                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    The loop always executes exactly 10 iterations.  │
 * │                    (Can also be viewed as O(n) for k fixed outputs.)│
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ import java.util.Scanner;                                            ║
* ║ public class Table_of_N {                                            ║
* ║     public static void main(String args[]){                          ║
* ║         Scanner sc = new Scanner(System.in);                         ║
* ║         int table = 1;                                               ║
* ║         System.out.print("ENTER THE TABLE NUMBER : ");               ║
* ║         int n = sc.nextInt();                                        ║
* ║                                                                      ║
* ║         for(int i=1; i<=10; i++){                                    ║
* ║             table = i * n;                                           ║
* ║             System.out.println(n + " * " + i + " = " + table);       ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/