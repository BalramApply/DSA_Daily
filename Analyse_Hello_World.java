/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [12/06/26] → #2  [13/06/26] → #3  [14/06/26]                    │
 * │  #4  [15/06/26] → #5  [16/06/26] → #6  [17/06/26]                    │
 * │  #7  [18/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 *
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 56: Count the Number of Times "hello" is Printed             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze the given for loop and determine how many times the         │
 * │ string "hello" is printed. The loop variable is modified both       │
 * │ inside the loop body and by the for-loop increment statement.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Output :                                                            │
 * │ hello                                                               │
 * │ hello                                                               │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The loop executes only two iterations before the condition          │
 * │ i < 5 becomes false.                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Initial value: i = 0                                              │
 * │ • Loop condition: i < 5                                             │
 * │ • Inside loop: i += 2                                               │
 * │ • For-loop increment: i++                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize i = 0.                                          │
 * │ Step 2 : Print "hello".                                             │
 * │ Step 3 : Increase i by 2 inside the loop.                           │
 * │ Step 4 : Execute the for-loop increment (i++).                      │
 * │ Step 5 : Repeat until i < 5 becomes false.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Iteration 1 : i = 0                                                 │
 * │               Print "hello"                                         │
 * │               i += 2 → i = 2                                        │
 * │               for increment → i = 3                                 │
 * │                                                                     │
 * │ Iteration 2 : i = 3                                                 │
 * │               Print "hello"                                         │
 * │               i += 2 → i = 5                                        │
 * │               for increment → i = 6                                 │
 * │                                                                     │
 * │ Condition: 6 < 5 → false                                            │
 * │ Total prints = 2                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Loop Analysis                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Executes a fixed number of iterations (2).       │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Analyse_Hello_World{
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("hello");    // Ans : 
            i += 2;
        }
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 56: Count the Number of Times "hello" is Printed             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Analyze the given for loop and determine how many times the         │
 * │ string "hello" is printed. The loop variable is modified both       │
 * │ inside the loop body and by the for-loop increment statement.       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Output :                                                            │
 * │ hello                                                               │
 * │ hello                                                               │
 * │                                                                     │
 * │ Explanation :                                                       │
 * │ The loop executes only two iterations before the condition          │
 * │ i < 5 becomes false.                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ • Initial value: i = 0                                              │
 * │ • Loop condition: i < 5                                             │
 * │ • Inside loop: i += 2                                               │
 * │ • For-loop increment: i++                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize i = 0.                                          │
 * │ Step 2 : Print "hello".                                             │
 * │ Step 3 : Increase i by 2 inside the loop.                           │
 * │ Step 4 : Execute the for-loop increment (i++).                      │
 * │ Step 5 : Repeat until i < 5 becomes false.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ Iteration 1 : i = 0                                                 │
 * │               Print "hello"                                         │
 * │               i += 2 → i = 2                                        │
 * │               for increment → i = 3                                 │
 * │                                                                     │
 * │ Iteration 2 : i = 3                                                 │
 * │               Print "hello"                                         │
 * │               i += 2 → i = 5                                        │
 * │               for increment → i = 6                                 │
 * │                                                                     │
 * │ Condition: 6 < 5 → false                                            │
 * │ Total prints = 2                                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Iterative Loop Analysis                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(1)                                             │
 * │                    Executes a fixed number of iterations (2).       │
 * │ Space Complexity : O(1)                                             │
 * │                    Uses constant extra memory.                      │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Analyse_Hello_World{                                    ║
* ║     public static void main(String[] args) {                         ║
* ║         for(int i=0; i<5; i++){                                      ║
* ║             System.out.println("hello");                             ║
* ║             i += 2;                                                  ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Execution Breakdown:                                                ║
* ║  1. i = 0 (0 < 5 is true)  -> Prints "hello", i becomes 2, i++ -> 3  ║
* ║  2. i = 3 (3 < 5 is true)  -> Prints "hello", i becomes 5, i++ -> 6  ║
* ║  3. i = 6 (6 < 5 is false) -> Loop terminates                        ║
* ║                                                                      ║
* ║  Ans: Prints "hello" 2 times                                         ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/