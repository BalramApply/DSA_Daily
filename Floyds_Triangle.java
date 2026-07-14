/* ┌─────────────────────── DSA ATTEMPTS ─────────────────────────────────┐
 * │  #1  [17/06/26] → #2  [18/06/26] → #3  [19/06/26]                    │
 * │  #4  [20/06/26] → #5  [21/06/26] → #6  [00/06/26]                    │
 * │  #7  [00/06/26] → #8  [00/06/26] → #9  [00/06/26]                    │
 * │  #10 [00/06/26]                                                      │
 * └──────────────────────────────────────────────────────────────────────┘
 * 
 * ╔══════════════════════════════════════════════════════════════════════╗
 * ║ PROBLEM 84: Print Floyd's Triangle Pattern                           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print Floyd's Triangle containing consecutive   │
 * │ natural numbers arranged in a triangular form.                      │
 * │ The first row contains 1 number, the second row contains 2 numbers, │
 * │ and so on up to n rows.                                             │
 * │ Input: Number of rows n.                                            │
 * │ Output: Floyd's Triangle pattern.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 2 3                                                                 │
 * │ 4 5 6                                                               │
 * │ 7 8 9 10                                                            │
 * │ 11 12 13 14 15                                                      │
 * │ Explanation : Consecutive numbers are printed row by row in         │
 * │ triangular format.                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ A counter variable is used to maintain consecutive numbering.       │
 * │ Row i contains exactly i numbers.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize a counter variable with value 1.                │
 * │ Step 2 : Use an outer loop to iterate through rows from 1 to n.     │
 * │ Step 3 : For each row, use an inner loop to print i numbers.        │
 * │ Step 4 : Print the current counter value and increment it.          │
 * │ Step 5 : Move to the next line after completing each row.           │
 * │ Step 6 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Floyd's Triangle                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → 1                                                           │
 * │ Row 2 → 2 3                                                         │
 * │ Row 3 → 4 5 6                                                       │
 * │ Row 4 → 7 8 9 10                                                    │
 * │ Counter continues increasing sequentially throughout the pattern.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */
public class Floyds_Triangle {
    
    
    public static void main(String args[]) {
        int height = 5;
        
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
 * ║ PROBLEM 84: Print Floyd's Triangle Pattern                           ║
 * ╚══════════════════════════════════════════════════════════════════════╝
 *
 * ┌── PROBLEM STATEMENT ────────────────────────────────────────────────┐
 * │ Given an integer n, print Floyd's Triangle containing consecutive   │
 * │ natural numbers arranged in a triangular form.                      │
 * │ The first row contains 1 number, the second row contains 2 numbers, │
 * │ and so on up to n rows.                                             │
 * │ Input: Number of rows n.                                            │
 * │ Output: Floyd's Triangle pattern.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── EXAMPLE ──────────────────────────────────────────────────────────┐
 * │ Input  : n = 5                                                      │
 * │ Output :                                                            │
 * │ 1                                                                   │
 * │ 2 3                                                                 │
 * │ 4 5 6                                                               │
 * │ 7 8 9 10                                                            │
 * │ 11 12 13 14 15                                                      │
 * │ Explanation : Consecutive numbers are printed row by row in         │
 * │ triangular format.                                                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── CONSTRAINTS ──────────────────────────────────────────────────────┐
 * │ n >= 1                                                              │
 * │ A counter variable is used to maintain consecutive numbering.       │
 * │ Row i contains exactly i numbers.                                   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── APPROACH STEPS ───────────────────────────────────────────────────┐
 * │ Step 1 : Initialize a counter variable with value 1.                │
 * │ Step 2 : Use an outer loop to iterate through rows from 1 to n.     │
 * │ Step 3 : For each row, use an inner loop to print i numbers.        │
 * │ Step 4 : Print the current counter value and increment it.          │
 * │ Step 5 : Move to the next line after completing each row.           │
 * │ Step 6 : Repeat until all rows are printed.                         │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── ALGORITHM TYPE ───────────────────────────────────────────────────┐
 * │ Pattern Printing | Nested Loops | Floyd's Triangle                  │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── DRY RUN ──────────────────────────────────────────────────────────┐
 * │ n = 4                                                               │
 * │ Row 1 → 1                                                           │
 * │ Row 2 → 2 3                                                         │
 * │ Row 3 → 4 5 6                                                       │
 * │ Row 4 → 7 8 9 10                                                    │
 * │ Counter continues increasing sequentially throughout the pattern.   │
 * └─────────────────────────────────────────────────────────────────────┘
 *
 * ┌── TIME AND SPACE COMPLEXITY ────────────────────────────────────────┐
 * │ Time Complexity  : O(n²)                                            │
 * │ Space Complexity : O(1)                                             │
 * │ where n = number of rows.                                           │
 * └─────────────────────────────────────────────────────────────────────┘
 */
/*╔══════════════════════════════════════════════════════════════════════╗
* ║ public class Floyds_Triangle {                                       ║
* ║     public static void floyd(int n) {                                ║
* ║         int counter = 1;                                             ║
* ║                                                                      ║
* ║         for (int i = 1; i <= n; i++) {  // outer loop                ║
* ║                                                                      ║
* ║             for (int j = 1; j <= i; j++) {  // inner loop            ║
* ║                 System.out.print(counter + " ");                     ║
* ║                 counter++;                                           ║
* ║             }                                                        ║
* ║             System.out.println();                                    ║
* ║         }                                                            ║
* ║     }                                                                ║
* ║                                                                      ║
* ║     public static void main(String args[]) {                         ║
* ║         floyd(5);                                                    ║
* ║     }                                                                ║
* ║ }                                                                    ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Dry Run & Execution Trace (n = 5):                                  ║
* ║                                                                      ║
* ║  Row (i) | Column Bound (j <= i) | Numbers Printed  | Next Counter   ║
* ║  ────────|───────────────────────|──────────────────|──────────────  ║
* ║    1     |  j <= 1               | 1                | 2              ║
* ║    2     |  j <= 2               | 2 3              | 4              ║
* ║    3     |  j <= 3               | 4 5 6            | 7              ║
* ║    4     |  j <= 4               | 7 8 9 10         | 11             ║
* ║    5     |  j <= 5               | 11 12 13 14 15   | 16             ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Console Output:                                                     ║
* ║  1                                                                   ║
* ║  2 3                                                                 ║
* ║  4 5 6                                                               ║
* ║  7 8 9 10                                                            ║
* ║  11 12 13 14 15                                                      ║
* ╠══════════════════════════════════════════════════════════════════════╣
* ║  Pattern Dynamics:                                                   ║
* ║  - The outer loop variable `i` determines the total lines to map.    ║
* ║  - The inner loop tracks elements per line matching the row count.   ║
* ║  - Unlike typical triangular arrays that reset tracking, Floyd's     ║
* ║    Triangle utilizes a global sequential `counter` that advances     ║
* ║    continuously with each print instruction.                         ║
* ╚══════════════════════════════════════════════════════════════════════╝
*/