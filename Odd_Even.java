/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [06/06/26] → #2  [07/06/26] → #3  [08/06/26]                    │
 * │  #4  [09/06/26] → #5  [10/06/26] → #6  [11/06/26]                    │
 * │  #7  [12/06/26] → #8  [13/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔═════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 30: Check Whether a Number is Odd or Even using Modulo Operator ║
* ╚═════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer n, determine whether it is even or odd.            │
* │                                                                     │
* │ A number is even if it is divisible by 2, otherwise it is odd.      │
* │ The result should be printed accordingly.                           │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : n = 5                                                      │
* │ Output : NUMBER IS ODD                                              │
* │ Explanation : 5 % 2 = 1, so it is not divisible by 2 → Odd          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • n is an integer                                                   │
* │ • Uses modulo operator (%) only                                     │
* │ • No loops or advanced data structures required                     │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Take input integer n                                       │
* │ Step 2 : Compute n % 2                                              │
* │ Step 3 : If remainder is 0 → number is EVEN                         │
* │ Step 4 : Else → number is ODD                                       │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Mathematical Check (Modulo-based Parity Detection)                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single modulo operation)                  │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */


public class Odd_Even {
    public static void main(String args[]){
      
    }
}

/**
* ╔═════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 30: Check Whether a Number is Odd or Even using Modulo Operator ║
* ╚═════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer n, determine whether it is even or odd.            │
* │                                                                     │
* │ A number is even if it is divisible by 2, otherwise it is odd.      │
* │ The result should be printed accordingly.                           │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : n = 5                                                      │
* │ Output : NUMBER IS ODD                                              │
* │ Explanation : 5 % 2 = 1, so it is not divisible by 2 → Odd          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • n is an integer                                                   │
* │ • Uses modulo operator (%) only                                     │
* │ • No loops or advanced data structures required                     │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Take input integer n                                       │
* │ Step 2 : Compute n % 2                                              │
* │ Step 3 : If remainder is 0 → number is EVEN                         │
* │ Step 4 : Else → number is ODD                                       │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Mathematical Check (Modulo-based Parity Detection)                  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single modulo operation)                  │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Odd_Even {                                              ║
* ║     public static void main(String args[]){                          ║
* ║         int n = 5;                                                   ║
* ║         if(n % 2 == 0){                                              ║
* ║             System.out.println("NUMBER IS EVEN");                    ║
* ║         }else{                                                       ║
* ║             System.out.println("NUMBER IS ODD");                     ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
