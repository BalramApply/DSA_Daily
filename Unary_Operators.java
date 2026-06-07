/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [04/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 18: Unary Operators & Side-Effect Evaluation                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate, evaluate, and analyze the distinct behavior of unary   │
 * │ increment and decrement operators in both prefix and postfix forms   │
 * │ (++var, var++, --var, var--) on primitive integer variables.        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── VISUALIZATION & RULES ────────────────────────────────────────────┐
 * │ • Prefix Variant (++x, --x):   "Change before use"                  │
 * │   Increments/decrements the variable first, then yields the updated  │
 * │   value to the surrounding expression.                               │
 * │                                                                      │
 * │ • Postfix Variant (x++, x--):  "Use before change"                  │
 * │   Yields the current value to the expression first, then updates     │
 * │   the variable in memory as a sequential side effect.                │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE CASES ────────────────────────────────────────────────────┐
 * │ 1. Pre-Increment:                                                    │
 * │    Input:  a = 10  │ Operation: b = ++a                             │
 * │    Output: a = 11, b = 11                                            │
 * │                                                                      │
 * │ 2. Post-Increment:                                                   │
 * │    Input:  c = 10  │ Operation: d = c++                             │
 * │    Output: c = 11, d = 10                                            │
 * │                                                                      │
 * │ 3. Pre-Decrement:                                                    │
 * │    Input:  e = 10  │ Operation: f = --e                             │
 * │    Output: e = 9,  f = 9                                             │
 * │                                                                      │
 * │ 4. Post-Decrement:                                                   │
 * │    Input:  g = 10  │ Operation: h = g--                             │
 * │    Output: g = 9,  h = 10                                            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. State Allocation:     Initialize unique primitive local integers  │
 * │                          to isolate mutation states per operation.   │
 * │ 2. Inline Execution:     Apply prefix/postfix operators during complex│
 * │                          value assignments to observe precedence.    │
 * │ 3. State Verification:   Print results sequentially to capture both   │
 * │                          the assigned values and variable mutations.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Unary Mutation & Evaluation Sequence                         │
 * │ Limit:  Operands must be valid numeric primitive data types          │
 * │                                                                      │
 * │ Time:   O(1) → Unary step updates operate directly on CPU/JVM stack  │
 * │                registers within single, uniform clock cycles.        │
 * │                                                                      │
 * │ Space:  O(1) → Allocation remains strictly bounded to localized,     │
 * │                non-scaling primitive storage slots.                  │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Unary_Operators {
    public static void main(String[] args) {
        
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 18: Unary Operators & Side-Effect Evaluation                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate, evaluate, and analyze the distinct behavior of unary   │
 * │ increment and decrement operators in both prefix and postfix forms   │
 * │ (++var, var++, --var, var--) on primitive integer variables.        │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── VISUALIZATION & RULES ────────────────────────────────────────────┐
 * │ • Prefix Variant (++x, --x):   "Change before use"                  │
 * │   Increments/decrements the variable first, then yields the updated  │
 * │   value to the surrounding expression.                               │
 * │                                                                      │
 * │ • Postfix Variant (x++, x--):  "Use before change"                  │
 * │   Yields the current value to the expression first, then updates     │
 * │   the variable in memory as a sequential side effect.                │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE CASES ────────────────────────────────────────────────────┐
 * │ 1. Pre-Increment:                                                    │
 * │    Input:  a = 10  │ Operation: b = ++a                             │
 * │    Output: a = 11, b = 11                                            │
 * │                                                                      │
 * │ 2. Post-Increment:                                                   │
 * │    Input:  c = 10  │ Operation: d = c++                             │
 * │    Output: c = 11, d = 10                                            │
 * │                                                                      │
 * │ 3. Pre-Decrement:                                                    │
 * │    Input:  e = 10  │ Operation: f = --e                             │
 * │    Output: e = 9,  f = 9                                             │
 * │                                                                      │
 * │ 4. Post-Decrement:                                                   │
 * │    Input:  g = 10  │ Operation: h = g--                             │
 * │    Output: g = 9,  h = 10                                            │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. State Allocation:     Initialize unique primitive local integers  │
 * │                          to isolate mutation states per operation.   │
 * │ 2. Inline Execution:     Apply prefix/postfix operators during complex│
 * │                          value assignments to observe precedence.    │
 * │ 3. State Verification:   Print results sequentially to capture both   │
 * │                          the assigned values and variable mutations.  │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Unary Mutation & Evaluation Sequence                         │
 * │ Limit:  Operands must be valid numeric primitive data types          │
 * │                                                                      │
 * │ Time:   O(1) → Unary step updates operate directly on CPU/JVM stack  │
 * │                registers within single, uniform clock cycles.        │
 * │                                                                      │
 * │ Space:  O(1) → Allocation remains strictly bounded to localized,     │
 * │                non-scaling primitive storage slots.                  │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Unary_Operators {
//     public static void main(String[] args) {
//         // Pre-increment
//         int a = 10;
//         int b = ++a; // a is incremented first, then assigned to b
//         System.out.println("PRE-INCREMENT (a): " + a);
//         System.out.println("AFTER PRE-INCREMENT (b): " + b);

//         // Post-increment
//         int C = 10;
//         int D = C++; // C is assigned to D first, then incremented
//         System.out.println("POST-INCREMENT (C): " + C);
//         System.out.println("AFTER POST-INCREMENT (D): " + D);

//         // Pre-decrement
//         int c = 10;
//         int d = --c; // c is decremented first, then assigned to d
//         System.out.println("PRE-DECREMENT (c): " + c);
//         System.out.println("AFTER PRE-DECREMENT (d): " + d);

//         // Post-decrement
//         int e = 10;
//         int f = e--; // e is assigned to f first, then decremented
//         System.out.println("POST-DECREMENT (e): " + e);
//         System.out.println("AFTER POST-DECREMENT (f): " + f);
//     }
// }
