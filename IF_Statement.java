/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [06/06/26] → #2  [07/06/26] → #3  [08/06/26]                    │
 * │  #4  [09/06/26] → #5  [10/06/26] → #6  [11/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 27: Basic Conditional Check using IF Statement               ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer number, check whether it is greater than 5.        │
* │ If the condition is true, print a message along with the number.    │
* │ Otherwise, no output is produced.                                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : number = 10                                                │
* │ Output : NUMBER IS GREATER THEN 5 : 10                              │
* │ Explanation : Since 10 > 5, the condition becomes true and message  │
* │ is printed.                                                         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • number is an integer                                              │
* │ • Single conditional check only                                     │
* │ • No loops or complex branching required                            │
* │ • Comparison is strictly greater than (>)                           │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize integer variable number                         │
* │ Step 2 : Check condition (number > 5)                               │
* │ Step 3 : If condition is true, print the message                    │
* │ Step 4 : If false, terminate program without output                 │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Statements (IF Control Flow)                            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single comparison operation)              │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */


public class IF_Statement {
    public static void main(String[] args) {
        
    }
}

/* 
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 27: Basic Conditional Check using IF Statement               ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given an integer number, check whether it is greater than 5.        │
* │ If the condition is true, print a message along with the number.    │
* │ Otherwise, no output is produced.                                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : number = 10                                                │
* │ Output : NUMBER IS GREATER THEN 5 : 10                              │
* │ Explanation : Since 10 > 5, the condition becomes true and message  │
* │ is printed.                                                         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • number is an integer                                              │
* │ • Single conditional check only                                     │
* │ • No loops or complex branching required                            │
* │ • Comparison is strictly greater than (>)                           │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize integer variable number                         │
* │ Step 2 : Check condition (number > 5)                               │
* │ Step 3 : If condition is true, print the message                    │
* │ Step 4 : If false, terminate program without output                 │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Statements (IF Control Flow)                            │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (single comparison operation)              │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */


/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Analyse_Output_Expressopn_1 {                           ║
* ║     public static void main(String args[]){                          ║
* ║         int x = 10, y = 5;                                           ║
* ║                                                                      ║
* ║         int exp1 = (y * (x / y + x / y));                            ║
* ║         int exp2 = (y * x / y + y * x + y);                          ║
* ║                                                                      ║
* ║         System.out.println("VALUE IS :"+exp1);  // Ans : 20          ║
* ║         System.out.print("VALUE IS :"+exp2);    // Ans : 65          ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/