/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [17/06/26] → #2  [18/06/26] → #3  [19/06/26]                    │
 * │  #4  [20/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 81: Print a Hollow Rectangle Pattern                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given the number of rows and columns, print a hollow rectangle      │
 * │ using '*' characters.                                               │
 * │ The boundary cells contain stars, while the inner cells remain      │
 * │ empty (spaces).                                                     │
 * │ Input: Total rows and total columns.                                │
 * │ Output: Hollow rectangle pattern.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : rows = 4, columns = 5                                      │
 * │ Output :                                                            │
 * │ *****                                                               │
 * │ *   *                                                               │
 * │ *   *                                                               │
 * │ *****                                                               │
 * │ Explanation : Stars are printed only on the boundary of the         │
 * │ rectangle, while inner positions are left blank.                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ rows >= 1                                                           │
 * │ columns >= 1                                                        │
 * │ Boundary positions are:                                             │
 * │ First row, last row, first column, and last column.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through each row using an outer loop.              │
 * │ Step 2 : Iterate through each column using an inner loop.           │
 * │ Step 3 : Check whether the current cell lies on the boundary.       │
 * │ Step 4 : Print '*' for boundary cells.                              │
 * │ Step 5 : Print a space for inner cells.                             │
 * │ Step 6 : Move to the next line after completing each row.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Boundary Traversal                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ rows = 4, columns = 5                                               │
 * │ Row 1 → *****                                                       │
 * │ Row 2 → *   *                                                       │
 * │ Row 3 → *   *                                                       │
 * │ Row 4 → *****                                                       │
 * │ Final Output Forms a Hollow Rectangle                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(rows × columns)                                │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Hollow_Rectangle {
    
    public static void main(String args[]){
        int row = 4;
        int col = 5;
        
    }
}
/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [17/06/26] → #2  [00/06/26] → #3  [00/06/26]                    │
 * │  #4  [00/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 81: Print a Hollow Rectangle Pattern                         ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given the number of rows and columns, print a hollow rectangle      │
 * │ using '*' characters.                                               │
 * │ The boundary cells contain stars, while the inner cells remain      │
 * │ empty (spaces).                                                     │
 * │ Input: Total rows and total columns.                                │
 * │ Output: Hollow rectangle pattern.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : rows = 4, columns = 5                                      │
 * │ Output :                                                            │
 * │ *****                                                               │
 * │ *   *                                                               │
 * │ *   *                                                               │
 * │ *****                                                               │
 * │ Explanation : Stars are printed only on the boundary of the         │
 * │ rectangle, while inner positions are left blank.                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ rows >= 1                                                           │
 * │ columns >= 1                                                        │
 * │ Boundary positions are:                                             │
 * │ First row, last row, first column, and last column.                 │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through each row using an outer loop.              │
 * │ Step 2 : Iterate through each column using an inner loop.           │
 * │ Step 3 : Check whether the current cell lies on the boundary.       │
 * │ Step 4 : Print '*' for boundary cells.                              │
 * │ Step 5 : Print a space for inner cells.                             │
 * │ Step 6 : Move to the next line after completing each row.           │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Boundary Traversal                │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ rows = 4, columns = 5                                               │
 * │ Row 1 → *****                                                       │
 * │ Row 2 → *   *                                                       │
 * │ Row 3 → *   *                                                       │
 * │ Row 4 → *****                                                       │
 * │ Final Output Forms a Hollow Rectangle                               │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(rows × columns)                                │
 * │ Space Complexity : O(1)                                             │
 * └─────────────────────────────────────────────────────────────────────┘
 */

/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Hollow_Rectangle {                                      ║
* ║     public static void hollowRectangle(int totRow, int totColumn){   ║
* ║                                                                      ║
* ║         for(int i=1; i<=totRow; i++){   // outer loop                ║
* ║                                                                      ║
* ║             for(int j=1; j<=totColumn; j++){ // inner loop           ║
* ║                                                                      ║
* ║                 if(i1 || itotRow || j1 || jtotColumn){               ║
* ║                     System.out.print("*");                           ║
* ║                 }else{                                               ║
* ║                     System.out.print(" ");                           ║
* ║                 }                                                    ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║     public static void main(String args[]){                          ║
* ║         int row = 4;                                                 ║
* ║         int col = 5;                                                 ║
* ║         hollowRectangle(row, col);                                   ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Boundary Condition Analysis (Matrix Context):                       ║
* ║                                                                      ║
* ║  An element (i, j) lies on the boundary of a rectangle if:           ║
* ║  - i == 1          -> Top edge (First Row)                           ║
* ║  - i == totRow     -> Bottom edge (Last Row)                         ║
* ║  - j == 1          -> Left edge (First Column)                       ║
* ║  - j == totColumn  -> Right edge (Last Column)                       ║
* ║                                                                      ║
* ║  If any condition evaluates to true, a star '*' is printed.          ║
* ║  Otherwise, a blank space ' ' is printed to create the hollow gap.   ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output Matrix Visualized (row=4, col=5):                    ║
* ║                                                                      ║
* ║         j=1   j=2   j=3   j=4   j=5                                  ║
* ║  i=1    * * * * * (Top Boundary)                                     ║
* ║  i=2    * * (Left & Right Only)                                      ║
* ║  i=3    * * (Left & Right Only)                                      ║
* ║  i=4    * * * * * (Bottom Boundary)                                  ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/