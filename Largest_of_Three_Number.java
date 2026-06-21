/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [07/06/26] → #2  [08/06/26] → #3  [09/06/26]                    │
 * │  #4  [10/06/26] → #5  [11/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 33: Find the Largest among Three Numbers using Conditional Logic ║
* ╚══════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given three integers a, b, and c, determine the largest value among │
* │ them using conditional statements.                                  │
* │                                                                     │
* │ The program compares all three numbers and prints which one is      │
* │ the greatest.                                                       │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : a = 1, b = 3, c = 6                                        │
* │ Output : largest is c                                               │
* │ Explanation : 6 is greater than both 1 and 3, so c is largest.      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • a, b, c are integers                                              │
* │ • Only conditional comparisons are used                             │
* │ • No sorting or data structures involved                            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize three integers a, b, and c                      │
* │ Step 2 : Compare a with b and c using logical AND condition         │
* │ Step 3 : If a is greatest → print "largest is a"                    │
* │ Step 4 : Else check if b ≥ c → print "largest is b"                 │
* │ Step 5 : Otherwise → print "largest is c"                           │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Comparison (If-Else Ladder with Logical Operators)      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant number of comparisons)           │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */


public class Largest_of_Three_Number {
    public static void main(String args[]){
        
    }
}

/*
* ╔══════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 33: Find the Largest among Three Numbers using Conditional Logic ║
* ╚══════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given three integers a, b, and c, determine the largest value among │
* │ them using conditional statements.                                  │
* │                                                                     │
* │ The program compares all three numbers and prints which one is      │
* │ the greatest.                                                       │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : a = 1, b = 3, c = 6                                        │
* │ Output : largest is c                                               │
* │ Explanation : 6 is greater than both 1 and 3, so c is largest.      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • a, b, c are integers                                              │
* │ • Only conditional comparisons are used                             │
* │ • No sorting or data structures involved                            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize three integers a, b, and c                      │
* │ Step 2 : Compare a with b and c using logical AND condition         │
* │ Step 3 : If a is greatest → print "largest is a"                    │
* │ Step 4 : Else check if b ≥ c → print "largest is b"                 │
* │ Step 5 : Otherwise → print "largest is c"                           │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Comparison (If-Else Ladder with Logical Operators)      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant number of comparisons)           │
* │ Space Complexity : O(1)  (no extra memory used)                     │
* └─────────────────────────────────────────────────────────────────────┘
  */


/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Largest_of_Three_Number {                               ║
* ║     public static void main(String args[]){                          ║
* ║         int a = 1;                                                   ║
* ║         int b = 3;                                                   ║
* ║         int c = 6;                                                   ║
* ║         if(a >= b && (a >= c)){                                      ║
* ║             System.out.println("largest is a");                      ║
* ║         }                                                            ║
* ║         else if(b >= c){                                             ║
* ║             System.out.println("largest is b");                      ║
* ║         }                                                            ║
* ║         else{                                                        ║
* ║             System.out.println("largest is c");                      ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
