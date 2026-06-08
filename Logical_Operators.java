/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [04/06/26] → #2  [05/06/26] → #3  [06/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 19: Logical Operators & Short-Circuit Evaluation            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate, evaluate, and analyze the behavioral outcomes of standard│
 * │ logical operators (&&, ||, !) when handling boolean expressions and │
 * │ condition chaining in Java.                                          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TRUTH TABLES & SHORT-CIRCUIT RULES ────────────────────────────────┐
 * │ • Logical AND (A && B): Yields true ONLY if both A and B are true.   │
 * │   Short-circuit feature: If A is false, B is not evaluated.          │
 * │                                                                      │
 * │ • Logical OR (A || B):  Yields true if at least one operand is true. │
 * │   Short-circuit feature: If A is true, B is not evaluated.           │
 * │                                                                      │
 * │ • Logical NOT (!A):     Unverts/negates the boolean state.           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE CASES ────────────────────────────────────────────────────┐
 * │ 1. Logical AND:                                                      │
 * │    Input:  (3 < 2) && (3 < 5)                                        │
 * │    Output: false                                                     │
 * │    Explanation: First expression evaluates to false, terminating     │
 * │                 evaluation immediately due to short-circuit logic.   │
 * │                                                                      │
 * │ 2. Logical OR:                                                       │
 * │    Input:  (3 < 2) || (3 < 5)                                        │
 * │    Output: true                                                      │
 * │    Explanation: First expression is false, but secondary condition   │
 * │                 (3 < 5) evaluates to true, resulting in true.        │
 * │                                                                      │
 * │ 3. Logical NOT:                                                      │
 * │    Input:  !(3 < 5)                                                  │
 * │    Output: false                                                     │
 * │    Explanation: Condition (3 < 5) is true; the unary NOT operator     │
 * │                 flips it to false.                                   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Condition Mocking:    Construct relational expressions that yield  │
 * │                          explicit boolean results (true or false).    │
 * │ 2. Boolean Compounding:  Apply &&, ||, and ! operators to evaluate    │
 * │                          combined truth states.                       │
 * │ 3. Result Inspection:    Log final evaluations to confirm proper     │
 * │                          short-circuit precedence.                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Boolean Logic & Control-Flow Short-Circuit Evaluation        │
 * │ Limit:  Operands must evaluate strictly to boolean expressions       │
 * │                                                                      │
 * │ Time:   O(1) → Static logical gating resolves instantaneously in the │
 * │                JVM environment using minimal cpu branching steps.    │
 * │                                                                      │
 * │ Space:  O(1) → Operates on transient variables or immediate stack   │
 * │                evaluations with zero dynamic memory overhead.        │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Logical_Operators {
    public static void main(String[] args) {
        
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 19: Logical Operators & Short-Circuit Evaluation            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate, evaluate, and analyze the behavioral outcomes of standard│
 * │ logical operators (&&, ||, !) when handling boolean expressions and │
 * │ condition chaining in Java.                                          │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TRUTH TABLES & SHORT-CIRCUIT RULES ────────────────────────────────┐
 * │ • Logical AND (A && B): Yields true ONLY if both A and B are true.   │
 * │   Short-circuit feature: If A is false, B is not evaluated.          │
 * │                                                                      │
 * │ • Logical OR (A || B):  Yields true if at least one operand is true. │
 * │   Short-circuit feature: If A is true, B is not evaluated.           │
 * │                                                                      │
 * │ • Logical NOT (!A):     Unverts/negates the boolean state.           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE CASES ────────────────────────────────────────────────────┐
 * │ 1. Logical AND:                                                      │
 * │    Input:  (3 < 2) && (3 < 5)                                        │
 * │    Output: false                                                     │
 * │    Explanation: First expression evaluates to false, terminating     │
 * │                 evaluation immediately due to short-circuit logic.   │
 * │                                                                      │
 * │ 2. Logical OR:                                                       │
 * │    Input:  (3 < 2) || (3 < 5)                                        │
 * │    Output: true                                                      │
 * │    Explanation: First expression is false, but secondary condition   │
 * │                 (3 < 5) evaluates to true, resulting in true.        │
 * │                                                                      │
 * │ 3. Logical NOT:                                                      │
 * │    Input:  !(3 < 5)                                                  │
 * │    Output: false                                                     │
 * │    Explanation: Condition (3 < 5) is true; the unary NOT operator     │
 * │                 flips it to false.                                   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Condition Mocking:    Construct relational expressions that yield  │
 * │                          explicit boolean results (true or false).    │
 * │ 2. Boolean Compounding:  Apply &&, ||, and ! operators to evaluate    │
 * │                          combined truth states.                       │
 * │ 3. Result Inspection:    Log final evaluations to confirm proper     │
 * │                          short-circuit precedence.                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Boolean Logic & Control-Flow Short-Circuit Evaluation        │
 * │ Limit:  Operands must evaluate strictly to boolean expressions       │
 * │                                                                      │
 * │ Time:   O(1) → Static logical gating resolves instantaneously in the │
 * │                JVM environment using minimal cpu branching steps.    │
 * │                                                                      │
 * │ Space:  O(1) → Operates on transient variables or immediate stack   │
 * │                evaluations with zero dynamic memory overhead.        │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Logical_Operators {
//     public static void main(String[] args) {
//         // Logical AND (&&) - Both conditions must be true
//         System.out.println("AND OPERATOR " + ((3 < 2) && (3 < 5))); // false
        
//         // Logical OR (||) - At least one condition must be true
//         System.out.println("OR OPERATOR " + ((3 < 2) || (3 < 5))); // true
        
//         // Logical NOT (!) - Negates the condition
//         System.out.println("NOT OPERATOR" + (!(3 < 5))); // false
//     }
// }
