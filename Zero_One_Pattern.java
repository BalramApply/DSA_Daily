/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [17/06/26] → #2  [18/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 85: Print 0-1 Triangle Pattern                               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a 0-1 triangle pattern.                   │
 * │ For each position (i, j), print 1 if (i + j) is even; otherwise     │
 * │ print 0.                                                            │
 * │ Input: Number of rows n.                                            │
 * │ Output: Triangular pattern consisting of 0s and 1s.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 0 1                                                                 │
 * │ 1 0 1                                                               │
 * │ 0 1 0 1                                                             │
 * │ 1 0 1 0 1                                                           │
 * │ Explanation : A cell contains 1 when the sum of its row and column  │
 * │ indices is even; otherwise it contains 0.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains exactly i elements.                                  │
 * │ Pattern value depends on the parity of (i + j).                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : For each row, iterate through columns from 1 to i.         │
 * │ Step 3 : Calculate (i + j) and check whether it is even or odd.     │
 * │ Step 4 : Print 1 if even; otherwise print 0.                        │
 * │ Step 5 : Move to the next line after completing each row.           │
 * │ Step 6 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Parity-Based Pattern              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → 1                                                           │
 * │ Row 2 → 0 1                                                         │
 * │ Row 3 → 1 0 1                                                       │
 * │ Row 4 → 0 1 0 1                                                     │
 * │ Final Output Forms a 0-1 Triangle Pattern                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */

public class Zero_One_Pattern {
    
    public static void main(String args[]) {
           int height = 5;
      }
}
/*
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 85: Print 0-1 Triangle Pattern                               ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a 0-1 triangle pattern.                   │
 * │ For each position (i, j), print 1 if (i + j) is even; otherwise     │
 * │ print 0.                                                            │
 * │ Input: Number of rows n.                                            │
 * │ Output: Triangular pattern consisting of 0s and 1s.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 0 1                                                                 │
 * │ 1 0 1                                                               │
 * │ 0 1 0 1                                                             │
 * │ 1 0 1 0 1                                                           │
 * │ Explanation : A cell contains 1 when the sum of its row and column  │
 * │ indices is even; otherwise it contains 0.                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains exactly i elements.                                  │
 * │ Pattern value depends on the parity of (i + j).                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : For each row, iterate through columns from 1 to i.         │
 * │ Step 3 : Calculate (i + j) and check whether it is even or odd.     │
 * │ Step 4 : Print 1 if even; otherwise print 0.                        │
 * │ Step 5 : Move to the next line after completing each row.           │
 * │ Step 6 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Parity-Based Pattern              │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → 1                                                           │
 * │ Row 2 → 0 1                                                         │
 * │ Row 3 → 1 0 1                                                       │
 * │ Row 4 → 0 1 0 1                                                     │
 * │ Final Output Forms a 0-1 Triangle Pattern                           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Zero_One_Pattern {                                      ║
* ║     public static void zeroOne(int n){                               ║
* ║         for (int i = 1; i <= n; i++){                                ║
* ║             for (int j = 1; j <= i; j++){                            ║
* ║                 if ((i + j) % 2 == 0){                               ║
* ║                     System.out.print("1" + " ");                     ║
* ║                 }else{                                               ║
* ║                     System.out.print("0" + " ");                     ║
* ║                 }                                                    ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║     public static void main(String args[]) {                         ║
* ║         int height = 5;                                              ║
* ║         zeroOne(height);                                             ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Matrix Index Sum Logic Visualized (i + j):                          ║
* ║                                                                      ║
* ║  Row (i) | Col (j=1) | Col (j=2) | Col (j=3)  |Col (j=4) | Col (j=5) ║
* ║  ────────|───────────|───────────|───────────|───────────|───────────║
* ║   i = 1  | 1+1=2 (1) |           |           |           |           ║
* ║   i = 2  | 2+1=3 (0) | 2+2=4 (1) |           |           |           ║
* ║   i = 3  | 3+1=4 (1) | 3+2=5 (0) | 3+3=6 (1) |           |           ║
* ║   i = 4  | 4+1=5 (0) | 4+2=6 (1) | 4+3=7 (0) | 4+4=8 (1) |           ║
* ║   i = 5  | 5+1=6 (1) | 5+2=7 (0) | 5+3=8 (1) | 5+4=9 (0) | 5+5=10(1) ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  1                                                                   ║
* ║  0 1                                                                 ║
* ║  1 0 1                                                               ║
* ║  0 1 0 1                                                             ║
* ║  1 0 1 0 1                                                           ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - The row index (`i`) and column index (`j`) alternate parity.      ║
* ║  - When the sum of the coordinates `(i + j)` is Even, it prints `1`. ║
* ║  - When the sum of the coordinates `(i + j)` is Odd, it prints `0`.  ║
* ║  - This creates a grid alignment similar to a chessboard design.     ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/