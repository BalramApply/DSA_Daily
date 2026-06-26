/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [18/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 86: Print Butterfly Pattern                                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a butterfly pattern using '*' characters. │
 * │ The pattern consists of an upper half and a lower half, each having │
 * │ symmetric wings separated by spaces.                                │
 * │ Input: Number of rows n.                                            │
 * │ Output: Butterfly-shaped star pattern.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │ *        *                                                          │
 * │ **      **                                                          │
 * │ ***    ***                                                          │
 * │ ****  ****                                                          │
 * │ **********                                                          │
 * │ **********                                                          │
 * │ ****  ****                                                          │
 * │ ***    ***                                                          │
 * │ **      **                                                          │
 * │ *        *                                                          │
 * │ Explanation : The number of stars increases toward the center and   │
 * │ then decreases symmetrically, creating a butterfly shape.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Pattern consists of 2n rows.                                        │
 * │ Each row contains symmetric stars on both sides.                    │
 * │ Spaces between the wings depend on the current row number.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Print the upper half from row 1 to n.                      │
 * │ Step 2 : Print i stars on the left wing.                            │
 * │ Step 3 : Print 2 × (n - i) spaces in the middle.                    │
 * │ Step 4 : Print i stars on the right wing.                           │
 * │ Step 5 : Print the lower half from row n down to 1.                 │
 * │ Step 6 : Repeat the same logic in reverse order.                    │
 * │ Step 7 : Maintain symmetry to form the butterfly shape.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Symmetric Pattern Generation      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 3                                                               │
 * │ Row 1 → *    *                                                      │
 * │ Row 2 → **  **                                                      │
 * │ Row 3 → ******                                                      │
 * │ Row 4 → ******                                                      │
 * │ Row 5 → **  **                                                      │
 * │ Row 6 → *    *                                                      │
 * │ Final Output Forms a Butterfly Pattern                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows in one half of the butterfly.              │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Butterfly_Pattern {
    

    public static void main(String args[]) {
        int butterfly = 5;
        
    }
}
/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [18/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 86: Print Butterfly Pattern                                  ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a butterfly pattern using '*' characters. │
 * │ The pattern consists of an upper half and a lower half, each having │
 * │ symmetric wings separated by spaces.                                │
 * │ Input: Number of rows n.                                            │
 * │ Output: Butterfly-shaped star pattern.                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │ *        *                                                          │
 * │ **      **                                                          │
 * │ ***    ***                                                          │
 * │ ****  ****                                                          │
 * │ **********                                                          │
 * │ **********                                                          │
 * │ ****  ****                                                          │
 * │ ***    ***                                                          │
 * │ **      **                                                          │
 * │ *        *                                                          │
 * │ Explanation : The number of stars increases toward the center and   │
 * │ then decreases symmetrically, creating a butterfly shape.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Pattern consists of 2n rows.                                        │
 * │ Each row contains symmetric stars on both sides.                    │
 * │ Spaces between the wings depend on the current row number.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Print the upper half from row 1 to n.                      │
 * │ Step 2 : Print i stars on the left wing.                            │
 * │ Step 3 : Print 2 × (n - i) spaces in the middle.                    │
 * │ Step 4 : Print i stars on the right wing.                           │
 * │ Step 5 : Print the lower half from row n down to 1.                 │
 * │ Step 6 : Repeat the same logic in reverse order.                    │
 * │ Step 7 : Maintain symmetry to form the butterfly shape.             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Symmetric Pattern Generation      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 3                                                               │
 * │ Row 1 → *    *                                                      │
 * │ Row 2 → **  **                                                      │
 * │ Row 3 → ******                                                      │
 * │ Row 4 → ******                                                      │
 * │ Row 5 → **  **                                                      │
 * │ Row 6 → *    *                                                      │
 * │ Final Output Forms a Butterfly Pattern                              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows in one half of the butterfly.              │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════════╗
* ║ public class Butterfly_Pattern {                                         ║
* ║     public static void butterflyPattern(int n) {                         ║
* ║                                                                          ║
* ║         // 1st Half: Upper Half Matrix                                   ║
* ║         for (int i = 1; i <= n; i++) {                                   ║
* ║             for (int j = 1; j <= i; j++) System.out.print("*");          ║
* ║             for (int k = 1; k <= 2 * (n - i); k++) System.out.print(" ");║
* ║             for (int j = 1; j <= i; j++) System.out.print("*");          ║
* ║             System.out.println();                                        ║
* ║         }                                                                ║
* ║                                                                          ║
* ║         // 2nd Half: Lower Half Matrix                                   ║
* ║         for (int i = n; i >= 1; i--) {                                   ║
* ║             for (int j = 1; j <= i; j++) System.out.print("*");          ║
* ║             for (int k = 1; k <= 2 * (n - i); k++) System.out.print(" ");║
* ║             for (int j = 1; j <= i; j++) System.out.print("*");          ║
* ║             System.out.println();                                        ║
* ║         }                                                                ║
* ║     }                                                                    ║
* ║     public static void main(String args[]) {                             ║
* ║         int butterfly = 5;                                               ║
* ║         butterflyPattern(butterfly);                                     ║
* ║     }                                                                    ║
* ║ }                                                                        ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Structural Geometry Breakdown (For n = 5):                              ║
* ║                                                                          ║
* ║  Row (i)  | Left Stars (i) | Spaces (2 * (n - i)) | Right Stars (i)      ║
* ║  ─────────|────────────────|──────────────────────|─────────────────     ║
* ║   i = 1   | 1 star         | 2 * (5 - 1) = 8      | 1 star               ║
* ║   i = 2   | 2 stars        | 2 * (5 - 2) = 6      | 2 stars              ║
* ║   i = 3   | 3 stars        | 2 * (5 - 3) = 4      | 3 stars              ║
* ║   i = 4   | 4 stars        | 2 * (5 - 4) = 2      | 4 stars              ║
* ║   i = 5   | 5 stars        | 2 * (5 - 5) = 0      | 5 stars              ║
* ║  ─────────|────────────────|──────────────────────|─────────────────     ║
* ║  [Lower Half acts as a perfect vertical mirror inversion of above]       ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                         ║
* ║  *    *                                                                  ║
* ║  *** ***                                                                 ║
* ║  **** ****                                                               ║
* ║  **********                                                              ║
* ║  **********                                                              ║
* ║  **** ****                                                               ║
* ║  *** ***                                                                 ║
* ║  *     *                                                                 ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                       ║
* ║  - The row layout uses symmetric balancing split across three loops.     ║
* ║  - Spaces compress by 2 each line while star structures expand by 1.     ║
* ║  - Lower layout operates via an inverted countdown `i = n down to 1`.    ║
* ╚══════════════════════════════════════════════════════════════════════════╝
*/