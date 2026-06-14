/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [05/06/26] → #2  [06/06/26] → #3  [07/06/26]                    │
 * │  #4  [08/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 22: Operator Precedence & Integer Truncation                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze, evaluate, and trace the runtime outputs of two seemingly    │
 * │ identical mathematical expressions altered by parenthetical bounds   │
 * │ (x * y / x vs x * (y / x)) to witness Java integer division loss.    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── PRECEDENCE & TRUNCATION MECHANICS ────────────────────────────────┐
 * │ • Left-to-Right Associativity: Operators '*' and '/' share equal     │
 * │   precedence. Without brackets, evaluation strictly reads left-to-right.│
 * │                                                                      │
 * │ • Parentheses Overriding: Grouping forces explicit sub-evaluation.   │
 * │                                                                      │
 * │ • Integer Division Drop: When dividing integers in Java, the fractional│
 * │   quotient remainder is completely dropped/truncated toward zero.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: x = 2, y = 5                                                  │
 * │ Output:                                                              │
 * │   EXPRESSION FIRST IS :5                                             │
 * │   EXPRESSION SECOND IS :4                                            │
 * │                                                                      │
 * │ Trace Breakdown:                                                     │
 * │  • Expression 1 (x * y / x):                                         │
 * │    Step A: (2 * 5) -> 10                                             │
 * │    Step B: (10 / 2) -> 5                                              │
 * │                                                                      │
 * │  • Expression 2 (x * (y / x)):                                       │
 * │    Step A: Inner Grouping (5 / 2) -> 2.5 drops decimal -> 2          │
 * │    Step B: Outer Evaluation (2 * 2) -> 4                             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Input Declaration: Establish fixed integer values for inputs 'x'  │
 * │                       and 'y' where 'y' is not perfectly divisible.  │
 * │ 2. Bound Parsing:      Execute expression one (flat left-to-right)   │
 * │                       and expression two (bracket priority).         │
 * │ 3. Output Observation: Print both evaluations side-by-side to catch │
 * │                       truncation variances directly.                 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Mathematical Order of Operations & Expression Analysis       │
 * │ Limit:  Operands must be valid integers; x != 0 to prevent crash     │
 * │                                                                      │
 * │ Time:   O(1) → Order calculation and execution resolve instantly on   │
 * │                the JVM stack using constant clock steps.             │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes standard, small localized register memory   │
 * │                slots without dynamic resizing demands.                │
 * └──────────────────────────────────────────────────────────────────────┘
 */

public class Analyse_Output {
    public static void main(String args[]){
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x ));

        System.out.println("EXPRESSION FIRST IS :"+exp1);   // ans = 
        System.out.print("EXPRESSION SECOND IS :"+exp2);    // ans = 
    }
}
/**
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 22: Operator Precedence & Integer Truncation                ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze, evaluate, and trace the runtime outputs of two seemingly    │
 * │ identical mathematical expressions altered by parenthetical bounds   │
 * │ (x * y / x vs x * (y / x)) to witness Java integer division loss.    │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── PRECEDENCE & TRUNCATION MECHANICS ────────────────────────────────┐
 * │ • Left-to-Right Associativity: Operators '*' and '/' share equal     │
 * │   precedence. Without brackets, evaluation strictly reads left-to-right.│
 * │                                                                      │
 * │ • Parentheses Overriding: Grouping forces explicit sub-evaluation.   │
 * │                                                                      │
 * │ • Integer Division Drop: When dividing integers in Java, the fractional│
 * │   quotient remainder is completely dropped/truncated toward zero.   │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE TRACE ANALYSIS ───────────────────────────────────────────┐
 * │ Input: x = 2, y = 5                                                  │
 * │ Output:                                                              │
 * │   EXPRESSION FIRST IS :5                                             │
 * │   EXPRESSION SECOND IS :4                                            │
 * │                                                                      │
 * │ Trace Breakdown:                                                     │
 * │  • Expression 1 (x * y / x):                                         │
 * │    Step A: (2 * 5) -> 10                                             │
 * │    Step B: (10 / 2) -> 5                                              │
 * │                                                                      │
 * │  • Expression 2 (x * (y / x)):                                       │
 * │    Step A: Inner Grouping (5 / 2) -> 2.5 drops decimal -> 2          │
 * │    Step B: Outer Evaluation (2 * 2) -> 4                             │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH ─────────────────────────────────────────────────────────┐
 * │ 1. Input Declaration: Establish fixed integer values for inputs 'x'  │
 * │                       and 'y' where 'y' is not perfectly divisible.  │
 * │ 2. Bound Parsing:      Execute expression one (flat left-to-right)   │
 * │                       and expression two (bracket priority).         │
 * │ 3. Output Observation: Print both evaluations side-by-side to catch │
 * │                       truncation variances directly.                 │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ┌── METRICS & COMPLEXITY ─────────────────────────────────────────────┐
 * │ Type:   Mathematical Order of Operations & Expression Analysis       │
 * │ Limit:  Operands must be valid integers; x != 0 to prevent crash     │
 * │                                                                      │
 * │ Time:   O(1) → Order calculation and execution resolve instantly on   │
 * │                the JVM stack using constant clock steps.             │
 * │                                                                      │
 * │ Space:  O(1) → Utilizes standard, small localized register memory   │
 * │                slots without dynamic resizing demands.                │
 * └──────────────────────────────────────────────────────────────────────┘
 */

// public class Analyse_Output {
//     public static void main(String args[]){
//         int x = 2, y = 5;

//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x ));

//         System.out.println("EXPRESSION FIRST IS :"+exp1);   // ans = ?
//         System.out.print("EXPRESSION SECOND IS :"+exp2);    // ans = ?
//     }
// }
