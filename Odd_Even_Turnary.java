/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [07/06/26] → #2  [08/06/26] → #3  [09/06/26]                    │
 * │  #4  [10/06/26] → #5  [11/06/26] → #6  [12/06/26]                    │
 * │  #7  [13/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 34: Check Odd or Even using Ternary Operator                 ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer n, determine whether it is even or odd using a     │
* │ ternary operator.                                                   │
* │                                                                     │
* │ If n is divisible by 2, output "even", otherwise output "odd".      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : n = 55                                                     │
* │ Output : odd                                                        │
* │ Explanation : 55 % 2 = 1, so condition evaluates to "odd".          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • n is an integer                                                   │
* │ • Uses ternary operator only                                        │
* │ • No loops or additional data structures                            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Take integer input n                                       │
* │ Step 2 : Evaluate condition (n % 2 == 0)                            │
* │ Step 3 : If true → assign "even"                                    │
* │ Step 4 : Else → assign "odd"                                        │
* │ Step 5 : Print result                                               │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Expression (Ternary Operator / Parity Check)            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single modulo + condition evaluation)     │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */


public class Odd_Even_Turnary {
    public static void main(String args[]){
        
    }
}

/**
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 34: Check Odd or Even using Ternary Operator                 ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer n, determine whether it is even or odd using a     │
* │ ternary operator.                                                   │
* │                                                                     │
* │ If n is divisible by 2, output "even", otherwise output "odd".      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : n = 55                                                     │
* │ Output : odd                                                        │
* │ Explanation : 55 % 2 = 1, so condition evaluates to "odd".          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • n is an integer                                                   │
* │ • Uses ternary operator only                                        │
* │ • No loops or additional data structures                            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Take integer input n                                       │
* │ Step 2 : Evaluate condition (n % 2 == 0)                            │
* │ Step 3 : If true → assign "even"                                    │
* │ Step 4 : Else → assign "odd"                                        │
* │ Step 5 : Print result                                               │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Expression (Ternary Operator / Parity Check)            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single modulo + condition evaluation)     │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Odd_Even_Turnary {                                      ║
* ║     public static void main(String args[]){                          ║
* ║         int n = 55;                                                  ║
* ║         String type = ((n % 2) == 0) ? "even" : "odd";               ║
* ║         System.out.println(type);                                    ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
