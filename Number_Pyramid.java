/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐*
 * │  #1  [18/06/26] → #2  [19/06/26] → #3  [20/06/26]                    │
 * │  #4  [21/06/26] → #5  [00/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 90: Print a Number Pyramid Pattern                           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a centered number pyramid pattern.        │
 * │ Each row contains the row number repeated exactly i times, where i  │
 * │ is the current row number.                                          │
 * │ Input: Height of the pyramid n.                                     │
 * │ Output: Number pyramid pattern.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     1                                                               │
 * │    2 2                                                              │
 * │   3 3 3                                                             │
 * │  4 4 4 4                                                            │
 * │ 5 5 5 5 5                                                           │
 * │ Explanation : Row i contains the number i repeated i times,         │
 * │ aligned in pyramid form using leading spaces.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains exactly i occurrences of the number i.               │
 * │ Leading spaces are used for pyramid alignment.                      │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for alignment.                │
 * │ Step 3 : Print the current row number i, repeated i times.          │
 * │ Step 4 : Add a space after each printed number for readability.     │
 * │ Step 5 : Move to the next line after completing the row.            │
 * │ Step 6 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Number Pattern                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → "   1"                                                      │
 * │ Row 2 → "  2 2"                                                     │
 * │ Row 3 → " 3 3 3"                                                    │
 * │ Row 4 → "4 4 4 4"                                                   │
 * │ Final Output Forms a Centered Number Pyramid                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = height of the pyramid.                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Number_Pyramid {
    
    public static void main(String args[]) {
        int height = 5;
        
    }
}
/* 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 90: Print a Number Pyramid Pattern                           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print a centered number pyramid pattern.        │
 * │ Each row contains the row number repeated exactly i times, where i  │
 * │ is the current row number.                                          │
 * │ Input: Height of the pyramid n.                                     │
 * │ Output: Number pyramid pattern.                                     │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │     1                                                               │
 * │    2 2                                                              │
 * │   3 3 3                                                             │
 * │  4 4 4 4                                                            │
 * │ 5 5 5 5 5                                                           │
 * │ Explanation : Row i contains the number i repeated i times,         │
 * │ aligned in pyramid form using leading spaces.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ Row i contains exactly i occurrences of the number i.               │
 * │ Leading spaces are used for pyramid alignment.                      │
 * │ Nested loops are used for pattern generation.                       │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Iterate through rows from 1 to n.                          │
 * │ Step 2 : Print (n - i) leading spaces for alignment.                │
 * │ Step 3 : Print the current row number i, repeated i times.          │
 * │ Step 4 : Add a space after each printed number for readability.     │
 * │ Step 5 : Move to the next line after completing the row.            │
 * │ Step 6 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Number Pattern                    │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → "   1"                                                      │
 * │ Row 2 → "  2 2"                                                     │
 * │ Row 3 → " 3 3 3"                                                    │
 * │ Row 4 → "4 4 4 4"                                                   │
 * │ Final Output Forms a Centered Number Pyramid                        │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = height of the pyramid.                                    │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Number_Pyramid {                                        ║
* ║     public static void numberPyramid(int n){                         ║
* ║         for(int i=1; i<=n; i++){                                     ║
* ║                                                                      ║
* ║             for(int j=1; j<=n-i; j++){                               ║
* ║                 System.out.print(" ");                               ║
* ║             }                                                        ║
* ║                                                                      ║
* ║             for(int j=1; j<=i; j++){                                 ║
* ║                 System.out.print(i+ " ");                            ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║     public static void main(String args[]) {                         ║
* ║         int height = 5;                                              ║
* ║         numberPyramid(height);                                       ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace (height = 5):                             ║
* ║                                                                      ║
* ║  Row (i) | Spaces Loop (j <= n - i) | Numbers Loop (j <= i) | Output ║
* ║  ────────|──────────────────────────|───────────────────────|────────║
* ║    1   |  j <= 5 - 1  (4 spaces)  |  j <= 1  (Prints '1 ')  |     1  ║
* ║    2   |  j <= 5 - 2  (3 spaces)  |  j <= 2  (Prints '2 ')  |    2 2 ║
* ║    3   |  j <= 5 - 3  (2 spaces)  |  j <= 3  (Prints '3 ')  |   3 3 3║
* ║    4   |  j <= 5 - 4  (1 space)   |  j <= 4  (Prints '4 ')  |  4 4 4 ║
* ║        |  j <= 5 - 5  (0 spaces)  |  j <= 5  (Prints '5 ')  | 5 5 5 5║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║      1                                                               ║
* ║     2 2                                                              ║
* ║    3 3 3                                                             ║
* ║   4 4 4 4                                                            ║
* ║  5 5 5 5 5                                                           ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - Leading spaces decrease smoothly row-by-row to center-align the   ║
* ║    pyramid layout.                                                   ║
* ║  - The value printed on any given line matches the outer loop row    ║
* ║    index `i`, maintaining uniformity across the row.                 ║
* ║  - Adding a trailing space `" "` after the digit creates the padded  ║
* ║    triangular separation structure.                                  ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/
