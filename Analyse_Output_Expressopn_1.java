/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [06/06/26] → #2  [07/06/26] → #3  [08/06/26]                    │
 * │  #4  [09/06/26] → #5  [10/06/26] → #6  [11/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔════════════════════════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 26: Operator Precedence Comparison using Parentheses vs Flat Expression Evaluation ║
* ╚════════════════════════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given two arithmetic expressions using the same integer variables x │
* │ and y, evaluate both expressions and compare how parentheses affect │
* │ computation order versus flat left-to-right evaluation with operator│
* │ precedence rules.                                                   │
* │                                                                     │
* │ Expression 1 uses explicit parentheses to enforce grouping.         │
* │ Expression 2 relies on standard operator precedence rules.          │
* │ Return both evaluated integer results.                              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : x = 10, y = 5                                              │
* │ Output : exp1 = 20, exp2 = 65                                       │
* │ Explanation :                                                       │
* │                                                                     │
* │ Expression 1: y * (x / y + x / y)                                   │
* │ → (10 / 5 + 10 / 5) = (2 + 2) = 4                                   │
* │ → 5 * 4 = 20                                                        │
* │                                                                     │
* │ Expression 2: y * x / y + y * x + y                                 │
* │ → 5*10/5 = 10                                                       │
* │ → 5*10 = 50                                                         │
* │ → + 5 = 65                                                          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • x, y are integers                                                 │
* │ • y ≠ 0 (to avoid division by zero)                                 │
* │ • Integer division truncates toward zero                            │
* │ • '*' and '/' have equal precedence and are evaluated left-to-right │
* │ • '+' is evaluated after all multiplicative operations              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize integer variables x and y                       │
* │ Step 2 : Evaluate Expression 1 by resolving parentheses first       │
* │ Step 3 : Apply integer division and multiplication sequentially     │
* │ Step 4 : Evaluate Expression 2 using operator precedence rules      │
* │ Step 5 : Sum all intermediate results for final outputs             │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Expression Evaluation (Operator Precedence & Parenthesis Handling)  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (fixed number of arithmetic operations)    │
* │ Space Complexity : O(1)  (constant memory usage)                    │
* └─────────────────────────────────────────────────────────────────────┘
  */


public class Analyse_Output_Expressopn_1 {
    public static void main(String args[]){
        int x = 10, y = 5;
        
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x + y);

        System.out.println("VALUE IS : "+exp1);  // Ans : 
        System.out.print("VALUE IS : "+exp2);    // Ans : 
    }
}

/* ╔═══════════════════════════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 26: Operator Precedence Comparison using Parentheses vs Flat Expression Evaluation ║
* ╚════════════════════════════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given two arithmetic expressions using the same integer variables x │
* │ and y, evaluate both expressions and compare how parentheses affect │
* │ computation order versus flat left-to-right evaluation with operator│
* │ precedence rules.                                                   │
* │                                                                     │
* │ Expression 1 uses explicit parentheses to enforce grouping.         │
* │ Expression 2 relies on standard operator precedence rules.          │
* │ Return both evaluated integer results.                              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : x = 10, y = 5                                              │
* │ Output : exp1 = 20, exp2 = 65                                       │
* │ Explanation :                                                       │
* │                                                                     │
* │ Expression 1: y * (x / y + x / y)                                   │
* │ → (10 / 5 + 10 / 5) = (2 + 2) = 4                                   │
* │ → 5 * 4 = 20                                                        │
* │                                                                     │
* │ Expression 2: y * x / y + y * x + y                                 │
* │ → 5*10/5 = 10                                                       │
* │ → 5*10 = 50                                                         │
* │ → + 5 = 65                                                          │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • x, y are integers                                                 │
* │ • y ≠ 0 (to avoid division by zero)                                 │
* │ • Integer division truncates toward zero                            │
* │ • '*' and '/' have equal precedence and are evaluated left-to-right │
* │ • '+' is evaluated after all multiplicative operations              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize integer variables x and y                       │
* │ Step 2 : Evaluate Expression 1 by resolving parentheses first       │
* │ Step 3 : Apply integer division and multiplication sequentially     │
* │ Step 4 : Evaluate Expression 2 using operator precedence rules      │
* │ Step 5 : Sum all intermediate results for final outputs             │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Expression Evaluation (Operator Precedence & Parenthesis Handling)  │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (fixed number of arithmetic operations)    │
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
