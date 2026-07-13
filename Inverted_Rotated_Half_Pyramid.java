/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐*
 * │  #1  [17/06/26] → #2  [18/06/26] → #3  [19/06/26]                    │
 * │  #4  [20/06/26] → #5  [21/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 82: Print an Inverted Rotated Half Pyramid Pattern           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print an inverted rotated half pyramid using    │
 * │ '*' characters.                                                     │
 * │ The pattern is right-aligned by printing leading spaces before      │
 * │ the stars in each row.                                              │
 * │ Input: Height of the pyramid.                                       │
 * │ Output: Right-aligned half pyramid pattern.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     *                                                               │
 * │    **                                                               │
 * │   ***                                                               │
 * │  ****                                                               │
 * │ *****                                                               │
 * │ Explanation : Each row contains decreasing leading spaces and       │
 * │ increasing stars, producing a rotated half pyramid.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains (n - i) spaces followed by i stars.                  │
 * │ Pattern is right-aligned using spaces.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for alignment.                │
 * │ Step 3 : Print i stars after the spaces.                            │
 * │ Step 4 : Move to the next line after completing each row.           │
 * │ Step 5 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Right-Aligned Pattern             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 5                                                               │
 * │ Row 1 → "    *"                                                     │
 * │ Row 2 → "   **"                                                     │
 * │ Row 3 → "  ***"                                                     │
 * │ Row 4 → " ****"                                                     │
 * │ Row 5 → "*****"                                                     │
 * │ Final Output Forms an Inverted Rotated Half Pyramid                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Inverted_Rotated_Half_Pyramid {
    

  public static void main(String args[]) {
    int height = 5;
    
  }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 82: Print an Inverted Rotated Half Pyramid Pattern           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print an inverted rotated half pyramid using    │
 * │ '*' characters.                                                     │
 * │ The pattern is right-aligned by printing leading spaces before      │
 * │ the stars in each row.                                              │
 * │ Input: Height of the pyramid.                                       │
 * │ Output: Right-aligned half pyramid pattern.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     *                                                               │
 * │    **                                                               │
 * │   ***                                                               │
 * │  ****                                                               │
 * │ *****                                                               │
 * │ Explanation : Each row contains decreasing leading spaces and       │
 * │ increasing stars, producing a rotated half pyramid.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains (n - i) spaces followed by i stars.                  │
 * │ Pattern is right-aligned using spaces.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for alignment.                │
 * │ Step 3 : Print i stars after the spaces.                            │
 * │ Step 4 : Move to the next line after completing each row.           │
 * │ Step 5 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Right-Aligned Pattern             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 5                                                               │
 * │ Row 1 → "    *"                                                     │
 * │ Row 2 → "   **"                                                     │
 * │ Row 3 → "  ***"                                                     │
 * │ Row 4 → " ****"                                                     │
 * │ Row 5 → "*****"                                                     │
 * │ Final Output Forms an Inverted Rotated Half Pyramid                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Inverted_Rotated_Half_Pyramid {                         ║
* ║     public static void pyramid(int n) {                              ║
* ║                                                                      ║
* ║         for (int i = 1; i <= n; i++) {                               ║
* ║                                                                      ║
* ║             for (int j = 1; j <= n - i; j++) {                       ║
* ║                 System.out.print(" ");                               ║
* ║             }                                                        ║
* ║                                                                      ║
* ║             for (int k = 1; k <= i; k++) {                           ║
* ║                 System.out.print("*");                               ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]) {                         ║
* ║         int height = 5;                                              ║
* ║         pyramid(height);                                             ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace (height = 5):                             ║
* ║                                                                      ║
* ║  Row (i) | Spaces Loop (j <= n-i) | Stars Loop (k <= i) | Output     ║
* ║  ────────|────────────────────────|─────────────────────|──────────  ║
* ║    1     |  j <= 5 - 1  (4 spaces)|  k <= 1  (1 star)   |     *      ║
* ║    2     |  j <= 5 - 2  (3 spaces)|  k <= 2  (2 stars)  |            ║
* ║    3     |  j <= 5 - 3  (2 spaces)|  k <= 3  (3 stars)  |   ***      ║
* ║    4     |  j <= 5 - 4  (1 space) |  k <= 4  (4 stars)  |  ****      ║
* ║    5     |  j <= 5 - 5  (0 spaces)|  k <= 5  (5 stars)  | *****      ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - The outer loop variable `i` keeps track of the current row level. ║
* ║  - To align the pyramid to the right side, each row prints leading   ║
* ║    spaces (`n - i`) followed directly by the growing blocks of stars.║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
