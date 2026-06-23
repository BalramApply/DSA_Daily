/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [06/06/26] → #2  [07/06/26] → #3  [08/06/26]                    │
 * │  #4  [09/06/26] → #5  [10/06/26] → #6  [11/06/26]                    │
 * │  #7  [12/06/26] → #8  [13/06/26] → #9  [14/06/26]                    │
 * │  #10 [15/06/26]                                                      │
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
* ║ public class IF_Statement {                                          ║
* ║     public static void main(String[] args) {                         ║
* ║         int number = 10;                                             ║
* ║         if (number > 5) {                                            ║
* ║             System.out.println("NUMBER IS GREATER THAN 5 : "+number);║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Output:                                                             ║
* ║  NUMBER IS GREATER THAN 5 : 10                                       ║
* ║                                                                      ║
* ║  Note: Evaluates the conditional clause (10 > 5), which is true,     ║
* ║  and executes the code body nested inside the if-block.              ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/