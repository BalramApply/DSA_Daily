/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [18/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 88: Print a Hollow Rhombus Pattern                           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a hollow rhombus using '*' characters.    │
 * │ The boundary of the rhombus is formed using stars, while the inner  │
 * │ area remains empty. Leading spaces are used to create the rhombus   │
 * │ shape.                                                              │
 * │ Input: Side length n of the rhombus.                                │
 * │ Output: Hollow rhombus pattern.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     *****                                                           │
 * │    *   *                                                            │
 * │   *   *                                                             │
 * │  *   *                                                              │
 * │ *****                                                               │
 * │ Explanation : Stars are printed only on the boundary positions of   │
 * │ the rhombus while inner positions contain spaces.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Boundary positions are: first row, last row, first column, and      │
 * │ last column within the rhombus.                                     │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for alignment.                │
 * │ Step 3 : Iterate through columns from 1 to n.                       │
 * │ Step 4 : Check if the current position lies on the boundary.        │
 * │ Step 5 : Print '*' for boundary cells, otherwise print a space.     │
 * │ Step 6 : Move to the next line after completing each row.           │
 * │ Step 7 : Repeat until the hollow rhombus is fully printed.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Boundary Traversal                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → "   ****"                                                   │
 * │ Row 2 → "  *  *"                                                    │
 * │ Row 3 → " *  *"                                                     │
 * │ Row 4 → "****"                                                      │
 * │ Boundary cells contain stars, inner cells contain spaces.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = side length of the rhombus.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Hollow_Rhombus {
    

    public static void main(String args[]) {
        int height=5;
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 88: Print a Hollow Rhombus Pattern                           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a hollow rhombus using '*' characters.    │
 * │ The boundary of the rhombus is formed using stars, while the inner  │
 * │ area remains empty. Leading spaces are used to create the rhombus   │
 * │ shape.                                                              │
 * │ Input: Side length n of the rhombus.                                │
 * │ Output: Hollow rhombus pattern.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     *****                                                           │
 * │    *   *                                                            │
 * │   *   *                                                             │
 * │  *   *                                                              │
 * │ *****                                                               │
 * │ Explanation : Stars are printed only on the boundary positions of   │
 * │ the rhombus while inner positions contain spaces.                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Boundary positions are: first row, last row, first column, and      │
 * │ last column within the rhombus.                                     │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for alignment.                │
 * │ Step 3 : Iterate through columns from 1 to n.                       │
 * │ Step 4 : Check if the current position lies on the boundary.        │
 * │ Step 5 : Print '*' for boundary cells, otherwise print a space.     │
 * │ Step 6 : Move to the next line after completing each row.           │
 * │ Step 7 : Repeat until the hollow rhombus is fully printed.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Boundary Traversal                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → "   ****"                                                   │
 * │ Row 2 → "  *  *"                                                    │
 * │ Row 3 → " *  *"                                                     │
 * │ Row 4 → "****"                                                      │
 * │ Boundary cells contain stars, inner cells contain spaces.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = side length of the rhombus.                               │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Hollow_Rhombus {                                        ║
* ║     public static void hollowRhombus(int n) {                        ║
* ║                                                                      ║
* ║         for (int i = 1; i <= n; i++) {                               ║
* ║                                                                      ║
* ║             for (int j = 1; j <= (n - i); j++) {                     ║
* ║                 System.out.print(" ");                               ║
* ║             }                                                        ║
* ║                                                                      ║
* ║             for (int j = 1; j <= n; j++) {                           ║
* ║                                                                      ║
* ║                 if (i == 1 || i == n || j == 1 || j == n) {          ║
* ║                     System.out.print("*");                           ║
* ║                 } else {                                             ║
* ║                     System.out.print(" ");                           ║
* ║                 }                                                    ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]) {                         ║
* ║         int height = 5;                                              ║
* ║         hollowRhombus(height);                                       ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Symmetric Matrix & Boundary Evaluation (height = 5):                ║
* ║                                                                      ║
* ║  - Leading spaces loop `(j <= n - i)` slants the structure rightward.║
* ║  - Inside the star loop, a boundary condition filters hollow gaps:   ║
* ║    i == 1  (Top edge)    OR  i == n  (Bottom edge)                   ║
* ║    j == 1  (Left edge)   OR  j == n  (Right edge)                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output Visualization:                                       ║
* ║                                                                      ║
* ║      ***** (Row i=1 -> All Stars)                                    ║
* ║     *   * (Row i=2 -> Outer Boundaries Only)                         ║
* ║    *   * (Row i=3 -> Outer Boundaries Only)                          ║
* ║   *   * (Row i=4 -> Outer Boundaries Only)                           ║
* ║  ***** (Row i=5 -> All Stars)                                        ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - Combines the structural offset logic of a Solid Rhombus with the  ║
* ║    internal empty spatial filtering logic of a Hollow Rectangle.     ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
