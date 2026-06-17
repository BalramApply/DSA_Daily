/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [04/06/26] → #2  [05/06/26] → #3  [06/06/26]                    │
 * │  #4  [07/06/26] → #5  [08/06/26] → #6  [09/06/26]                    │
 * │  #7  [10/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 16: Expression Type Evaluation                               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze a mixed arithmetic expression and determine the final       │
 * │ resulting data type using Java's implicit type promotion rules.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Expression : (f * b) + (i % c) - (d * s)                            │
 * │ Output     : RESULT OF THE EXPRESSION IS : -60303.6596...           │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ All smaller types are promoted according to Java's binary rules.    │
 * │ Final result is evaluated as a double due to presence of `double`.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Primitive arithmetic follows Java type promotion hierarchy.         │
 * │ Any expression containing double results in double output.          │
 * │ Character values are converted to ASCII/Unicode integers.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare variables of types byte, char, short, int, float,  │
 * │          and double.                                                │
 * │ Step 2 : Evaluate expression using Java operator precedence.        │
 * │ Step 3 : Apply automatic type promotion rules during evaluation.    │
 * │ Step 4 : Store final result in a double variable.                   │
 * │ Step 5 : Print the computed result.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Expression Evaluation / Type Promotion Rules                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
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

/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 16: Expression Type Evaluation                               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze a mixed arithmetic expression and determine the final       │
 * │ resulting data type using Java's implicit type promotion rules.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Expression : (f * b) + (i % c) - (d * s)                            │
 * │ Output     : RESULT OF THE EXPRESSION IS : -60303.6596...           │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ All smaller types are promoted according to Java's binary rules.    │
 * │ Final result is evaluated as a double due to presence of `double`.  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Primitive arithmetic follows Java type promotion hierarchy.         │
 * │ Any expression containing double results in double output.          │
 * │ Character values are converted to ASCII/Unicode integers.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Declare variables of types byte, char, short, int, float,  │
 * │          and double.                                                │
 * │ Step 2 : Evaluate expression using Java operator precedence.        │
 * │ Step 3 : Apply automatic type promotion rules during evaluation.    │
 * │ Step 4 : Store final result in a double variable.                   │
 * │ Step 5 : Print the computed result.                                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Expression Evaluation / Type Promotion Rules                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Expression_Type {                                       ║
* ║     public static void main(String args[]) {                         ║
* ║         byte b = 4;                                                  ║
* ║         char c = 'a';   // ASCII value of 'a' is 97                  ║
* ║         short s = 512;                                               ║
* ║         int i = 1000;                                                ║
* ║         float f = 3.14f;                                             ║
* ║         double d = 99.9954;                                          ║
* ║                                                                      ║
* ║         // Calculation breakdown                                     ║
* ║         double result = (f * b) + (i % c) - (d * s);                 ║
* ║         System.out.println("RESULT OF THE EXPRESSION IS : "+result); ║
* ║         // Expected Output : -51154.0856                             ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
