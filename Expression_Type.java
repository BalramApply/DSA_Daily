/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [04/06/26] → #2  [05/06/26] → #3  [06/06/26]                    │
 * │  #4  [07/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 16: Expression Type Evaluation                               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Determine and analyze the final resultant data type of a mixed      │
 * │ arithmetic expression based on Java's implicit numeric promotion     │
 * │ binary operator rules.                                               │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TYPE PROMOTION RULES ─────────────────────────────────────────────┐
 * │ • If any operand is `double`, the entire expression promotes to      │
 * │   double.                                                            │
 * │ • Otherwise, if any operand is `float`, the expression promotes to   │
 * │   float.                                                             │
 * │ • Otherwise, if any operand is `long`, the expression promotes to    │
 * │   long.                                                              │
 * │ • Otherwise, all standard types (byte, short, char, int) promote to   │
 * │   int.                                                               │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Parse Expression: Scan the components of the arithmetic formula   │
 * │                      from left to right following operator precedence│
 * │ 2. Identify Dominance: Find the largest or highest-ranked primitive  │
 * │                       type present within the acting binary operator │
 * │ 3. Resolve Type:     Apply compiler widening rules to verify the    │
 * │                      exact type of the final evaluation.             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Compile-Time Type Inference / Binary Promotion Analysis      │
 * │ Limit:  Evaluates pure primitive types (integral and floating-point) │
 * │                                                                      │
 * │ Time:   O(1) → Static type determination and basic operations        │
 * │                execute instantly in uniform, constant clock cycles.  │
 * │                                                                      │
 * │ Space:  O(1) → Storage is limited entirely to a few primitive frame  │
 * │                variables inside stack registers with zero scaling.   │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Expression_Type {
    public static void main(String args[]) {
        byte b = 4;
        char c = 'a';   // ASCII value of 'a' is 97
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        // Calculation breakdown
        double result = (f * b) + (i % c) - (d * s);
        System.out.println("RESULT OF THE EXPRESSION IS : "+result); // Expected Output : 
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 16: Expression Type Evaluation                               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Determine and analyze the final resultant data type of a mixed      │
 * │ arithmetic expression based on Java's implicit numeric promotion     │
 * │ binary operator rules.                                               │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TYPE PROMOTION RULES ─────────────────────────────────────────────┐
 * │ • If any operand is `double`, the entire expression promotes to      │
 * │   double.                                                            │
 * │ • Otherwise, if any operand is `float`, the expression promotes to   │
 * │   float.                                                             │
 * │ • Otherwise, if any operand is `long`, the expression promotes to    │
 * │   long.                                                              │
 * │ • Otherwise, all standard types (byte, short, char, int) promote to   │
 * │   int.                                                               │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Parse Expression: Scan the components of the arithmetic formula   │
 * │                      from left to right following operator precedence│
 * │ 2. Identify Dominance: Find the largest or highest-ranked primitive  │
 * │                       type present within the acting binary operator │
 * │ 3. Resolve Type:     Apply compiler widening rules to verify the    │
 * │                      exact type of the final evaluation.             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Compile-Time Type Inference / Binary Promotion Analysis      │
 * │ Limit:  Evaluates pure primitive types (integral and floating-point) │
 * │                                                                      │
 * │ Time:   O(1) → Static type determination and basic operations        │
 * │                execute instantly in uniform, constant clock cycles.  │
 * │                                                                      │
 * │ Space:  O(1) → Storage is limited entirely to a few primitive frame  │
 * │                variables inside stack registers with zero scaling.   │
 * └──────────────────────────────────────────────────────────────────────┘
 */


// public class Expression_Type {
//     public static void main(String args[]) {
//         byte b = 4;
//         char c = 'a';   // ASCII value of 'a' is 97
//         short s = 512;
//         int i = 1000;
//         float f = 3.14f;
//         double d = 99.9954;

//         // Calculation breakdown
//         double result = (f * b) + (i % c) - (d * s);
//         System.out.println("RESULT OF THE EXPRESSION IS : "+result); // Expected Output : 
//     }
// }
