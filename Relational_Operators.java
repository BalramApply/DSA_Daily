/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [04/06/26] → #2  [05/06/26] → #3  [06/06/26]                    │
 * │  #4  [07/06/26] → #5  [08/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 20: Relational Operators & Comparative Logic                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate, evaluate, and analyze the boolean output outcomes of    │
 * │ standard relational operators (==, !=, >, <, >=, <=) when comparing  │
 * │ two distinct primitive integer variables in Java.                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── COMPARISON MATRIX ────────────────────────────────────────────────┐
 * │ • Equality Check (==):       Returns true if both values are identical.│
 * │ • Inequality Check (!=):     Returns true if values differ.            │
 * │ • Strict Ordering (>, <):    Evaluates true if left side is strictly   │
 * │                              greater than or less than the right side. │
 * │ • Non-Strict Ordering (>=,<=): Evaluates true if conditions meet either│
 * │                              strict bounds or exact equality values.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE CASES ────────────────────────────────────────────────────┐
 * │ Input:  A = 10, B = 5                                                │
 * │ Output:                                                              │
 * │   EQUAL TO:                  false                                   │
 * │   NOT EQUAL TO:              true                                    │
 * │   GREATER THAN:              true                                    │
 * │   LESS THAN:                 false                                   │
 * │   GREATER THAN OR EQUAL TO:  true                                    │
 * │   LESS THAN OR EQUAL TO:     false                                   │
 * │                                                                      │
 * │ Explanation:                                                         │
 * │  • 10 == 5  → false                                                  │
 * │  • 10 != 5  → true                                                   │
 * │  • 10 > 5   → true                                                   │
 * │  • 10 < 5   → false                                                  │
 * │  • 10 >= 5  → true                                                   │
 * │  • 10 <= 5  → false                                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Baseline Provisioning: Define two static primitive variables to     │
 * │                           serve as stable mathematical test targets.   │
 * │ 2. Comparative Evaluation: Feed target inputs into relational binary │
 * │                           expression boundaries.                     │
 * │ 3. Print Resolution:      Route resultant transient boolean values   │
 * │                           directly into standard output logs.         │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Primitive Comparative Evaluation & Analysis                  │
 * │ Limit:  Evaluates pure numeric types (integral and floating-point)   │
 * │                                                                      │
 * │ Time:   O(1) → Comparative evaluations process immediately at the    │
 * │                hardware/CPU registry level with constant time.        │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes a fixed memory profile, consuming only zero-  │
 * │                scaling local stack execution frames.                 │
 * └──────────────────────────────────────────────────────────────────────┘
 */
public class Relational_Operators {
    public static void main(String[] args) {
        
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 20: Relational Operators & Comparative Logic                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate, evaluate, and analyze the boolean output outcomes of     │
 * │ standard relational operators (==, !=, >, <, >=, <=) when comparing  │
 * │ two distinct primitive integer variables in Java.                    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── COMPARISON MATRIX ────────────────────────────────────────────────┐
 * │ • Equality Check (==):       Returns true if both values are identical.│
 * │ • Inequality Check (!=):     Returns true if values differ.            │
 * │ • Strict Ordering (>, <):    Evaluates true if left side is strictly   │
 * │                              greater than or less than the right side. │
 * │ • Non-Strict Ordering (>=,<=): Evaluates true if conditions meet either│
 * │                              strict bounds or exact equality values.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE CASES ────────────────────────────────────────────────────┐
 * │ Input:  A = 10, B = 5                                                │
 * │ Output:                                                              │
 * │   EQUAL TO:                  false                                   │
 * │   NOT EQUAL TO:              true                                    │
 * │   GREATER THAN:              true                                    │
 * │   LESS THAN:                 false                                   │
 * │   GREATER THAN OR EQUAL TO:  true                                    │
 * │   LESS THAN OR EQUAL TO:     false                                   │
 * │                                                                      │
 * │ Explanation:                                                         │
 * │  • 10 == 5  → false                                                  │
 * │  • 10 != 5  → true                                                   │
 * │  • 10 > 5   → true                                                   │
 * │  • 10 < 5   → false                                                  │
 * │  • 10 >= 5  → true                                                   │
 * │  • 10 <= 5  → false                                                  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Baseline Provisioning: Define two static primitive variables to     │
 * │                           serve as stable mathematical test targets.   │
 * │ 2. Comparative Evaluation: Feed target inputs into relational binary │
 * │                           expression boundaries.                     │
 * │ 3. Print Resolution:      Route resultant transient boolean values   │
 * │                           directly into standard output logs.         │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Primitive Comparative Evaluation & Analysis                  │
 * │ Limit:  Evaluates pure numeric types (integral and floating-point)   │
 * │                                                                      │
 * │ Time:   O(1) → Comparative evaluations process immediately at the    │
 * │                hardware/CPU registry level with constant time.        │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes a fixed memory profile, consuming only zero-  │
 * │                scaling local stack execution frames.                 │
 * └──────────────────────────────────────────────────────────────────────┘
 */
// public class Relational_Operators {
//     public static void main(String[] args) {
//         int A = 10;
//         int B = 5;

//         // Comparison operators
//         System.out.println("EQUAL TO " + (A == B));  // false
//         System.out.println("NOT EQUAL TO " + (A != B));  // true
//         System.out.println("GREATER THAN " + (A > B));  // true
//         System.out.println("LESS THAN " + (A < B));  // false
//         System.out.println("GREATER THAN OR EQUAL TO " + (A >= B));  // true
//         System.out.println("LESS THAN OR EQUAL TO " + (A <= B));  // false
//     }
// }
