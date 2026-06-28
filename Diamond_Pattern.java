/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [18/06/26] → #2  [19/06/26] → #3  [20/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 89: Print a Diamond Star Pattern                             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a diamond-shaped pattern using '*'        │
 * │ characters. The pattern consists of an upper pyramid and a lower    │
 * │ inverted pyramid.                                                   │
 * │ Input: Height n of one half of the diamond.                         │
 * │ Output: Symmetric diamond star pattern.                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     *                                                               │
 * │    ***                                                              │
 * │   *****                                                             │
 * │  *******                                                            │
 * │ *********                                                           │
 * │ *********                                                           │
 * │  *******                                                            │
 * │   *****                                                             │
 * │    ***                                                              │
 * │     *                                                               │
 * │ Explanation : The upper half increases the number of stars while    │
 * │ the lower half decreases them symmetrically, forming a diamond.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Total rows printed = 2 × n.                                         │
 * │ Row i contains (n - i) leading spaces and (2 × i - 1) stars.        │
 * │ Pattern is horizontally symmetric.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Print the upper half from row 1 to n.                      │
 * │ Step 2 : For each row, print (n - i) leading spaces.                │
 * │ Step 3 : Print (2 × i - 1) stars to form the pyramid.               │
 * │ Step 4 : Move to the next line after completing the row.            │
 * │ Step 5 : Print the lower half from row n down to 1.                 │
 * │ Step 6 : Repeat the same logic to create the inverted pyramid.      │
 * │ Step 7 : Combine both halves to form the complete diamond.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Symmetric Pattern Generation      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 3                                                               │
 * │ Upper Half:                                                         │
 * │ Row 1 → "  *"                                                       │
 * │ Row 2 → " ***"                                                      │
 * │ Row 3 → "*****"                                                     │
 * │ Lower Half:                                                         │
 * │ Row 3 → "*****"                                                     │
 * │ Row 2 → " ***"                                                      │
 * │ Row 1 → "  *"                                                       │
 * │ Final Output Forms a Diamond Pattern                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = height of one half of the diamond.                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Diamond_Pattern {
    
    

    public static void main(String args[]) {
        int height = 5;
        
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
 * ║ PROBLEM 89: Print a Diamond Star Pattern                             ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a diamond-shaped pattern using '*'        │
 * │ characters. The pattern consists of an upper pyramid and a lower    │
 * │ inverted pyramid.                                                   │
 * │ Input: Height n of one half of the diamond.                         │
 * │ Output: Symmetric diamond star pattern.                             │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     *                                                               │
 * │    ***                                                              │
 * │   *****                                                             │
 * │  *******                                                            │
 * │ *********                                                           │
 * │ *********                                                           │
 * │  *******                                                            │
 * │   *****                                                             │
 * │    ***                                                              │
 * │     *                                                               │
 * │ Explanation : The upper half increases the number of stars while    │
 * │ the lower half decreases them symmetrically, forming a diamond.     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Total rows printed = 2 × n.                                         │
 * │ Row i contains (n - i) leading spaces and (2 × i - 1) stars.        │
 * │ Pattern is horizontally symmetric.                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Print the upper half from row 1 to n.                      │
 * │ Step 2 : For each row, print (n - i) leading spaces.                │
 * │ Step 3 : Print (2 × i - 1) stars to form the pyramid.               │
 * │ Step 4 : Move to the next line after completing the row.            │
 * │ Step 5 : Print the lower half from row n down to 1.                 │
 * │ Step 6 : Repeat the same logic to create the inverted pyramid.      │
 * │ Step 7 : Combine both halves to form the complete diamond.          │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Symmetric Pattern Generation      │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 3                                                               │
 * │ Upper Half:                                                         │
 * │ Row 1 → "  *"                                                       │
 * │ Row 2 → " ***"                                                      │
 * │ Row 3 → "*****"                                                     │
 * │ Lower Half:                                                         │
 * │ Row 3 → "*****"                                                     │
 * │ Row 2 → " ***"                                                      │
 * │ Row 1 → "  *"                                                       │
 * │ Final Output Forms a Diamond Pattern                                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = height of one half of the diamond.                        │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════════╗
* ║ public class Diamond_Pattern {                                           ║
* ║     public static void diamondP(int n) {                                 ║
* ║                                                                          ║
* ║         // 1st Half: Upper Pyramid                                       ║
* ║         for (int i = 1; i <= n; i++) {                                   ║
* ║             for (int j = 1; j <= n - i; j++) System.out.print(" ");      ║
* ║             for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");║
* ║             System.out.println();                                        ║
* ║         }                                                                ║
* ║                                                                          ║
* ║         // 2nd Half: Inverted Lower Pyramid                              ║
* ║         for (int i = n; i >= 1; i--) {                                   ║
* ║             for (int j = 1; j <= n - i; j++) System.out.print(" ");      ║
* ║             for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");║
* ║             System.out.println();                                        ║
* ║         }                                                                ║
* ║     }                                                                    ║
* ║     public static void main(String args[]) {                             ║
* ║         int height = 5;                                                  ║
* ║         diamondP(height);                                                ║
* ║     }                                                                    ║
* ║ }                                                                        ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Mathematical & Structural Breakdown (For n = 5):                        ║
* ║                                                                          ║
* ║  Row (i)  | Spaces Loop (n - i)    | Stars Loop (2 * i - 1)              ║
* ║  ─────────|────────────────────────|───────────────────────────────      ║
* ║   i = 1   | 5 - 1 = 4 spaces       | 2 * (1) - 1 = 1 star                ║
* ║   i = 2   | 5 - 2 = 3 spaces       | 2 * (2) - 1 = 3 stars               ║
* ║   i = 3   | 5 - 3 = 2 spaces       | 2 * (3) - 1 = 5 stars               ║
* ║   i = 4   | 5 - 4 = 1 space        | 2 * (4) - 1 = 7 stars               ║
* ║   i = 5   | 5 - 5 = 0 spaces       | 2 * (5) - 1 = 9 stars               ║
* ║  ─────────|────────────────────────|───────────────────────────────      ║
* ║  [Lower Half mirrors this exactly, counting down from i = 5 to 1]        ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                         ║
* ║      *                                                                   ║
* ║     ***                                                                  ║
* ║    *****                                                                 ║
* ║   *******                                                                ║
* ║  *********                                                               ║
* ║  *********                                                               ║
* ║   *******                                                                ║
* ║    *****                                                                 ║
* ║     ***                                                                  ║
* ║      *                                                                   ║
* ╠══════════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                       ║
* ║  - The geometric shape relies on the arithmetic series `2 * i - 1`       ║
* ║    to guarantee that an odd number of stars is rendered on each line.    ║
* ║  - Because the lower tracking variable begins at `n` and counts down,    ║
* ║    the center line (`*********`) prints twice, forming a perfectly       ║
* ║    symmetrical 10-row diamond matrix.                                    ║
* ╚══════════════════════════════════════════════════════════════════════════╝
*/
