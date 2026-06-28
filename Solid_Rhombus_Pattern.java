/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [18/06/26] → #2  [19/06/26] → #3  [20/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 87: Print a Solid Rhombus Pattern                            ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a solid rhombus using '*' characters.     │
 * │ Each row contains exactly n stars, while leading spaces create the  │
 * │ rhombus shape.                                                      │
 * │ Input: Side length n of the rhombus.                                │
 * │ Output: Solid rhombus pattern.                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     *****                                                           │
 * │    *****                                                            │
 * │   *****                                                             │
 * │  *****                                                              │
 * │ *****                                                               │
 * │ Explanation : Each row is shifted left by one space compared to     │
 * │ the previous row, forming a solid rhombus.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Each row contains exactly n stars.                                  │
 * │ Row i contains (n - i) leading spaces.                              │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for alignment.                │
 * │ Step 3 : Print n stars after the spaces.                            │
 * │ Step 4 : Move to the next line after completing each row.           │
 * │ Step 5 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Geometric Pattern Generation      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → "   ****"                                                   │
 * │ Row 2 → "  ****"                                                    │
 * │ Row 3 → " ****"                                                     │
 * │ Row 4 → "****"                                                      │
 * │ Final Output Forms a Solid Rhombus                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = side length of the rhombus.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Solid_Rhombus_Pattern {
    

    public static void main(String args[]) {
        int height = 5;
        
    }
}
/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 87: Print a Solid Rhombus Pattern                              ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a solid rhombus using '*' characters.     │
 * │ Each row contains exactly n stars, while leading spaces create the  │
 * │ rhombus shape.                                                      │
 * │ Input: Side length n of the rhombus.                                │
 * │ Output: Solid rhombus pattern.                                      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     *****                                                           │
 * │    *****                                                            │
 * │   *****                                                             │
 * │  *****                                                              │
 * │ *****                                                               │
 * │ Explanation : Each row is shifted left by one space compared to     │
 * │ the previous row, forming a solid rhombus.                          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Each row contains exactly n stars.                                  │
 * │ Row i contains (n - i) leading spaces.                              │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for alignment.                │
 * │ Step 3 : Print n stars after the spaces.                            │
 * │ Step 4 : Move to the next line after completing each row.           │
 * │ Step 5 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Geometric Pattern Generation      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → "   ****"                                                   │
 * │ Row 2 → "  ****"                                                    │
 * │ Row 3 → " ****"                                                     │
 * │ Row 4 → "****"                                                      │
 * │ Final Output Forms a Solid Rhombus                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = side length of the rhombus.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 /
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Solid_Rhombus_Pattern {                                 ║
* ║     public static void rhombus(int n) {                              ║
* ║                                                                      ║
* ║         for (int i = 1; i <= n; i++) {                               ║
* ║                                                                      ║
* ║             for (int j = 1; j <= (n - i); j++) {                     ║
* ║                 System.out.print(" ");                               ║
* ║             }                                                        ║
* ║                                                                      ║
* ║             for (int j = 1; j <= n; j++) {                           ║
* ║                 System.out.print("*");                               ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]) {                         ║
* ║         int height = 5;                                              ║
* ║         rhombus(height);                                             ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace (height = 5):                             ║
* ║                                                                      ║
* ║  Row (i) | Spaces Loop (j <= n - i) | Stars Loop (j <= n) | Output   ║
* ║  ────────|──────────────────────────|───────────────────|──────────  ║
* ║    1     |  j <= 5 - 1  (4 spaces)  |  j <= 5 (5 stars) |     *****  ║
* ║    2     |  j <= 5 - 2  (3 spaces)  |  j <= 5 (5 stars) |    *****   ║
* ║    3     |  j <= 5 - 3  (2 spaces)  |  j <= 5 (5 stars) |   *****    ║
* ║    4     |  j <= 5 - 4  (1 space)   |  j <= 5 (5 stars) |  *****     ║
* ║    5     |  j <= 5 - 5  (0 spaces)  |  j <= 5 (5 stars) | *****      ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║      *****                                                           ║
* ║     *****                                                            ║
* ║    *****                                                             ║
* ║   *****                                                              ║
* ║  *****                                                               ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - A solid rhombus is essentially a shifting square.                 ║
* ║  - The number of stars printed per row remains a constant (`n`),     ║
* ║    but leading spaces decrease linearly from `n - 1` down to 0.      ║
* ║  - This slants the block to the right, generating a transitional     ║
* ║    rhomboid geometry.                                                ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
