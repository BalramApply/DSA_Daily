/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [04/06/26] → #2  [05/06/26] → #3  [06/06/26]                    │
 * │  #4  [07/06/26] → #5  [08/06/26] → #6  [09/06/26]                    │
 * │  #7  [10/06/26] → #8  [11/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 19: Logical Operators & Short-Circuit Evaluation             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate the behavior of logical operators (&&, ||, !) and       │
 * │ understand how short-circuit evaluation works with boolean          │
 * │ expressions in Java.                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : (3 < 2) && (3 < 5)                                         │
 * │ Output : false                                                      │
 * │                                                                     │
 * │ Input  : (3 < 2) || (3 < 5)                                         │
 * │ Output : true                                                       │
 * │                                                                     │
 * │ Input  : !(3 < 5)                                                   │
 * │ Output : false                                                      │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ AND requires both conditions to be true.                            │
 * │ OR requires at least one condition to be true.                      │
 * │ NOT reverses the boolean result.                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Operands must evaluate to boolean values.                           │
 * │ Short-circuiting may skip evaluation of later conditions.           │
 * │ Logical operators cannot be applied directly to non-boolean types.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create boolean expressions using relational operators.     │
 * │ Step 2 : Apply logical AND (&&) and observe the result.             │
 * │ Step 3 : Apply logical OR (||) and observe the result.              │
 * │ Step 4 : Apply logical NOT (!) to negate a condition.               │
 * │ Step 5 : Print all evaluated boolean results.                       │
 * │ Step 6 : Analyze short-circuit behavior during evaluation.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Boolean Logic / Logical Operators                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Logical_Operators {
    public static void main(String[] args) {
        
    }
}

/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 19: Logical Operators & Short-Circuit Evaluation             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate the behavior of logical operators (&&, ||, !) and       │
 * │ understand how short-circuit evaluation works with boolean          │
 * │ expressions in Java.                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : (3 < 2) && (3 < 5)                                         │
 * │ Output : false                                                      │
 * │                                                                     │
 * │ Input  : (3 < 2) || (3 < 5)                                         │
 * │ Output : true                                                       │
 * │                                                                     │
 * │ Input  : !(3 < 5)                                                   │
 * │ Output : false                                                      │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ AND requires both conditions to be true.                            │
 * │ OR requires at least one condition to be true.                      │
 * │ NOT reverses the boolean result.                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Operands must evaluate to boolean values.                           │
 * │ Short-circuiting may skip evaluation of later conditions.           │
 * │ Logical operators cannot be applied directly to non-boolean types.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Create boolean expressions using relational operators.     │
 * │ Step 2 : Apply logical AND (&&) and observe the result.             │
 * │ Step 3 : Apply logical OR (||) and observe the result.              │
 * │ Step 4 : Apply logical NOT (!) to negate a condition.               │
 * │ Step 5 : Print all evaluated boolean results.                       │
 * │ Step 6 : Analyze short-circuit behavior during evaluation.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Boolean Logic / Logical Operators                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Logical_Operators {                                     ║
* ║     public static void main(String[] args) {                         ║
* ║         // Logical AND (&&) - Both conditions must be true           ║
* ║         System.out.println("AND OPERATOR " + ((3 < 2) && (3 < 5)));  ║
* ║                                                                      ║
* ║         // Logical OR (||) - At least one condition must be true     ║
* ║         System.out.println("OR OPERATOR " + ((3 < 2) || (3 < 5)));   ║
* ║                                                                      ║
* ║         // Logical NOT (!) - Negates the condition                   ║
* ║         System.out.println("NOT OPERATOR" + (!(3 < 5)));             ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
