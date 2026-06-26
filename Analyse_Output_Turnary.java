/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [09/06/26] → #2  [10/06/26] → #3  [11/06/26]                    │
 * │  #4  [12/06/26] → #5  [13/06/26] → #6  [14/06/26]                    │
 * │  #7  [15/06/26] → #8  [16/06/26] → #9  [17/06/26]                    │
 * │  #10 [18/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
*
* ╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 41: Ternary Operator Evaluation and Output Analysis          ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given two integers a and b, evaluate ternary expressions to         │
* │ determine a boolean result and the larger integer value.            │
* │                                                                     │
* │ The first expression checks whether a is less than b, while the     │
* │ second expression selects the greater value between a and b.        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : a = 63, b = 36                                             │
* │ Output : false                                                      │
* │          63                                                         │
* │ Explanation :                                                       │
* │ (a < b) → (63 < 36) → false, therefore x = false                    │
* │ (a > b) → (63 > 36) → true, therefore y = a = 63                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • a and b are integers                                              │
* │ • Uses ternary operator (? :)                                       │
* │ • Uses relational operators (<, >)                                  │
* │ • Constant number of evaluations                                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize integers a and b                                │
* │ Step 2 : Evaluate (a < b) using ternary operator                    │
* │ Step 3 : Assign boolean result to x                                 │
* │ Step 4 : Evaluate (a > b) using ternary operator                    │
* │ Step 5 : Assign larger value to y                                   │
* │ Step 6 : Print x and y                                              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (Ternary Operator Evaluation)                     │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant-time comparisons)                │
* │ Space Complexity : O(1)  (fixed number of variables)                │
* └─────────────────────────────────────────────────────────────────────┘
  */

public class Analyse_Output_Turnary {
    public static void main(String args[]){
        int a = 63, b = 36;
        boolean x = (a < b)? true: false;
                System.out.println(x);  // Ans = ?
        int y = (a > b)? a : b;
            System.out.println(y);  // Ans = ?
    }
}

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ PROBLEM 41: Ternary Operator Evaluation and Output Analysis          ║
* ╚══════════════════════════════════════════════════════════════════════╝
*
* ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
* │ Given two integers a and b, evaluate ternary expressions to         │
* │ determine a boolean result and the larger integer value.            │
* │                                                                     │
* │ The first expression checks whether a is less than b, while the     │
* │ second expression selects the greater value between a and b.        │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
* │ Input  : a = 63, b = 36                                             │
* │ Output : false                                                      │
* │          63                                                         │
* │ Explanation :                                                       │
* │ (a < b) → (63 < 36) → false, therefore x = false                    │
* │ (a > b) → (63 > 36) → true, therefore y = a = 63                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
* │ • a and b are integers                                              │
* │ • Uses ternary operator (? :)                                       │
* │ • Uses relational operators (<, >)                                  │
* │ • Constant number of evaluations                                    │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
* │ Step 1 : Initialize integers a and b                                │
* │ Step 2 : Evaluate (a < b) using ternary operator                    │
* │ Step 3 : Assign boolean result to x                                 │
* │ Step 4 : Evaluate (a > b) using ternary operator                    │
* │ Step 5 : Assign larger value to y                                   │
* │ Step 6 : Print x and y                                              │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
* │ Conditional Logic (Ternary Operator Evaluation)                     │
* └─────────────────────────────────────────────────────────────────────┘
*
* ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
* │ Time Complexity  : O(1)  (constant-time comparisons)                │
* │ Space Complexity : O(1)  (fixed number of variables)                │
* └─────────────────────────────────────────────────────────────────────┘
  */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Analyse_Output_Turnary {                                ║
* ║     public static void main(String args[]){                          ║
* ║         int a = 63, b = 36;                                          ║
* ║                                                                      ║
* ║         boolean x = (a < b)? true: false;                            ║
* ║         System.out.println(x);  // Ans = false                       ║
* ║                                                                      ║
* ║         int y = (a > b)? a : b;                                      ║
* ║         System.out.println(y);  // Ans = 63                          ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/