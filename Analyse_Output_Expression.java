/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [07/06/26]                    │
 * │  #4  [08/06/26] → #5  [09/06/26] → #6  [10/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔═════════════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 25: Expression Evaluation with Operator Precedence & Integer Truncation ║
* ╚═════════════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Evaluate a complex arithmetic expression involving multiple terms   │
* │ with operators *, /, + and nested parentheses.                      │
* │ The expression must respect operator precedence, left-to-right      │
* │ evaluation for * and /, and integer division truncation rules.      │
* │                                                                     │
* │ Given integer variables x, y, a, b, c, compute final value of       │
* │ the expression and return the integer result.                       │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : x = 9, y = 12, a = 2, b = 4, c = 6                         │
* │ Output : 278                                                        │
* │ Explanation :                                                       │
* │ Term 1: 4 / 3 * (x + 34) = 1 * 43 = 43                              │
* │ Term 2: 9 * (a + b * c) = 9 * (2 + 24) = 234                        │
* │ Term 3: (3 + y*(2+a)) / (a + b*y) = 51 / 50 = 1                     │
* │ Final result = 43 + 234 + 1 = 278                                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • All variables are integers                                        │
* │ • Integer division truncates toward zero                            │
* │ • No division by zero occurs in valid inputs                        │
* │ • Expression evaluation follows operator precedence rules           │
* │ • Values remain within 32-bit integer range                         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Assign integer values to variables x, y, a, b, c           │
* │ Step 2 : Evaluate multiplication and division first (left-to-right) │
* │ Step 3 : Evaluate expressions inside parentheses recursively        │
* │ Step 4 : Sum all evaluated terms to get final result                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Arithmetic Expression Evaluation (Operator Precedence Parsing)      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant number of arithmetic operations) │
* │ Space Complexity : O(1)  (only fixed integer variables used)        │
* └─────────────────────────────────────────────────────────────────────┘
  */

public class Analyse_Output_Expression {
    public static void main(String args[]){
        int x = 9, y = 12;
        int a =2, b = 4, c = 6;

        int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
        System.out.println("VALUE IS :"+exp);   // Ans = 
    }
}
/**
* ╔═════════════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 25: Expression Evaluation with Operator Precedence & Integer Truncation ║
* ╚═════════════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Evaluate a complex arithmetic expression involving multiple terms   │
* │ with operators *, /, + and nested parentheses.                      │
* │ The expression must respect operator precedence, left-to-right      │
* │ evaluation for * and /, and integer division truncation rules.      │
* │                                                                     │
* │ Given integer variables x, y, a, b, c, compute final value of       │
* │ the expression and return the integer result.                       │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : x = 9, y = 12, a = 2, b = 4, c = 6                         │
* │ Output : 278                                                        │
* │ Explanation :                                                       │
* │ Term 1: 4 / 3 * (x + 34) = 1 * 43 = 43                              │
* │ Term 2: 9 * (a + b * c) = 9 * (2 + 24) = 234                        │
* │ Term 3: (3 + y*(2+a)) / (a + b*y) = 51 / 50 = 1                     │
* │ Final result = 43 + 234 + 1 = 278                                   │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • All variables are integers                                        │
* │ • Integer division truncates toward zero                            │
* │ • No division by zero occurs in valid inputs                        │
* │ • Expression evaluation follows operator precedence rules           │
* │ • Values remain within 32-bit integer range                         │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Assign integer values to variables x, y, a, b, c           │
* │ Step 2 : Evaluate multiplication and division first (left-to-right) │
* │ Step 3 : Evaluate expressions inside parentheses recursively        │
* │ Step 4 : Sum all evaluated terms to get final result                │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Arithmetic Expression Evaluation (Operator Precedence Parsing)      │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant number of arithmetic operations) │
* │ Space Complexity : O(1)  (only fixed integer variables used)        │
* └─────────────────────────────────────────────────────────────────────┘
  */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Analyse_Output_Expression {                             ║
* ║     public static void main(String args[]){                          ║
* ║         int x = 9, y = 12;                                           ║
* ║         int a = 2, b = 4, c = 6;                                     ║
* ║                                                                      ║
* ║         int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) +               ║
* ║                   (3 + y * (2 + a)) / (a + b * y);                   ║
* ║         System.out.println("VALUE IS :"+exp); // Ans = 278           ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/