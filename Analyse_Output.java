/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [07/06/26]                    │
 * │  #4  [08/06/26] → #5  [09/06/26] → #6  [10/06/26]                    │
 * │  #7  [11/06/26] → #8  [12/06/26] → #9  [13/06/26]                    │
 * │  #10 [14/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 22: ANALYSE OUTPUT EXPRESSION                                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate how operator precedence, associativity, and integer     │
 * │ division affect the final result of arithmetic expressions in Java. │
 * │ Compare the outputs of (x * y / x) and (x * (y / x)).               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input : x = 2, y = 5                                                │
 * │ Output:                                                             │
 * │ EXPRESSION FIRST IS : 5                                             │
 * │ EXPRESSION SECOND IS : 4                                            │
 * │                                                                     │
 * │ Explanation:                                                        │
 * │ (2 * 5) / 2 = 10 / 2 = 5                                            │
 * │ 2 * (5 / 2) = 2 * 2 = 4                                             │
 * │ Integer division truncates 2.5 to 2.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1. x must not be equal to 0.                                        │
 * │ 2. Variables must be valid integer values.                          │
 * │ 3. Integer division discards the fractional part.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize integer variables x and y.                      │
 * │ Step 2 : Evaluate expression (x * y / x).                           │
 * │ Step 3 : Evaluate expression (x * (y / x)).                         │
 * │ Step 4 : Observe the effect of parentheses and integer division.    │
 * │ Step 5 : Print both results for comparison.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Operator Precedence / Integer Arithmetic Analysis                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Analyse_Output {
    public static void main(String args[]){
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x ));

        System.out.println("EXPRESSION FIRST IS : "+exp1);   // ans = 
        System.out.print("EXPRESSION SECOND IS : "+exp2);    // ans = 
    }
}

/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 22: Operator Precedence & Integer Truncation                 ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Demonstrate how operator precedence, associativity, and integer     │
 * │ division affect the final result of arithmetic expressions in Java. │
 * │ Compare the outputs of (x * y / x) and (x * (y / x)).               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input : x = 2, y = 5                                                │
 * │ Output:                                                             │
 * │ EXPRESSION FIRST IS : 5                                             │
 * │ EXPRESSION SECOND IS : 4                                            │
 * │                                                                     │
 * │ Explanation:                                                        │
 * │ (2 * 5) / 2 = 10 / 2 = 5                                            │
 * │ 2 * (5 / 2) = 2 * 2 = 4                                             │
 * │ Integer division truncates 2.5 to 2.                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ 1. x must not be equal to 0.                                        │
 * │ 2. Variables must be valid integer values.                          │
 * │ 3. Integer division discards the fractional part.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize integer variables x and y.                      │
 * │ Step 2 : Evaluate expression (x * y / x).                           │
 * │ Step 3 : Evaluate expression (x * (y / x)).                         │
 * │ Step 4 : Observe the effect of parentheses and integer division.    │
 * │ Step 5 : Print both results for comparison.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Operator Precedence / Integer Arithmetic Analysis                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Analyse_Output {                                        ║
* ║     public static void main(String args[]){                          ║
* ║         int x = 2, y = 5;                                            ║
* ║                                                                      ║
* ║         int exp1 = (x * y / x);                                      ║
* ║         int exp2 = (x * (y / x ));                                   ║
* ║                                                                      ║
* ║         System.out.println("EXPRESSION FIRST IS :"+exp1);   // ans=5 ║
* ║         System.out.print("EXPRESSION SECOND IS :"+exp2);    // ans=4 ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
