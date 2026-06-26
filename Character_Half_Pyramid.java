/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [16/06/26] → #2  [17/06/26] → #3  [18/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 80: Print a Character Half Pyramid Pattern                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print a half pyramid pattern using uppercase English alphabet       │
 * │ characters. Characters are printed sequentially starting from 'A'.  │
 * │ Each row contains one more character than the previous row.         │
 * │ Input: Number of rows (fixed as 4 in this implementation).          │
 * │ Output: Character half pyramid pattern.                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : height = 4                                                 │
 * │ Output :                                                            │
 * │ A                                                                   │
 * │ BC                                                                  │
 * │ DEF                                                                 │
 * │ GHIJ                                                                │
 * │ Explanation : Characters are printed continuously in alphabetical   │
 * │ order while increasing the number of characters per row.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Height is fixed to 4.                                               │
 * │ Characters start from 'A'.                                          │
 * │ Each printed character increments to the next ASCII/Unicode letter. │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize height and starting character 'A'.              │
 * │ Step 2 : Use an outer loop to iterate through each row.             │
 * │ Step 3 : For each row, run an inner loop equal to the row number.   │
 * │ Step 4 : Print the current character and increment it.              │
 * │ Step 5 : Move to the next line after completing the row.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Character Manipulation            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ height = 4, ch = 'A'                                                │
 * │ Row 1 → A                                                           │
 * │ Row 2 → B C                                                         │
 * │ Row 3 → D E F                                                       │
 * │ Row 4 → G H I J                                                     │
 * │ Final Output:                                                       │
 * │ A                                                                   │
 * │ BC                                                                  │
 * │ DEF                                                                 │
 * │ GHIJ                                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Character_Half_Pyramid {
    public static void main(String args[]) {
        int height = 4;
        
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 80: Print a Character Half Pyramid Pattern                   ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Print a half pyramid pattern using uppercase English alphabet       │
 * │ characters. Characters are printed sequentially starting from 'A'.  │
 * │ Each row contains one more character than the previous row.         │
 * │ Input: Number of rows (fixed as 4 in this implementation).          │
 * │ Output: Character half pyramid pattern.                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : height = 4                                                 │
 * │ Output :                                                            │
 * │ A                                                                   │
 * │ BC                                                                  │
 * │ DEF                                                                 │
 * │ GHIJ                                                                │
 * │ Explanation : Characters are printed continuously in alphabetical   │
 * │ order while increasing the number of characters per row.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ Height is fixed to 4.                                               │
 * │ Characters start from 'A'.                                          │
 * │ Each printed character increments to the next ASCII/Unicode letter. │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize height and starting character 'A'.              │
 * │ Step 2 : Use an outer loop to iterate through each row.             │
 * │ Step 3 : For each row, run an inner loop equal to the row number.   │
 * │ Step 4 : Print the current character and increment it.              │
 * │ Step 5 : Move to the next line after completing the row.            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Character Manipulation            │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ height = 4, ch = 'A'                                                │
 * │ Row 1 → A                                                           │
 * │ Row 2 → B C                                                         │
 * │ Row 3 → D E F                                                       │
 * │ Row 4 → G H I J                                                     │
 * │ Final Output:                                                       │
 * │ A                                                                   │
 * │ BC                                                                  │
 * │ DEF                                                                 │
 * │ GHIJ                                                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Character_Half_Pyramid {                                ║
* ║     public static void main(String args[]) {                         ║
* ║         int height = 4;                                              ║
* ║         char ch = 'A';                                               ║
* ║                                                                      ║
* ║         for (int line = 1; line <= height; line++) {                 ║
* ║                                                                      ║
* ║             for (int chars = 1; chars <= line; chars++) {            ║
* ║                 System.out.print(ch);                                ║
* ║                 ch++;                                                ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace:                                          ║
* ║                                                                      ║
* ║  Outer Loop | Inner Loop (chars <= line) | Print Output | Next 'ch'  ║
* ║  ------------|────────────────────────────|──────────────|───────────║
* ║   line = 1   | Runs 1 time  (chars = 1)   | A            | 'B'       ║
* ║   line = 2   | Runs 2 times (chars = 1, 2) | BC           | 'D'      ║
* ║   line = 3   | Runs 3 times (chars = 1-3)  | DEF          | 'G'      ║
* ║   line = 4   | Runs 4 times (chars = 1-4)  | GHIJ         | 'K       ║
* ║                                                                      ║
* ║  Console Output:                                                     ║
* ║  A                                                                   ║
* ║  BC                                                                  ║
* ║  DEF                                                                 ║
* ║  GHIJ                                                                ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - Unlike previous patterns where the variable resets each row,      ║
* ║    the character variable `ch` updates continuously across loops.    ║
* ║  - Java automatically handles the character increment (`ch++`) by    ║
* ║    moving to the next consecutive ASCII / Unicode value.             ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
