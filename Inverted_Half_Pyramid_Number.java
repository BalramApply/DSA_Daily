/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [17/06/26] → #2  [18/06/26] → #3  [19/06/26]                    │
 * │  #4  [20/06/26] → #5  [21/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 83: Print an Inverted Half Pyramid Using Numbers             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print an inverted half pyramid pattern using    │
 * │ numbers.                                                            │
 * │ Each row starts from 1 and prints consecutive numbers, while the    │
 * │ number of printed elements decreases by one in each row.            │
 * │ Input: Height of the pyramid.                                       │
 * │ Output: Inverted number half pyramid pattern.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │ 12345                                                               │
 * │ 1234                                                                │
 * │ 123                                                                 │
 * │ 12                                                                  │
 * │ 1                                                                   │
 * │ Explanation : Each successive row contains one less number than     │
 * │ the previous row, forming an inverted half pyramid.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains numbers from 1 to (n - i + 1).                       │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : For each row, determine the count of numbers to print      │
 * │          as (n - i + 1).                                            │
 * │ Step 3 : Print numbers from 1 up to the calculated count.           │
 * │ Step 4 : Move to the next line after completing the row.            │
 * │ Step 5 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Number Pattern                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 5                                                               │
 * │ Row 1 → 12345                                                       │
 * │ Row 2 → 1234                                                        │
 * │ Row 3 → 123                                                         │
 * │ Row 4 → 12                                                          │
 * │ Row 5 → 1                                                           │
 * │ Final Output Forms an Inverted Number Half Pyramid                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Inverted_Half_Pyramid_Number {
    

    public static void main(String args[]) {
        int height = 5;
    }
}

/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 83: Print an Inverted Half Pyramid Using Numbers             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print an inverted half pyramid pattern using    │
 * │ numbers.                                                            │
 * │ Each row starts from 1 and prints consecutive numbers, while the    │
 * │ number of printed elements decreases by one in each row.            │
 * │ Input: Height of the pyramid.                                       │
 * │ Output: Inverted number half pyramid pattern.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │ 12345                                                               │
 * │ 1234                                                                │
 * │ 123                                                                 │
 * │ 12                                                                  │
 * │ 1                                                                   │
 * │ Explanation : Each successive row contains one less number than     │
 * │ the previous row, forming an inverted half pyramid.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains numbers from 1 to (n - i + 1).                       │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : For each row, determine the count of numbers to print      │
 * │          as (n - i + 1).                                            │
 * │ Step 3 : Print numbers from 1 up to the calculated count.           │
 * │ Step 4 : Move to the next line after completing the row.            │
 * │ Step 5 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Number Pattern                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 5                                                               │
 * │ Row 1 → 12345                                                       │
 * │ Row 2 → 1234                                                        │
 * │ Row 3 → 123                                                         │
 * │ Row 4 → 12                                                          │
 * │ Row 5 → 1                                                           │
 * │ Final Output Forms an Inverted Number Half Pyramid                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Inverted_Half_Pyramid_Number {                          ║
* ║     public static void pyramid(int n) {                              ║
* ║                                                                      ║
* ║         for (int i = 1; i <= n; i++) {                               ║
* ║                                                                      ║
* ║             for (int j = 1; j <= (n - i + 1); j++) {                 ║
* ║                 System.out.print(j);                                 ║
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
* ║  Row (i) | Inner Loop Bound (j <= n - i + 1) | Numbers Printed       ║
* ║  ────────|───────────────────────────────────|─────────────────────  ║
* ║    1     |  j <= 5 - 1 + 1 (j <= 5)          | 12345                 ║
* ║    2     |  j <= 5 - 2 + 1 (j <= 4)          | 1234                  ║
* ║    3     |  j <= 5 - 3 + 1 (j <= 3)          | 123                   ║
* ║    4     |  j <= 5 - 4 + 1 (j <= 2)          | 12                    ║
* ║    5     |  j <= 5 - 5 + 1 (j <= 1)          | 1                     ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  12345                                                               ║
* ║  1234                                                                ║
* ║  123                                                                 ║
* ║  12                                                                  ║
* ║  1                                                                   ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - The outer loop runs `n` times to handle row transitions.          ║
* ║  - The inner loop controls columns. The count of numbers printed     ║
* ║    reduces on each subsequent row using the formula `n - i + 1`.     ║
* ║  - Instead of a static symbol, the loop counter variable `j` is      ║
* ║    printed directly, forcing each line to reset and count from 1.    ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/