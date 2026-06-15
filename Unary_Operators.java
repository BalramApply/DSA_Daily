/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [04/06/26] → #2  [05/06/26] → #3  [06/06/26]                    │
 * │  #4  [07/06/26] → #5  [08/06/26] → #6  [09/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 18: Unary Operators & Side-Effect Evaluation                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate the behavior of unary increment (++) and decrement (--) │
 * │ operators in both prefix and postfix forms and observe how they     │
 * │ affect variable values during assignment operations.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : a = 10                                                     │
 * │ Output : b = ++a  → a = 11, b = 11                                  │
 * │                                                                     │
 * │ Input  : c = 10                                                     │
 * │ Output : d = c++  → c = 11, d = 10                                  │
 * │                                                                     │
 * │ Input  : e = 10                                                     │
 * │ Output : f = --e  → e = 9,  f = 9                                   │
 * │                                                                     │
 * │ Input  : g = 10                                                     │
 * │ Output : h = g--  → g = 9,  h = 10                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Variables must be numeric primitive data types.                     │
 * │ Increment and decrement operations modify the original variable.    │
 * │ Prefix updates first, postfix updates after evaluation.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize integer variables with sample values.           │
 * │ Step 2 : Apply pre-increment and store the result.                  │
 * │ Step 3 : Apply post-increment and store the result.                 │
 * │ Step 4 : Apply pre-decrement and store the result.                  │
 * │ Step 5 : Apply post-decrement and store the result.                 │
 * │ Step 6 : Print both assigned and updated variable values.           │
 * │ Step 7 : Compare prefix and postfix behavior.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Unary Operators / Increment-Decrement Evaluation                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Unary_Operators {
    public static void main(String[] args) {
        
    }
}
/* ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 18: Unary Operators & Side-Effect Evaluation                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate the behavior of unary increment (++) and decrement (--) │
 * │ operators in both prefix and postfix forms and observe how they     │
 * │ affect variable values during assignment operations.                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : a = 10                                                     │
 * │ Output : b = ++a  → a = 11, b = 11                                  │
 * │                                                                     │
 * │ Input  : c = 10                                                     │
 * │ Output : d = c++  → c = 11, d = 10                                  │
 * │                                                                     │
 * │ Input  : e = 10                                                     │
 * │ Output : f = --e  → e = 9,  f = 9                                   │
 * │                                                                     │
 * │ Input  : g = 10                                                     │
 * │ Output : h = g--  → g = 9,  h = 10                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Variables must be numeric primitive data types.                     │
 * │ Increment and decrement operations modify the original variable.    │
 * │ Prefix updates first, postfix updates after evaluation.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize integer variables with sample values.           │
 * │ Step 2 : Apply pre-increment and store the result.                  │
 * │ Step 3 : Apply post-increment and store the result.                 │
 * │ Step 4 : Apply pre-decrement and store the result.                  │
 * │ Step 5 : Apply post-decrement and store the result.                 │
 * │ Step 6 : Print both assigned and updated variable values.           │
 * │ Step 7 : Compare prefix and postfix behavior.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Unary Operators / Increment-Decrement Evaluation                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time  : O(1)                                                        │
 * │ Space : O(1)                                                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Unary_Operators {                                       ║
* ║     public static void main(String[] args) {                         ║
* ║         // Pre-increment                                             ║
* ║         int a = 10;                                                  ║
* ║         int b = ++a; // a is incremented first, then assigned to b   ║
* ║         System.out.println("PRE-INCREMENT (a): " + a);               ║
* ║         System.out.println("AFTER PRE-INCREMENT (b): " + b);         ║
* ║                                                                      ║
* ║         // Post-increment                                            ║
* ║         int C = 10;                                                  ║
* ║         int D = C++; // C is assigned to D first, then incremented   ║
* ║         System.out.println("POST-INCREMENT (C): " + C);              ║
* ║         System.out.println("AFTER POST-INCREMENT (D): " + D);        ║
* ║                                                                      ║
* ║         // Pre-decrement                                             ║
* ║         int c = 10;                                                  ║
* ║         int d = --c; // c is decremented first, then assigned to d   ║
* ║         System.out.println("PRE-DECREMENT (c): " + c);               ║
* ║         System.out.println("AFTER PRE-DECREMENT (d): " + d);         ║
* ║                                                                      ║
* ║         // Post-decrement                                            ║
* ║         int e = 10;                                                  ║
* ║         int f = e--; // e is assigned to f first, then decremented   ║
* ║         System.out.println("POST-DECREMENT (e): " + e);              ║
* ║         System.out.println("AFTER POST-DECREMENT (f): " + f);        ║
* ║     }                                                                ║
* ║ }                                                                    ║
*/╚══════════════════════════════════════════════════════════════════════╝
