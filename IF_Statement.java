/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [06/06/26] → #2  [07/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 27: Single-Selection Conditional Branching                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Validate an integer input against a fixed threshold boundary using an     │
 * │ isolated single-selection conditional statement (`if`), executing standard│
 * │ console output only when the condition evaluates to true.            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONDITIONAL EXECUTION MECHANICS ──────────────────────────────────┐
 * │ • Single-Selection: The `if` statement isolates an expression block. │
 * │   If the boolean condition passes, control flows into the nested     │
 * │   statement block; if false, execution bypasses the block entirely.  │
 * │                                                                      │
 * │ • Zero Fallback: Without an accompanying `else` branch, a false      │
 * │   evaluation yields no operational side effects or fallback outputs.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input:  number = 10                                                  │
 * │                                                                      │
 * │ Condition Checking:                                                  │
 * │  • Expression: (number > 5)                                          │
 * │  • Evaluation: (10 > 5) ──> true                                     │
 * │                                                                      │
 * │ Output Log:                                                          │
 * │   Number is greater than 5                                           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. State Setup:        Declare and allocate a local primitive integer │
 * │                        variable named `number`.                      │
 * │ 2. Relational Gating:  Insert an `if` control block bound to a strict │
 * │                        greater-than relational expression (`>`).     │
 * │ 3. Execution Routing:  Nest the standard output console string print │
 * │                        directly within the true execution path.      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Basic Selection Control Flow / Decision Making               │
 * │ Limit:  Operates symmetrically across all signed integer values      │
 * │                                                                      │
 * │ Time:   O(1) → Branch evaluation and jump choices execute instantly  │
 * │                at the processor level within stable, fixed cycles.   │
 * │                                                                      │
 * │ Space:  O(1) → Memory overhead is completely restricted to a single   │
 * │                non-scaling thread register slot.                      │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class IF_Statement {
    public static void main(String[] args) {
        
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 11: Single-Selection Conditional Branching                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Validate an integer input against a fixed threshold boundary using an │
 * │ isolated single-selection conditional statement (`if`), executing standard│
 * │ console output only when the condition evaluates to true.            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONDITIONAL EXECUTION MECHANICS ──────────────────────────────────┐
 * │ • Single-Selection: The `if` statement isolates an expression block. │
 * │   If the boolean condition passes, control flows into the nested     │
 * │   statement block; if false, execution bypasses the block entirely.  │
 * │                                                                      │
 * │ • Zero Fallback: Without an accompanying `else` branch, a false      │
 * │   evaluation yields no operational side effects or fallback outputs.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input:  number = 10                                                  │
 * │                                                                      │
 * │ Condition Checking:                                                  │
 * │  • Expression: (number > 5)                                          │
 * │  • Evaluation: (10 > 5) ──> true                                     │
 * │                                                                      │
 * │ Output Log:                                                          │
 * │   Number is greater than 5                                           │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. State Setup:        Declare and allocate a local primitive integer │
 * │                        variable named `number`.                      │
 * │ 2. Relational Gating:  Insert an `if` control block bound to a strict │
 * │                        greater-than relational expression (`>`).     │
 * │ 3. Execution Routing:  Nest the standard output console string print │
 * │                        directly within the true execution path.      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Basic Selection Control Flow / Decision Making               │
 * │ Limit:  Operates symmetrically across all signed integer values      │
 * │                                                                      │
 * │ Time:   O(1) → Branch evaluation and jump choices execute instantly  │
 * │                at the processor level within stable, fixed cycles.   │
 * │                                                                      │
 * │ Space:  O(1) → Memory overhead is completely restricted to a single   │
 * │                non-scaling thread register slot.                      │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class IF_Statement {
//     public static void main(String[] args) {
//         int number = 10;
//         if (number > 5) {
//             System.out.println("NUMBER IS GREATER THEN 5 : "+number);
//         }
//     }
// }